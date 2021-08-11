package com.learning.diamondProblem;

public class AppDemo {

	public static void main(String[] args) {
		Interface1 a = new ChildClass();
		a.display();//Display
		a.method1();//Inside Child
		
		Interface2 b = new ChildClass();
		b.method1();//Inside Child
		
		
		Interface3 c = new ChildClass1();
		c.display(); //Inside Child Class
		c.method1(); //Inside Interface 1
		
		Interface4 d = new ChildClass1();
		d.method1(2); //Inside Interface 2
		
		ChildClass2 e = new ChildClass2();
		e.display(); //Inside Base Class
		
		Interface5 f = new ChildClass2();
		f.display(); //Inside Base Class
		
	}

}
