package com.learning.comparing;

import java.util.Comparator;

public class YearCompareDesc implements Comparator<Movies> {

	/**
	 * returns -1, 0, or 1 to say if it is less than, equal, or greater to the other. 
	 * It uses this result to then determine if they should be swapped for their sort.
	 * 
	 * To Sort any object in descending order, we need to return -1 for greater and 1 for less than to reverse the sorting process
	 */
	
	@Override
	public int compare(Movies arg0, Movies arg1) {
		int diff = arg0.getYear()-arg1.getYear();
		if(diff>0) {
			return -1;
		}else if(diff<0) {
			return 1;
		}else {
			return diff;
		}
	}

}
