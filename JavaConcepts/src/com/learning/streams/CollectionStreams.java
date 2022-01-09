package com.learning.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreams {

	public static void main(String[] args) {
		List<Integer> movements = new ArrayList<>();
		movements.add(100);
		movements.add(-200);
		movements.add(300);
		movements.add(5000);
		movements.add(-1000);
		movements.add(-600);
		
		List<Integer> Deposits = movements.stream().filter(mov -> mov>0).collect(Collectors.toList());

		/*
		 * for(Integer i: Deposits) { System.out.println(i); }
		 */
		
		Integer sumDeposits = movements.stream().filter(mov-> mov>0).reduce(0, (acc, mov)-> acc+mov);
		
		//System.out.println(sumDeposits);
		
		int[] arr = {20,30,40,50,70,80};
		
		Arrays.stream(arr).forEach(x-> System.out.println(x));
		
		int sum = Arrays.stream(arr).reduce(0, (acc, mov)->acc+mov);
		
		System.out.println(sum);
		
	}
	

}
