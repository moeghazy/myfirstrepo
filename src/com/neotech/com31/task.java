package com.neotech.com31;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Map<String ,Integer > city = new TreeMap<String, Integer>();
	
	city.put("alexandria", 1);
	city.put("cairo", 4);
	city.put("london", 5);
	
	Set <Entry<String , Integer>> cities = city.entrySet();
	
	
	for (Entry<String , Integer> M : cities ) {
		
		if (M .getValue() >7) {
		city.remove(M.getKey());	
		}
	}System.out.println(city);
	
	
	
	
	}

}
