package com.neotech.com23;

public class AnimalTest {

	public static void main(String[] args) {
  
		
		Animal obj1 = new Animal();
	    obj1.eat();
	    obj1.sleep();
	System.out.println("---------------");
	   
	Tiger obj2 = new Tiger ();
	    obj2.eat();
	    obj2.sleep();
	    obj2.run();
		
  System.out.println("---------------");
		
		Animal obj3 = new Tiger ();
		obj3.eat();
	    obj3.sleep();
	
 System.out.println("---------------");
	
 Tiger obj4 = ( Tiger )obj3 ;
	obj2.eat();
    obj2.sleep();
    obj2.run();
	

	
	}

}
