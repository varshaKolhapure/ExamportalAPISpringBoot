package org.varsha.ExamMaster.Model;

public class QuestionForm {
	private long sr_no;
	private long exam_no;
	private long question_no;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String right_Ans;
	private long marks;
	
	public long getSr_no() {
		return sr_no;
	}
	public void setSr_no(long sr_no) {
		this.sr_no = sr_no;
	}
	public long getExam_no() {
		return exam_no;
	}
	public void setExam_no(long exam_no) {
		this.exam_no = exam_no;
	}
	public long getQuestion_no() {
		return question_no;
	}
	public void setQuestion_no(long question_no) {
		this.question_no = question_no;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getRight_Ans() {
		return right_Ans;
	}
	public void setRight_Ans(String right_Ans) {
		this.right_Ans = right_Ans;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	
	public QuestionForm(long sr_no, long exam_no, long question_no, String question, String option1, String option2,
			String option3, String option4, String right_Ans, long marks) {
		super();
		this.sr_no = sr_no;
		this.exam_no = exam_no;
		this.question_no = question_no;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.right_Ans = right_Ans;
		this.marks = marks;
	}
	public QuestionForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
