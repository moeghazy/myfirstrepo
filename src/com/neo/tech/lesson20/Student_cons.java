package com.neo.tech.lesson20;

public class Student_cons {

	
	/*
	 * Write program as a Student class that has instance variables ( name and
	 * address.) Create a constructor that will initialize those variables.
	 * 
	 * Print name & address of given student using displayInfo method.
	 */

	String address, name ;

	public Student_cons(String name, String address) {

		this.name = name;
		this.address = address;

	}

	public void displayInfo() {

		System.out.println("The address of student " + name + " " + this.address);

	}

	public static void main(String[] args) {

		Student_cons s1 = new Student_cons("Mohamed Ghazy ", "80 palmer dr wayne Nj (07470)");

		s1.displayInfo();

	}

}
