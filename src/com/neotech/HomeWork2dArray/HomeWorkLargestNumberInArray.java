package com.neotech.HomeWork2dArray;

public class HomeWorkLargestNumberInArray {

	public static void main(String[] args) {
		
	
	// Create an array of integer and calculate 
	
	 int [] digits = {18 ,69 , 1236, 657, 333 };
	
	
	int greatestnum = digits [0] ;
	
	for( int i = 0; i < digits.length; i++) {
		
	       if ( digits [i]> greatestnum) {
		  
		  greatestnum = digits [i];
	  }
	
	
	       
	
	}System.out.println( "the largest number is -----> " + greatestnum );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
