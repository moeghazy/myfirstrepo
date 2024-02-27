package com.neotech.com26;

public class Registration_Test {

	public static void main(String[] args) {

		Registration person = new Registration();

		person.setUserName("Mohamed");
		person.setEmail("moe@yahoo");
		person.setPassword("Moh1234");

		System.out.println(person.getUserName());
		System.out.println(person.getEmail());
		System.out.println(person.getPassword());

	}

}
