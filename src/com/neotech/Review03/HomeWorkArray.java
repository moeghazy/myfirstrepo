package com.neotech.Review03;

public class HomeWorkArray {

	public static void main(String[] args) {

		// HOMEWORK:
		// Create an array of cars and store 6 elements into it,
		// print all value from the array

		String[] cars = { "AUDI", "BMW", "BENS", "TOYOTA", " HONDA" };

		for (int Ary = 0; Ary < cars.length; Ary++) {

			System.out.print(cars[Ary] + " - ");

		} System.out.println("<><><><><><><><><>");

  // second task :
 //create an array of integers and calculate the sum of all element,
	
	
	int [] ary ={ 20, 40, 60, 80, 100, };
	
	   int total = 0;
	 for( int M = 0 ; M < ary.length; M++) {
		 total += ary [M];
		 
	 } System.out.println("the total of the Array is " +  total );
	
	
	}

}
