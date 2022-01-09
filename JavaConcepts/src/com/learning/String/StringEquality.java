package com.learning.String;

public class StringEquality {

	public static void main(String[] args) {
		
		/*In this case, JVM creates a String Literal in String Constant pool. 
		It will also create a normal object in non pool Heap memory and assign it to S*/
		String s = new String("Welcome");
		
		//In this case the Object is already in the String Constant pool and JVM will just return the reference to S2 & S3
		String s2 = "Welcome"; 
		String s3 = "Welcome";
		
		String s4=s;
		
		System.out.println(s==s4);//true
		
		/**
		 * This updating the String for S4 will create a new object thus the next time you check s==s4 it will say false	
		 */
		s4+=" World";
		/*
		 * == operator compares the reference of the Object 
		 * equals() method compares the values equality
		 */
		System.out.println(s4);//welcome world
		System.out.println(s);//welcome
		System.out.println(s==s2);//false
		System.out.println(s2==s3);//true
		System.out.println(s==s4);//false
		System.out.println(s.equals(s2));//true
		System.out.println(s3.equals(s2));//true
		System.out.println(s.equals(s4));//true
		
		
	}

}
