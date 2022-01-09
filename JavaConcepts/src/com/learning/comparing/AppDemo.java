package com.learning.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppDemo {

	public static void main(String[] args) {
		List<Movies> movies = new ArrayList<>();
		movies.add(new Movies("A Beautiful Mind", 4.3, 1990));
		movies.add(new Movies("A Walk To remember", 4.5, 2000));
		movies.add(new Movies("Eternal Sunshine", 3.3, 2012));
		movies.add(new Movies("Hello Brother", 2.3, 1998));
		movies.add(new Movies("Oh My God!", 4.9, 2015));
	
		//Before Sorting
		for(Movies m: movies) {
			System.out.println(m.toString());
		}
		
		//After Comparable Sorting
		Collections.sort(movies);
		System.out.println("===========Sort by Year==============");
		for(Movies m: movies) {
			System.out.println(m.toString());
		}
		
		
		System.out.println("=====================Comparators===================");
		
		System.out.println();
		System.out.println("=====================Sort by Name===================");
		NameComparator names = new NameComparator();
		Collections.sort(movies, names);
		
		for(Movies m: movies) {
			System.out.println(m.toString());
		}
		
		System.out.println();
		System.out.println("=====================Sort by Ratings===================");
		Comparator<Movies> ratings = new Comparator<Movies>() {

			@Override
			public int compare(Movies arg0, Movies arg1) {
				return (int)(arg0.getRatings()- arg1.getRatings());
			}
		};
		
		Collections.sort(movies, ratings);
		
		for(Movies m: movies) {
			System.out.println(m.toString());
		}
		
		System.out.println("=====================Sort by Years Desc===================");
		YearCompareDesc years = new YearCompareDesc();
		Collections.sort(movies, years);
		for(Movies m: movies) {
			System.out.println(m.toString());
		}
		
	}

}
