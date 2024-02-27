package com.neotech.Review06;

public class Replace_Demo {

	public static void main(String[] args) {

		String longString = "I am very happy today because today is not Monday";

		String anotherString = longString.replace('a', 'e');

		System.out.println(anotherString);

		anotherString = longString.replace("today", "tomorrow");

		System.out.println(anotherString);

		anotherString = longString.replaceAll("[a-z]", "*");

		System.out.println(anotherString);

	}

}
