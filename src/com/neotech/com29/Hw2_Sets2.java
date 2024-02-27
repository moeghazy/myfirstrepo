package com.neotech.com29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Homework 2:
   // Create a Set of cities in which you want to make sure that insertion order is maintained
   // . Using Iterator remove any city that starts with “A”;
    
public class Hw2_Sets2 {

	public static void main(String[] args) {
		
         Set<String> cities = new LinkedHashSet<String>();
	
	      cities.add("Alexandria");
	      cities.add("Bagdad");
	      cities.add("athens");
	      cities.add("ankara");
	      cities.add("france");
	      cities.add("london");
	  	System.out.println(cities);
	
	Iterator<String> iterator = cities .iterator();
	
	
	while (iterator.hasNext() ) {
		
		String A = iterator.next();
		
		if(A.startsWith("A") || A .startsWith("a")) {
			
		      iterator.remove();
		}
	      
	
	}System.out.print(cities);
	
	System.out.println();
	
	for (String city : cities) {
		
		System.out.print(city + " ,");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
