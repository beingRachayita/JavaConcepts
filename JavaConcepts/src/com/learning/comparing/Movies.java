package com.learning.comparing;


public class Movies implements Comparable<Movies> {
	
	private String name;
	private double ratings;
	private int year;
	
	
	
	public Movies(String name, double ratings, int year) {
		this.name = name;
		this.ratings = ratings;
		this.year = year;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getRatings() {
		return ratings;
	}


	public void setRatings(double ratings) {
		this.ratings = ratings;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Movies [name=" + name + ", ratings=" + ratings + ", year=" + year + "]";
	}


	/**
	 * returns -1, 0, or 1 to say if it is less than, equal, or greater to the other. 
	 * It uses this result to then determine if they should be swapped for their sort.
	 */
	@Override
	public int compareTo(Movies m) {
		return this.year-m.year;
	}

}
