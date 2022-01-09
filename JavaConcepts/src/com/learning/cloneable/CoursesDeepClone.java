package com.learning.cloneable;

public class CoursesDeepClone implements Cloneable {
	
	String subject1;
	String subject2;
	String subject3;
	
	
	public String getSubject1() {
		return subject1;
	}


	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}


	public String getSubject2() {
		return subject2;
	}


	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}


	public String getSubject3() {
		return subject3;
	}


	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}


	public CoursesDeepClone(String subject1, String subject2, String subject3) {
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}