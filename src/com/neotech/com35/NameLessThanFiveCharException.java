package com.neotech.com35;

/**
 * Homework 1: Create a method checkUserNamethat will throw a runtime exception.
 * Method should throw an exception when the entered username is less than 5
 * characters.
 **/

public class NameLessThanFiveCharException extends RuntimeException {

	public NameLessThanFiveCharException(String message) {

		super(message);
	}
}
