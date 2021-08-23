package com.learning.innerClass;

public class MethodLocalInnerClass {
	
	int y =1;
	void outerMethod(){
		int x=2;
		System.out.println("Inside Outer class Method " + x+" "+y);
		class Inner{
			//int x=3;
			void innerMethod(){
				System.out.println("Inside Inner class " +x+" "+y);
			}
		}
		
		Inner in = new Inner();
		in.innerMethod();
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClass outer = new MethodLocalInnerClass();
		outer.outerMethod(); 
	}
}
