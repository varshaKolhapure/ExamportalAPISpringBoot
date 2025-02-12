package org.varsha.ExamMaster.Service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.varsha.ExamMaster.Dao.SubjectDao;
import org.varsha.ExamMaster.Model.SubjectForm;
import org.varsha.ExamMaster.Service.SubjectService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SubjectServiceImpl  implements SubjectService {
	@Autowired
	private SubjectDao subjectDao;

	@Override
	public List<SubjectForm> getSubjectListService() {
		List<SubjectForm> subjectList=subjectDao.getSubjectList();
		return subjectList;
	}

	@Override
	public SubjectForm getSub_noSerevice(Long sub_no) {
		SubjectForm sf =subjectDao.getSub_no(sub_no);
		return sf;
	}

	@Override
	public void insertSubService(SubjectForm subjectForm) {
		subjectDao.insertSubject(subjectForm);
	}

	@Override
	public void updateSubService(SubjectForm subjectForm) {
		subjectDao.updateSubject(subjectForm);
		
	}

	@Override
	public void deleteSubService(Long sub_no) {
		subjectDao.deleteSubject(sub_no);
		
	}

	@Override
	public Long maxOfSubjectService() {
		Long a = subjectDao.maxOfSubject();
		return a;
	}
  }

