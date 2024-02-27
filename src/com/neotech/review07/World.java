package com.neotech.review07;

public class World {

	public static void main(String[] args) {
		
		
        Person p1 = new Person ();
	    p1.name = "Mohamed";
	    p1.age = 48;
	    p1.weight= 245;

	    Person p2 = new Person ( "asmaa" , 47);
	    p2.weight = 180;
	    
	    Person p3 = new Person("omar " ,23 , 230) ;
	  
	    p3 .display();
	    p1.display();
	    p2.display();
	
	
	
	
	    
	
	
	}

	
}
