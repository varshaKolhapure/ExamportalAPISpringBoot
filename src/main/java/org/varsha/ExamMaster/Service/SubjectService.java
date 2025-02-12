package org.varsha.ExamMaster.Service;

import java.util.List;

import org.varsha.ExamMaster.Model.SubjectForm;

public interface SubjectService {
	List<SubjectForm> getSubjectListService();
	SubjectForm getSub_noSerevice(Long sub_no);
	
	void insertSubService(SubjectForm subjectForm);
	void updateSubService(SubjectForm subjectForm);
	void deleteSubService(Long sub_no);
	Long maxOfSubjectService();
  }

