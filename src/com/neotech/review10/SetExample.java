package com.neotech.review10;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
	Set<String> africaLinked = new LinkedHashSet<String>();
	  
	 africaLinked.add("Morocco") ; 
	 africaLinked.add("Cameron");
	 africaLinked.add("Tunisa");
	 africaLinked.add("Egypt");
	
	
	africaLinked.add("Algera");
	
	System.out.println(africaLinked);
	System.out.println(africaLinked.size());
	
	Set<String> africaHash = new HashSet<String>(africaLinked);
	
	System.out.println(africaHash);
	
	Set<String> africaTree = new TreeSet<String>(africaHash);
	
	 africaTree.addAll(africaLinked); // same as line 32
	
	 System.out.println(africaTree);
	
	
	for(String country :africaTree) {
		
		System.out.print(country + " ");
		
	}
	System.out.println( " \n");
	
	Iterator<String>itCountry = africaTree.iterator();
	
	while (itCountry.hasNext()) {
		String cnt =  itCountry.next();
		System.out.print(cnt + " " );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
