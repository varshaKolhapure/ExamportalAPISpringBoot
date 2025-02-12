package org.varsha.ExamMaster.Service;

import java.util.List;

import org.varsha.ExamMaster.Model.QuestionForm;

public interface QuestionService {
//	List<QuestionForm> getQuestionListService();
//	QuestionForm getQuestionIdService(long sr_no);
//	
	void insertQuestionService(QuestionForm questionForm);
//	void updateQuestionService(QuestionForm questionForm);
//	void deleteQuestionService(long sr_no);
	Long maxOfQuestionService(Long exam_no);
	Long maxOfExamQuestionDetail();
}
