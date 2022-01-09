package com.learning.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapsStream {

	public static void main(String[] args) {
		 Map<Integer, String> HOSTING = new HashMap<>();
	        HOSTING.put(1, "linode.com");
	        HOSTING.put(2, "heroku.com");
	        HOSTING.put(3, "digitalocean.com");
	        HOSTING.put(4, "aws.amazon.com");

	        String result = HOSTING.entrySet().stream().filter(x-> "aws.amazon.com".equals(x.getValue())).map(x->x.getValue()).collect(Collectors.joining());
	        System.out.println(result);
	        
	        result = HOSTING.entrySet().stream().filter(x->!x.getValue().contains("amazon")?true:false).map(x->x.getValue()).collect(Collectors.joining(", "));
	        System.out.println(result);
	        
	        Map<Integer, String> temp= HOSTING.entrySet().stream().filter(x-> x.getKey()<=3).collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
	        System.out.println(temp);
	        
	        Map<Integer, String> temp2= HOSTING.entrySet().stream().filter(x->x.getKey()==2).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	        System.out.println(temp2);
	}

}
