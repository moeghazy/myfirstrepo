package com.neotech.Lesson12;

public class PracticForArrayAndEnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 5, 15, 20, 30, 50 };

		int total = 0;

		for (int i = 0; i < numbers.length; i++) {

			total += numbers[i];

		}

	System.out.println("the total is :" + total);
	
	//second way;
	
	int sum = 0;
	
	for(int i : numbers) {
		
		sum += i ;
		 
	}
	System.out.println("the total is :"  +sum);
	
	
	
	
	
	
	
	}

}
