package com.learning.cloneable;

public class AppDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		//Course course = new Courses("Math", "Physics", "Chemistry");
		CoursesDeepClone course = new CoursesDeepClone("Math", "Physics", "Chemistry");
		Student s1 = new Student();
		s1.setId(111);
		s1.setName("Hero");
		s1.setCourse(course);
		Student s2 = (Student)s1.clone();
		
		s2.setName("Another hero");
		
		System.out.println(s1.getName()+" "+s2.getName());
		
		s2.getCourse().setSubject1("Biology");

		System.out.println(s1.getCourse().getSubject1());
		System.out.println(s2.getCourse().getSubject1());
	}

}
