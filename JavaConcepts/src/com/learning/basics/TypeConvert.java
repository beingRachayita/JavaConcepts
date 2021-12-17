package com.learning.basics;

/*
 * In this class we are learning how to convert between various data types
 * */
public class TypeConvert {

	public static void main(String[] args) {

		// String to int or Integer
		System.out.println("=======String to Int=========");
		String st1 = "123";
		int a = Integer.parseInt(st1); // return int
		System.out.println(a);

		Integer b = Integer.valueOf(st1); // returns Integer
		System.out.println(b);

		System.out.println("=======Int to String=========");
		// int to String
		String s1 = String.valueOf(a); // This can be used with both primitive or Object
		System.out.println(s1);

		String s2 = a + ""; // This can be used for both
		System.out.println(s2);

		String si = Integer.toString(a); // this can be used for Primitive type conversion to String
		System.out.println(si);

		String s = b.toString(); // This can only be used with Objects
		System.out.println(s);

		System.out.println("=======String to long=========");
		// String to long or Long
		String st2 = "23344342";
		long c = Long.parseLong(st2);
		System.out.println(c); // primitive

		Long d = Long.valueOf(st2);
		System.out.println(d); // Object

		System.out.println("=======long to String=========");
		String s3 = String.valueOf(c);
		System.out.println(s3);

		// String s4 = d.toString();
		// String s4 = c+"";
		String s4 = Long.toString(c);
		System.out.println(s4);

		System.out.println("=======String to float=========");
		// String to long or Long
		String st3 = "23344.342";
		float e = Float.parseFloat(st3);
		System.out.println(e); // primitive

		Float f = Float.valueOf(st3);
		System.out.println(f); // Object

		System.out.println("=======float to String=========");
		String s5 = String.valueOf(e);
		System.out.println(s5);

		String s6 = f.toString();
		System.out.println(s6);

		System.out.println("=======String to Double=========");
		String st4 = "123.4567";
		double g = Double.parseDouble(st4);
		System.out.println(g); // primitive

		Double h = Double.valueOf(st4);
		System.out.println(h); // Object

		System.out.println("=======Double to String=========");
		String s7 = String.valueOf(g);
		System.out.println(s7);

		// String s8 = h.toString();
		String s8 = Double.toString(g);
		System.out.println(s8);

		System.out.println("=======String to char=========");
		String st7 = "a";
		char k = st7.charAt(0);
		System.out.println(k); // primitive

		System.out.println("=======char to String=========");
		String s9 = String.valueOf(k);
		System.out.println(s9);
		
		String s10 = Character.toString(k);
		System.out.println(s10);
		
		String s11 = k+"";
		System.out.println(s11);

		
		
		System.out.println("=======int to binaryString=========");
		int i = 255;
		String binary = Integer.toBinaryString(i);
		System.out.println(binary);

		System.out.println("=======binaryString to int=========");
		int binary2 = Integer.parseInt(binary);
		System.out.println(binary2);
		
		System.out.println("=======String to Boolean=========");
		String trueStr = "true";
		String falseStr = "false";
		String randomStr = "java";

		System.out.println(Boolean.parseBoolean(trueStr)); //true
		System.out.println(Boolean.valueOf(falseStr)); //false
		System.out.println(Boolean.parseBoolean(randomStr)); //false, anything but true or false will return false
		
		System.out.println("=======NumberFormatException=========");
		try {
			String exeStr = "14c";
			int exeInt = Integer.parseInt(exeStr);
			System.out.println(exeInt);
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
