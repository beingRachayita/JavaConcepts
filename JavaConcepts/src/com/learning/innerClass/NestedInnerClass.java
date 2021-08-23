package com.learning.innerClass;

public class NestedInnerClass {
	
	private int a=1;

	class inner{
		NestedInnerClass outer = new NestedInnerClass();
		int a=2;
		public void show(){
			System.out.println("inside Inner class");
		}
		
		public void display(){
			System.out.println("Outer class variable: "+outer.a);
			System.out.println("Inner class variable: "+ a);
		}
	}
	
	public void display(){
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		NestedInnerClass outer = new NestedInnerClass();
		//NestedInnerClass.inner in = new NestedInnerClass().new inner();
		inner in = outer.new inner();
		in.show();
		in.display();
		
		outer.display();
	}
}
