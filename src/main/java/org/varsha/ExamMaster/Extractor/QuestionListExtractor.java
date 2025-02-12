package org.varsha.ExamMaster.Extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.varsha.ExamMaster.Model.QuestionForm;
@Component
public class QuestionListExtractor implements ResultSetExtractor<List<QuestionForm>>{

	@Override
	public List<QuestionForm> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<QuestionForm> questionList = new ArrayList<>();
		QuestionForm qf = null;
		while(rs.next()) {
			qf = new QuestionForm();
			qf.setSr_no(rs.getLong("sr_no"));
			qf.setExam_no(rs.getLong("exam_no"));
			qf.setQuestion_no(rs.getLong("question_no"));
			qf.setQuestion(rs.getString("question"));
			qf.setOption1(rs.getString("option1"));
			qf.setOption2(rs.getString("option2"));
			qf.setOption3(rs.getString("option3"));
			qf.setOption4(rs.getString("option4"));
			qf.setRight_Ans(rs.getString("right_Ans"));
			qf.setMarks(rs.getLong("marks"));
			questionList.add(qf);

		}
		return questionList;
	}

}
