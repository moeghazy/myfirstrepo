package com.neotech.com29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Homework 1:
	  // Create a Set collection in which you need to add names of the countries. 
	   //In this set we want all objects to be sorted in alphabetical order.
	  // Using 2 different ways retrieve all elements from set.
	   
	public class Hw_Sets {

       public static void main(String[] args) {
		
	      Set<String> countries = new TreeSet<>();
       
	      countries.add("Egypt");
	      countries.add("Egypt");
	      countries.add("Turkey");
	      countries.add("Iraq");
	      countries.add("America");
	      countries.add("Canada");
	      countries.add("France");
       
       System.out.println(countries);
      
       System.out.println("/////////////////////////////////"); 
       // Enhanced for Each loop
       for(String country : countries) {
    	   System.out.print(country + " * " );
       }
       
       System.out.println("\n/////////////////////////////////");
       
       Iterator <String> iterator = countries.iterator();
         
            while ( iterator.hasNext()) {
        	
        	  String  str = iterator.next();
        	  System.out.print(str + " -&- ");
          
            }
       
       
       
       
       
       
       
       
       
       
       
       }



}
