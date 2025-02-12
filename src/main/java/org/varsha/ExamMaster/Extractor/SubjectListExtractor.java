package org.varsha.ExamMaster.Extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.varsha.ExamMaster.Model.SubjectForm;


@Component
public class SubjectListExtractor implements ResultSetExtractor<List<SubjectForm>>{

	@Override
	public List<SubjectForm> extractData(ResultSet rs) throws SQLException, DataAccessException {
		   List<SubjectForm> subjectList=new ArrayList<SubjectForm>();
		       SubjectForm sf=null;
		       
		       while(rs.next()) {
		    	   sf = new SubjectForm();
		    	   sf.setSub_no(rs.getLong("sub_no"));
		    	   sf.setSub_name(rs.getString("sub_name"));
		    	   subjectList.add(sf);
		    }
		       return subjectList;
	    }
}



