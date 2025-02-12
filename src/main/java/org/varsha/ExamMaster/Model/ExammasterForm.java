package org.varsha.ExamMaster.Model;

import java.sql.Date;

public class ExammasterForm {
	private long exam_no;
	private String exam_name;
	private Date exam_date;
	private long total_question;
	private long passing_marks;
	private long sub_no;
	private String sub_name;
	private String flag;
	
	public long getExam_no() {
		return exam_no;
	}
	public void setExam_no(long exam_no) {
		this.exam_no = exam_no;
	}
	public String getExam_name() {
		return exam_name;
	}
	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}
	public Date getExam_date() {
		return exam_date;
	}
	public void setExam_date(Date exam_date) {
		this.exam_date = exam_date;
	}
	public long getTotal_question() {
		return total_question;
	}
	public void setTotal_question(long total_question) {
		this.total_question = total_question;
	}
	public long getPassing_marks() {
		return passing_marks;
	}
	public void setPassing_marks(long passing_marks) {
		this.passing_marks = passing_marks;
	}
	public long getSub_no() {
		return sub_no;
	}
	public void setSub_no(long sub_no) {
		this.sub_no = sub_no;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public ExammasterForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExammasterForm(long exam_no, String exam_name, Date exam_date, long total_question, long passing_marks,
			long sub_no, String sub_name, String flag) {
		super();
		this.exam_no = exam_no;
		this.exam_name = exam_name;
		this.exam_date = exam_date;
		this.total_question = total_question;
		this.passing_marks = passing_marks;
		this.sub_no = sub_no;
		this.sub_name = sub_name;
		this.flag = flag;
	}
	
}
