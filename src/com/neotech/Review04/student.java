package com.neotech.Review04;

public class student {

	
	// ATTRIBUTES OR PROPERTIES OR VARIABLE \\
        int  gradelevel;
        String name, gender;

	
	
	// METHODS OR BEHAVIORE OR ACTIONS \\

	void study() {
		System.out.println(name + " is studing ");
	}

	void sleep() {
		System.out.println(name + " is sleeping");
	}

	
	void allinformation () {
		
	System.out.println("my name is " + name);
	System.out.println("my gradelevel is " +  gradelevel);
	System.out.println("my gender is " + gender );
	
	
	}
	
	
	
	
	
	public static void main(String[] args) {

		student s1 = new student();

		s1.name = "moe";
		s1.gradelevel = 2;
        s1.gender = "male";
		
        s1.sleep();
		s1.study();
        s1 .allinformation();
	
	
	}

}
