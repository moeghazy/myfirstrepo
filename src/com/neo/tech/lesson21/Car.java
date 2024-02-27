package com.neo.tech.lesson21;

/*
Write a Java program called Car. Specify features and behaviors of the Car class.
Create SportsCar and FamilyCar subclasses of the Car class
with their own features and behaviors.
Next, create a LuxurySportsCar that will inherit the SportsCar and
also will have its own features and behaviors.
Create objects from each class and test them.

*/
public class Car {  // attributes\\


String make , model , color ;
int year ; 
int garantee ;
int price ;
double timeto60 ;

public void performance () {
	  System.out.println( make + " "  + model + " " + color + " "+ year + " can do 0 - 60 in : " + timeto60  );
	}

public void marketValue () {
	      System.out.println(make + " " + model + " " + color + " " +  year + " has a price of : " + price );
	      
    }
public void warranty () {
	
	System.out.println( make + " " + model + " " + color +" " +year + "has a warranty of " + garantee );
}

}
   










