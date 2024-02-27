package com.neotech.com35;

public class LastJavaHw {

	public static void main(String[] args) {
		try {
			validateName("moe");
		} catch ( NameLessThanFiveCharException ex) {
			System.out.println("FILE NOT FOUND ....!!!");
		} 
System.out.println(" invalid user name .....!!");
		
System.out.println("program still running after Exception is **** HANDELD*****");

	}

	 static void validateName(String name) {

	if (name.length() < 5 ) {
		
	throw new  NameLessThanFiveCharException ("user name must "
			+ "be 5 or more charactors");
	}

	
	
	
	}

}
