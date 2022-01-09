package com.learning.cloneable;

public class Student implements Cloneable {

	private int id;
	private String name;
	private CoursesDeepClone course;

	
	public CoursesDeepClone getCourse() {
		return course;
	}

	public void setCourse(CoursesDeepClone course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */
	
	public Object clone() throws CloneNotSupportedException {
		Student stud = (Student) super.clone();
		stud.course =(CoursesDeepClone) course.clone();
		return stud;
	}
}
