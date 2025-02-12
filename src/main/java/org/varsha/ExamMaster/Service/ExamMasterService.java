package org.varsha.ExamMaster.Service;

import java.util.List;

import org.varsha.ExamMaster.Model.ExammasterForm;

public interface ExamMasterService {
	List<ExammasterForm> getExammasterListService();
	ExammasterForm getExamExam_noService(Long exam_no);
	
	void insertExammasterService(ExammasterForm exammasterForm);
	void updateExammasterService(ExammasterForm exammasterForm);
	void deleteExammasterService(Long exam_no);
     Long maxOfExammasterService();
}
