package com.neotech.Review04;

import java.util.Scanner;

public class StringHw_2 {

	public static void main(String[] args) {
		
		/* Write a program that reads two parent's first names and if they expecting boy or girl?
		    Based on the input suggests a name for a baby:
		    If it is a boy get half from dad and half from mom.
		    If it is a girl get half from mom and half from dad.

		        Example Output:
		            Mom's first name? Mary
		            Dad's first name? Daniel
		            Boy or Girl? boy
		            Suggested baby name: DANRY
		       */ 
	
	    Scanner intake = new Scanner(System.in);
	
		String dadName , momName , gender , babyName = "";
	   
		System.out.println("please enter your dad's name : ");
	    dadName = intake.nextLine ();
	
	    System.out.println("please enter your mom's name : ");
	     momName = intake.nextLine ();
		
	    System.out.println("please enter baby's gender : ");
	     gender =intake.nextLine ();
	
	
	if (gender .equals("male")) {
		 babyName = dadName.substring(0,2).concat (momName .substring(0, 2));
		 System.out.println(babyName);
	 
	 }else if (gender .equals("female")) {
		 babyName = momName .substring(0, 2)
				                     .concat(dadName.substring(0, 2));
		 
		 System.out.println(babyName);
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
