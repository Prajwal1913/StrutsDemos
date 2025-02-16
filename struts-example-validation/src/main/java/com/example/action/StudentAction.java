package com.example.action;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.example.model.Student;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/WEB-INF/content/")
@Action(value = "/studregister", results = { 
		@Result(name = "success", location = "studsuccess.jsp"),
		@Result(name="input", location = "studform.jsp"),
		@Result(name="error", location = "studform.jsp")

})
public class StudentAction extends ActionSupport {
	private static final long serialVersionUID = 1l;
	private Student student;
	private List<String> hobbies;
	
	

	public StudentAction() {
		hobbies = Arrays.asList("sports","music");
	}
	
	

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = Arrays.asList("sports", "music");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	@Action(value = "studform",results= {
			@Result(name="none",location="/WEB-INF/content/studform.jsp")
	})
	public String studForm() {
		return NONE;
	}



	@Override
	public void validate() {
	if(student!=null) {
		if(student.getStudentName().length()<=0)
			addFieldError("student.studentName", "Student name is required");
		if(student.getCity().length()<=0)
			addFieldError("student.city", "City is required");
		if(student.getAge()<20 || student.getAge()>70)
			addFieldError("student.age", "student age should be in between 21 and 50");
		if(student.getAllowance()<=0)
			addFieldError("student.allowance", "Allowance is required");
	}
	}
	
	
}
