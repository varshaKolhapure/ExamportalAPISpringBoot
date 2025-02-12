package org.varsha.ExamMaster.Extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.varsha.ExamMaster.Model.SubjectForm;

@Component
public class SubjectExtractor implements ResultSetExtractor <SubjectForm>{

	@Override
	public SubjectForm extractData(ResultSet rs) throws SQLException, DataAccessException {
		    SubjectForm sf=null;
		    
		    while(rs.next()) {
		    	sf=new SubjectForm();
		    	sf.setSub_no(rs.getLong("sub_no"));
		    	sf.setSub_name(rs.getString("sub_name"));
		    }
		    return sf;
	  }
 }
