package org.varsha.ExamMaster.Dao;

import java.util.List;

import org.varsha.ExamMaster.Model.ExammasterForm;

public interface ExamMasterDao {
	List<ExammasterForm> getExammasterList();
	ExammasterForm getExamExam_no(Long exam_no);
	
	void insertExammaster(ExammasterForm exammasterForm);
	void updateExammaster(ExammasterForm exammasterForm);
	void deleteExammaster(Long exam_no);
	Long maxOfExammaster();

}
