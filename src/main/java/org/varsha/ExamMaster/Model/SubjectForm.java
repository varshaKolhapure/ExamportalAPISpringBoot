package org.varsha.ExamMaster.Model;

public class SubjectForm {
	
	private Long sub_no;
	private String sub_name;
	
	
	public Long getSub_no() {
		return sub_no;
	}
	public void setSub_no(Long sub_no) {
		this.sub_no = sub_no;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	
	public SubjectForm(Long sub_no, String sub_name) {
		super();
		this.sub_no = sub_no;
		this.sub_name = sub_name;
	}
	
	public SubjectForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
  }
