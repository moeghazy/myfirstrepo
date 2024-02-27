package com.neotech.com23;

public class Animal {

	public void eat() {

		System.out.println(" All animales eat ! ");
	}

	public void sleep() {

		System.out.println(" All animales sleep ! ");

	}
}
   // sub class of animal
class Tiger extends Animal {

	
	   //over riding method
	public void eat() {

		System.out.println(" Tiger eats humman");
	}

	public void run() {
		System.out.println(" Tiger run very fast !");
	}

}
