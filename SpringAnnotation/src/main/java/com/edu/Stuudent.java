package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class Stuudent {
	@Autowired
	private Course cs;

	public Course getCs() {
		return cs;
	}

	public void setCs(Course cs) {
		this.cs = cs;
	}
	public void CourseConfig() {
		System.out.println(" course- CSE MECH EEE ECE CIVIL");
		cs.details();
	}

}
