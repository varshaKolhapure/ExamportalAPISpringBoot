package org.varsha.ExamMaster.Dao;

import java.util.List;

import org.varsha.ExamMaster.Model.SubjectForm;

public interface SubjectDao {
	List<SubjectForm> getSubjectList();
    SubjectForm getSub_no(Long sub_no);
	
	void insertSubject(SubjectForm subjectForm);
	void updateSubject(SubjectForm subjectForm);
	void deleteSubject(Long sub_no);
	Long maxOfSubject();
  }
