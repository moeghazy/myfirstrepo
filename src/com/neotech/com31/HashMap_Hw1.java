package com.neotech.com31;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Homework 1: Create a Map that will store Employee name and salary. Write a
 * logic to retrieve an employee who gets the highest salary. Output should be
 * in the below format - John Smith=$100000
 **/
public class HashMap_Hw1 {

	public static void main(String[] args) {

		Map<String, Integer> EmploInfo = new HashMap<>();

		EmploInfo.put("Nidaa", 150000);
		EmploInfo.put("Scott", 140000);
		EmploInfo.put("Batu", 190000);
		EmploInfo.put("Gena", 150000);
		EmploInfo.put("Ulku", 250000);

		Set<Entry<String, Integer>> empo = EmploInfo.entrySet();

		int topSalary = 0 ;
		String empoName = " ";

		for (Entry<String, Integer> $ : empo) {
			if ($.getValue() > topSalary) {
				topSalary = $.getValue();
				empoName = $.getKey();
			}

		}
		System.out.println("The Highest Salary Employee is ----> " + empoName + " In Amount Of " +  topSalary );

	}

}
