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
import org.varsha.ExamMaster.Model.ExammasterForm;
import org.varsha.ExamMaster.Service.ExamMasterService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("exammaster")
@CrossOrigin("*")
@AllArgsConstructor
public class ExamMasterController {
	@Autowired
		private ExamMasterService examMasterService;
	
	
	@GetMapping
	public List<ExammasterForm> getExamMasterServiceCtrl(){
		List<ExammasterForm> examList = examMasterService.getExammasterListService();
		return examList;		
	}
	
	@GetMapping("/max")
	public  Long maxOfExamNo() {
		Long a = examMasterService.maxOfExammasterService();
		return a + 1;
	}
	
	@GetMapping("/{exam_no}")
	public ExammasterForm getExamExam_noServiceCtrl(@PathVariable(value = "exam_no")long exam_no) {
		ExammasterForm emf = examMasterService.getExamExam_noService(exam_no);
		return emf;
	}
		
	@PostMapping
	public void insertExamCtrl(@RequestBody ExammasterForm exammasterForm) {
		examMasterService.insertExammasterService(exammasterForm);
		
	}
	
	@PutMapping
	public void updateExamCtrl(@RequestBody ExammasterForm exammasterForm) {
		examMasterService.updateExammasterService(exammasterForm);
	}
	
	@DeleteMapping("/{exam_no}")
	public void deleteExamCtrl(@PathVariable(value = "exam_no")long exam_no) {
		examMasterService.deleteExammasterService(exam_no);
	}

}
