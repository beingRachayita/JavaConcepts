package com.learning.streams;

import java.util.stream.IntStream;

public class JavaStreamsLearning {
	
	public static void main(String[] args) {
		//to print one to 10. The end index is excluded
		//IntStream.range(1, 11).forEach(x->System.out.println(x));
		//to first 5 elements
		IntStream.range(1, 11).skip(5).forEach(x->System.out.println(x));
	}

}
