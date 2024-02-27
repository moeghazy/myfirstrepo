package com.neo.tech.lesson20;

public class Access_Mod_constructor {

	 Access_Mod_constructor() {

		System.out.println(" this Access_Mod_constructor is defult style without parameters ");
	}

	protected Access_Mod_constructor(String define) {

		System.out.println("this Access_Mod_constructor has single string parameters " + define);
	}

	private Access_Mod_constructor(int ssn) {

		System.out.println("this private Access_Mod_constructor has single integer parameter " + ssn);
	}

	public Access_Mod_constructor(String fullname, int age) {

		System.out.println("this public Access_Mod_constructor has both + (string +integer) parameter " + fullname + age);

	}

	public static void main(String[] args) {

		Access_Mod_constructor object = new Access_Mod_constructor();

		Access_Mod_constructor object1 = new Access_Mod_constructor(" Mohamed Ghazy is ", 48);

		Access_Mod_constructor object2 = new Access_Mod_constructor( 484664674);
	    
		Access_Mod_constructor object3 = new Access_Mod_constructor("I my school like");
	    
	
	}

}
