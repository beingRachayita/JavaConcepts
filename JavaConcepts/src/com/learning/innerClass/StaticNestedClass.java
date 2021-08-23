package com.learning.innerClass;

public class StaticNestedClass {
	
	int x=1;
	
	static int y =2;
	
	private static void outerMethod() {
		System.out.println("I am in the Outer Static method");
	}
	
	private void method() {
		System.out.println("I am in the method of outer class");
	}
	
	static class inner{
		
		void innerMethod(){
			System.out.println("Inside inner Method");
		}
		
		static void inMethod(){
			System.out.println("Inside inner static method");
		}
		
		public static void main(String[] args) {
			
			inner in = new inner();
			System.out.println("Inside Inner class method: Main");
			//innerMethod(); As it is not static can't access without Inner class object
			in.innerMethod();
			inMethod();
			outerMethod();
			
			//method(); //cannot call it as this method is not static
			//System.out.println(x); // can't access as x is not static
			System.out.println(y);
			StaticNestedClass outer = new StaticNestedClass();
			
			outer.method();
			System.out.println(outer.x);
			
		}
	}
}
