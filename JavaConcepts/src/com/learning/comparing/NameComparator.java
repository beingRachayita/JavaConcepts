package com.learning.comparing;

import java.util.Comparator;

public class NameComparator implements Comparator<Movies> {

	@Override
	public int compare(Movies arg0, Movies arg1) {
		
		return arg0.getName().compareTo(arg1.getName());
	}

}
