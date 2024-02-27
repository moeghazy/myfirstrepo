package com.neotech.com31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Homework 3: Create a collection of integers in which you can keep duplicates.
 * Write a logic to find sum of all integers
 **/

public class HashM_Hw3 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList();

		nums.add(10);
		nums.add(40);
		nums.add(60);
		nums.add(80);
		nums.add(70);
		// First Way Index for loop
		int sum = 0;

		for (int i = 0; i < nums.size(); i++) {

			sum += nums.get(i);
		}
		System.out.println(sum + "\n");

		// second way Index for each loop
		int sumttl = 0;

		for (Integer total : nums) {

			sumttl += total;
		}
		System.out.println(sum);

		Iterator<Integer> numbers = nums.iterator();
		while (numbers.hasNext()) {
			Integer integer = numbers.next();

			System.out.print(integer);

		}

	}
}
