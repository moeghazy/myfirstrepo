package com.neotech.review07;

// super class Or parent class // base class
public class Animal {

	String name;
	int legs;

	Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public Animal() {
	}
     //first method
	public void sleep() {
		System.out.println("All animales sleep");

	}
    // second method
	public void displayinfo() {

		System.out.println(name + " has " + legs + " legs ");

	}
 
} // derived classes / sub classes

class Wolf extends Animal {

	Wolf(String name, int legs) {
		super(name, legs);
	}
}

class Fox extends Animal {
	String furColor;

	Fox(String name, int legs, String furColor) {
		super(name, legs);
		this.furColor = furColor;

	}
}

class Bear extends Animal {

	Bear(String name, int legs) {
		super(name, legs);

	}

	public void roar() {
		System.out.println("All Bears roar");

	}

}
