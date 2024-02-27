package com.neotech.com28;

import java.util.ArrayList;

public class ArrrayList_Hw {

	public static void main(String[] args) {

		/**
		 * Homework 1: Create an arrayList of drinks. If any drink has letter "a" or "e"
		 * replace it with water.
		 **/

		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("Rd Bull");
		drinks.add("pepsi");
		drinks.add("Ice Tea");
		drinks.add("rootBr");
		drinks.add("Gingir");
		drinks.add("noono");

		for (String ele : drinks) {
			if (ele.contains("e") || ele.contains("a")) {
				ele = "Water";
			}
			System.out.print(ele + "--*--");
		}

	}

}
