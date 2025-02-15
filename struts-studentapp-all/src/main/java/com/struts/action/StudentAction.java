package com.struts.action;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;

public class StudentAction extends ActionSupport{

	private Student student;
	private List<String> hobbies;
	
	public StudentAction() {
		hobbies = Arrays.asList("sports","music","photography","cooking");
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String showStudForm() {
		return NONE;
	}

	@Override
	public String execute() throws Exception {
		if(student.getName().equals("prajwal"))
			return "success";
		return INPUT;
	}

	public String studForm() {
		return NONE;
	}

}
