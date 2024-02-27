package com.neotech.com23;

public class Parent{

	Parent() {

		System.out.println("  Parent  class constructor ");
	}

	private void hello() {

		System.out.println(" Hello from the parent class ! ");
	}

	static void bye() {

		System.out.println(" Bye from the parent class ! ");

	}

}
class childClass extends Parent {
	
	 childClass (){
		 System.out.println(" child Class Constructor ");
		 
	 }
	// we are not overriding because its private 
	 private void hello () {
	  
	  System.out.println("hello from the childClass ");
  }

  static void bye()
  {
	  System.out.println("bye from the childClass ");
	  
  }


}