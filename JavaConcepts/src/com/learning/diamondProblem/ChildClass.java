package com.learning.diamondProblem;

public class ChildClass implements Interface1, Interface2 {

	@Override
	public void display() {
		System.out.println("Display");
	}
	
	@Override
	public void method1(){
		System.out.println("Inside child");
		
	}
	
	
}

