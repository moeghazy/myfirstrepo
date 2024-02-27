package com.neotech.Lesson12;

public class ArrayLargestnumbers {

	public static void main(String[] args) {

		// find the largest number in the array

		int[] numbers = { -5, 15, 175, 32, 89, 23 };

		int largest = numbers[0];

		for (int num : numbers) {

			if (num > largest) {

				largest = num;

			}
		}
		System.out.println(largest);
        System.out.println();
		
        // second way using index for loop
  
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] > max) {
                 max = numbers[i];
			
			}
			 
		}
		System.out.println(max);
	}

}
