package org.varsha.ExamMaster.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.varsha.ExamMaster.Dao.QuestionDao;
import org.varsha.ExamMaster.Model.QuestionForm;
import org.varsha.ExamMaster.Service.QuestionService;
@Service
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	private QuestionDao questionDao;
	
	public QuestionServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionServiceImpl(QuestionDao questionDao) {
		super();
		this.questionDao = questionDao;
	}

//	@Override
//	public List<QuestionForm> getQuestionListService() {
//		List<QuestionForm> questionList=questionDao.getQuestionList();
//       return questionList;
//	}
//
//	@Override
//	public QuestionForm getQuestionIdService(long sr_no) {
//		QuestionForm qf = questionDao.getQuestionId(sr_no);
//		return qf;
//	}

	@Override
	public void insertQuestionService(QuestionForm questionForm) {
		questionDao.insertQuestion(questionForm);
		
	}

	@Override
	public Long maxOfQuestionService(Long exam_no) {
		Long a = questionDao.maxOfQuestion(exam_no);
		return a;
	}

	@Override
	public Long maxOfExamQuestionDetail() {
		Long a = questionDao.maxOfExamQuestionDetail();
		return a;
	}

//	@Override
//	public void updateQuestionService(QuestionForm questionForm) {
//		questionDao.updateQuestion(questionForm);
//		
//	}
//
//	@Override
//	public void deleteQuestionService(long sr_no) {
//		questionDao.deleteQuestion(sr_no);
//		
//	}

}
