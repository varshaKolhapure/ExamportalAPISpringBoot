package org.varsha.ExamMaster.Dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.varsha.ExamMaster.Dao.QuestionDao;
import org.varsha.ExamMaster.Extractor.QuestionIdExtractor;
import org.varsha.ExamMaster.Extractor.QuestionListExtractor;
import org.varsha.ExamMaster.Model.QuestionForm;
@Repository
public class QuestionDaoImpl implements QuestionDao {
	@Autowired
	private QuestionListExtractor questionListExtractor;
	@Autowired
	private QuestionIdExtractor questionIdExtractor;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public QuestionDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionDaoImpl(QuestionListExtractor questionListExtractor, QuestionIdExtractor questionIdExtractor,
			JdbcTemplate jdbcTemplate) {
		super();
		this.questionListExtractor = questionListExtractor;
		this.questionIdExtractor = questionIdExtractor;
		this.jdbcTemplate = jdbcTemplate;
	}

//	@Override
//	public List<QuestionForm> getQuestionList() {
//       List<QuestionForm> questionList =jdbcTemplate.query("select * from exam_question_details", questionListExtractor::extractData);
//    return questionList;
//	}
//
//	@Override
//	public QuestionForm getQuestionId(long sr_no) {
//		QuestionForm qf=jdbcTemplate.query("select * from exam_question_details where sr_no="+sr_no, questionIdExtractor::extractData);
//		return qf;
//	}

	@Override
	public void insertQuestion(QuestionForm questionForm) {
      String query ="insert into exam_question_details values("+questionForm.getSr_no()+","
      		+ ""+questionForm.getExam_no()+","
    	    +questionForm.getQuestion_no()+","
    		+ "'"+questionForm.getQuestion()+"',"
    		+ "'"+questionForm.getOption1()+"',"
    		+ "'"+questionForm.getOption2()+"',"
    		+ "'"+questionForm.getOption3()+"',"
    		+ "'"+questionForm.getOption4()+"',"
    		+ "'"+questionForm.getRight_Ans()+"',"
    		+ ""+questionForm.getMarks()+")";	
        jdbcTemplate.update(query);
	}

	@Override
	public Long maxOfQuestion(Long exam_no) {
		Long maximum = jdbcTemplate.queryForObject("select max (question_no) maximum from exam_question_details where exam_no = "+exam_no, Long.class);
		if(maximum !=0) {
			return maximum;
		}
		return null;
	}

	@Override
	public Long maxOfExamQuestionDetail() {
		Long maximum = jdbcTemplate.queryForObject("select max (sr_no) maximum from exam_question_details", Long.class);
		if(maximum !=0) {
			return maximum;
		}
		return null;
	}
	

//	@Override
//	public void updateQuestion(QuestionForm questionForm) {
//		String query ="update exam_question_details set exam_no="+questionForm.getExam_no()+","
//				+ "question_no="+questionForm.getQuestion_no()+","
//				+ " question='"+questionForm.getQuestion()+"',"
//				+ "option1='"+questionForm.getOption1()+"',"
//				+ "option2='"+questionForm.getOption2()+"',"
//				+ "option3='"+questionForm.getOption3()+"',"
//				+ "option4='"+questionForm.getOption4()+"',"
//				+ "right_Ans='"+questionForm.getRight_Ans()+"',"
//				+ "marks="+questionForm.getMarks()+" where sr_no="+questionForm.getSr_no();
//	      jdbcTemplate.update(query);
//
//	}
//
//	@Override
//	public void deleteQuestion(long sr_no) {
//		String query ="delete from exam_question_details where sr_no="+sr_no;
//		jdbcTemplate.update(query);
//
//	}

}
