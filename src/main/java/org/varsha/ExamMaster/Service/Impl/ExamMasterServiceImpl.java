package org.varsha.ExamMaster.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.varsha.ExamMaster.Dao.ExamMasterDao;
import org.varsha.ExamMaster.Model.ExammasterForm;
import org.varsha.ExamMaster.Service.ExamMasterService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ExamMasterServiceImpl implements ExamMasterService {
	@Autowired
	private ExamMasterDao examMasterDao;

	public ExamMasterServiceImpl(ExamMasterDao examMasterDao) {
		super();
		this.examMasterDao = examMasterDao;
	}

	public ExamMasterServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ExammasterForm> getExammasterListService() {
		List<ExammasterForm> examList=examMasterDao.getExammasterList();
		return examList;
	}

	@Override
	public ExammasterForm getExamExam_noService(Long exam_no) {
		 ExammasterForm emf =examMasterDao.getExamExam_no(exam_no);
		return emf;
	}

	@Override
	public void insertExammasterService(ExammasterForm exammasterForm) {
		examMasterDao.insertExammaster(exammasterForm);
		
	}

	@Override
	public void updateExammasterService(ExammasterForm exammasterForm) {
	  examMasterDao.updateExammaster(exammasterForm);
		
	}

	@Override
	public void deleteExammasterService(Long exam_no) {
		examMasterDao.deleteExammaster(exam_no);
		
	}

	@Override
	public Long maxOfExammasterService() {
		Long a = examMasterDao.maxOfExammaster();
		return a;
	}
	

}
