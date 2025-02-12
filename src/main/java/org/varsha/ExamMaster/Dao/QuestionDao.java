package org.varsha.ExamMaster.Dao;

import java.util.List;

import org.varsha.ExamMaster.Model.QuestionForm;

public interface QuestionDao {
//	List<QuestionForm> getQuestionList();
//	QuestionForm getQuestionId(long sr_no);
//	
	void insertQuestion(QuestionForm questionForm);
//	void updateQuestion(QuestionForm questionForm);
//	void deleteQuestion(long sr_no);
	Long maxOfQuestion(Long exam_no);
	Long maxOfExamQuestionDetail();

	

}
