package com.neotech.com31;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task_2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("moe",12345);
		map.put("Elion",123456);
		map.put("Scott",1234567);
		map.put("Saed",12345678);

		Set<Entry<String, Integer>> m = map.entrySet();

		for (Entry<String, Integer> map1 : m) {
		
		
			System.out.println(map1.getKey()+ " - "+  map1.getValue());
			
		}	//System.out.println();
			

	  Iterator<Entry<String, Integer>> it = m.iterator();
	
		while(it.hasNext()) {
			Entry<String, Integer>  k= it.next();
		System.out.print(k + " ");
		}
		
		
		//System.out.println();

	}

	
		
	}	
	


