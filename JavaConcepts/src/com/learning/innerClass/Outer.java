package com.learning.innerClass;

public class Outer{
	
	AnnonymousInnerClass in = new AnnonymousInnerClass(){
		void show(){
			super.show();
			System.out.println("I am inside Annonymous sub class");
		}
	};
	
	
	TestInterface test = new TestInterface() {
		
		@Override
		public void display() {
			System.out.println("I am an implementation of Test Interface");
			
		}
	};
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.in.show();
		
		o.test.display();
	}
}
