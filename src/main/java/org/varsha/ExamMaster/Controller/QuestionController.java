package org.varsha.ExamMaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.varsha.ExamMaster.Model.QuestionForm;
import org.varsha.ExamMaster.Service.QuestionService;

@RestController
@RequestMapping("exam_question_details")
@CrossOrigin("*")
public class QuestionController {
	@Autowired
	private QuestionService questionService;
	
//	@GetMapping
//	public List<QuestionForm>getQuestionServiceCtrl(){
//		List<QuestionForm> questionList=questionService.getQuestionListService();
//	    return questionList;
//	}
	@GetMapping("/max/{exam_no}")
	public  Long maxOfQuestion(@PathVariable(value = "exam_no")Long exam_no) {
		Long a = questionService.maxOfQuestionService(exam_no);
		return a + 1;
	}
	@GetMapping("/max")
	public  Long maxOfQuestion() {
		Long a = questionService.maxOfExamQuestionDetail();
		return a + 1;
	}
	
//	@GetMapping("/{sr_no}")
//	public QuestionForm getQuestionIdServiceCtrl(@PathVariable(value = "sr_no")long sr_no) {
//		QuestionForm qf=questionService.getQuestionIdService(sr_no);
//		return qf;
//    }
//	
	@PostMapping
	private void insertQuestionCtrl(@RequestBody QuestionForm questionForm) {
		questionService.insertQuestionService(questionForm);

	}
//	@PutMapping
//	private void updateQuestionCtrl(@RequestBody QuestionForm questionForm) {
//		questionService.updateQuestionService(questionForm);
//
//	}
//	@DeleteMapping("/{sr_no}")
//	private void deleteQuestionCtrl(@PathVariable(value = "sr_no")long sr_no) {
//		questionService.deleteQuestionService(sr_no);
//
//	}

}
