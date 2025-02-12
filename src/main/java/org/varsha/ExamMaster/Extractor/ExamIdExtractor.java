package org.varsha.ExamMaster.Extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.varsha.ExamMaster.Model.ExammasterForm;
@Component
public class ExamIdExtractor implements ResultSetExtractor<ExammasterForm>{

	@Override
	public ExammasterForm extractData(ResultSet rs) throws SQLException, DataAccessException {
		ExammasterForm emf = null;
				if(rs.next()) {
					emf= new ExammasterForm();
					emf.setExam_no(rs.getLong("exam_no"));
					emf.setExam_name(rs.getString("exam_name"));
					emf.setExam_date(rs.getDate("exam_date"));
					emf.setTotal_question(rs.getLong("total_question"));
					emf.setPassing_marks(rs.getLong("passing_marks"));
					emf.setSub_no(rs.getLong("sub_no"));
					emf.setFlag(rs.getString("flag"));
					//emf.setSub_name(rs.getString("sub_name"));					
				}
				return emf;
         	}
}
