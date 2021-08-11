package com.learning.diamondProblem;

public interface Interface3 {
	public void display();
	default void method1(){
		System.out.println("Inside Interface 1");
	}
}
