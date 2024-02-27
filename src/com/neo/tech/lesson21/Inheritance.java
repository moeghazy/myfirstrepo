package com.neo.tech.lesson21;

public class Inheritance {

	public static void main(String[] args) {

		c object1 = new c();
		B object2 = new B();
		A object3 = new A();

		object1.behavior_1();
		object2.behavior_2();
		object3.behavior_3();
		object2.behavior_1();
		object3.behavior_2();
	}

}
