package org.varsha.ExamMaster.Dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.varsha.ExamMaster.Dao.ExamMasterDao;
import org.varsha.ExamMaster.Extractor.ExamIdExtractor;
import org.varsha.ExamMaster.Extractor.ExamListExtractor;
import org.varsha.ExamMaster.Model.ExammasterForm;
@Repository
public class ExamMasterDaoImpl implements ExamMasterDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private ExamListExtractor examListExtractor;
	@Autowired
	private ExamIdExtractor examIdExtractor;
	
	public ExamMasterDaoImpl(JdbcTemplate jdbcTemplate, ExamListExtractor examListExtractor,
			ExamIdExtractor examIdExtractor) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.examListExtractor = examListExtractor;
		this.examIdExtractor = examIdExtractor;
	}
	public ExamMasterDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<ExammasterForm> getExammasterList() {
		//List<ExammasterForm> examList=jdbcTemplate.query("select * from exammaster", examListExtractor::extractData);
		List<ExammasterForm> examList=jdbcTemplate.query("select *, subject.sub_name as sub_name from exammaster join subject on exammaster.sub_no =  subject.sub_no",examListExtractor::extractData);

		return examList;
	}
	
	@Override
	public ExammasterForm getExamExam_no(Long exam_no) {
		ExammasterForm emf = jdbcTemplate.query("select * from exammaster where exam_no ="+exam_no, examIdExtractor::extractData);
		return emf;
	}
	
	@Override
	public Long maxOfExammaster() {
		Long maximum = jdbcTemplate.queryForObject("select max (exam_no) maximum from exammaster ", Long.class);
		if(maximum !=0) {
			return maximum;
		}
		return null;
	}
	
	@Override
	public void insertExammaster(ExammasterForm exammasterForm) {		
		//String query ="insert into exammaster values((select max(exam_no)+1 from exammaster), '"+exammasterForm.getExam_name()+"','"+exammasterForm.getExam_date()+"',"+exammasterForm.getTotal_question()+","+exammasterForm.getPassing_marks()+","+exammasterForm.getSub_no()+")";
		String query ="insert into exammaster values("+exammasterForm.getExam_no()+",'"+exammasterForm.getExam_name()+"','"+exammasterForm.getExam_date()+"',"+exammasterForm.getTotal_question()+","+exammasterForm.getPassing_marks()+","+exammasterForm.getSub_no()+",'"+exammasterForm.getFlag()+"')";
		jdbcTemplate.execute(query);
	}
	
	@Override
	public void updateExammaster(ExammasterForm exammasterForm) {
		String query ="update exammaster set exam_name='"+exammasterForm.getExam_name()+"' ,exam_date='"+exammasterForm.getExam_date()+"', total_question="+exammasterForm.getTotal_question()+", passing_marks="+exammasterForm.getPassing_marks()+",flag='"+exammasterForm.getFlag()+"', sub_no="+exammasterForm.getSub_no()+" where exam_no="+exammasterForm.getExam_no();
		jdbcTemplate.update(query);
	}
	
	@Override
	public void deleteExammaster(Long exam_no) {
		String query ="delete from exammaster where exam_no="+exam_no;
		jdbcTemplate.execute(query);
	}
	

	
}
