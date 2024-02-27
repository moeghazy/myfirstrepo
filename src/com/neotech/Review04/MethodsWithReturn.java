package com.neotech.Review04;

public class MethodsWithReturn {

	public static void main(String[] args) {

		String name = "mohamed";
		int numberOfChars = name.length();

		System.out.println("the length of the string is ---> " + numberOfChars);

		MethodsWithReturn m = new MethodsWithReturn();

		boolean res = m.isodd(16);
		System.out.println(res);
	    
	
	}
	
	
	boolean isodd(int num) {
		boolean result;

		if (num % 2 == 1) {
			result = true;
		} else {
			result = false;

		}
		return result;

	}

}
