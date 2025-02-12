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
import org.varsha.ExamMaster.Model.SubjectForm;
import org.varsha.ExamMaster.Service.SubjectService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("subject")
@CrossOrigin("*")
public class SubjectController {
		@Autowired
	private SubjectService subjectService;
		
		@GetMapping
		public List<SubjectForm> getSubjectListCtrl(){
			List<SubjectForm> SubjectList=subjectService.getSubjectListService();
			return SubjectList;
			}
		
		@GetMapping("/max")
		public  Long maxOfSubjectNo() {
			Long a = subjectService.maxOfSubjectService();
			return a + 1;
		}
		
		@GetMapping("/{sub_no}")
		public SubjectForm getSubjectSub_noCtrl(@PathVariable(value="sub_no")Long sub_no) {
			SubjectForm sf= subjectService.getSub_noSerevice(sub_no);
			return sf;
		}
		@PostMapping
		public void insertsubjeCtrl(@RequestBody SubjectForm subjectForm) {
			subjectService.insertSubService(subjectForm);
		}
		@PutMapping
		public void updatesubjectCtrl(@RequestBody SubjectForm subjectForm) {
			subjectService.updateSubService(subjectForm);			
		}
		@DeleteMapping("/{sub_no}")
		public void deleteSubjectCtrl(@PathVariable(value="sub_no")Long sub_no) {
			subjectService.deleteSubService(sub_no);
		}
     }

