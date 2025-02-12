package org.varsha.ExamMaster.Dao.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.varsha.ExamMaster.Dao.SubjectDao;
import org.varsha.ExamMaster.Extractor.SubjectExtractor;
import org.varsha.ExamMaster.Extractor.SubjectListExtractor;
import org.varsha.ExamMaster.Model.SubjectForm;

@Repository
public class SubjectDaoImpl implements SubjectDao {
	@Autowired
	 private JdbcTemplate jdbcTemplate; 
	@Autowired
	 private SubjectExtractor subjectExtractor;
	@Autowired
	private SubjectListExtractor subjectListExtractor;	
	
	
	public SubjectDaoImpl(JdbcTemplate jdbcTemplate, SubjectExtractor subjectExtractor,
			SubjectListExtractor subjectListExtractor) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.subjectExtractor = subjectExtractor;
		this.subjectListExtractor = subjectListExtractor;
	}

	public SubjectDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public List<SubjectForm> getSubjectList() {
		List<SubjectForm> SubjectList=jdbcTemplate.query("Select * from Subject",subjectListExtractor::extractData);
		return SubjectList;
	}

	@Override
	public SubjectForm getSub_no(Long sub_no) {
		SubjectForm sf=jdbcTemplate.query("select * from Subject where sub_no="+sub_no,subjectExtractor::extractData);
		return sf;
	}

	@Override
	public void insertSubject(SubjectForm subjectForm) {
		String query ="insert into Subject values("+subjectForm.getSub_no()+",'"+subjectForm.getSub_name()+"')";
		jdbcTemplate.update(query);
	}

	@Override
	public void updateSubject(SubjectForm subjectForm) {
		String query ="update Subject set sub_name='"+subjectForm.getSub_name()+"'where sub_no="+subjectForm.getSub_no();
		jdbcTemplate.update(query);
		
	}

	@Override
	public void deleteSubject(Long sub_no) {
		String query ="delete from Subject where sub_no="+sub_no;
		jdbcTemplate.update(query);
		
	}

	@Override
	public Long maxOfSubject() {
		Long maximum = jdbcTemplate.queryForObject("select max (sub_no) maximum from subject ", Long.class);
		if(maximum !=0) {
			return maximum;
		}
		return null;
	}
	
}
