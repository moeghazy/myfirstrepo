
package com.neotech.review07;

public class Student {

   // instance variables

 String name;
 int age; 

 // static / class variable
 static String school = "neo teach";
   
//Default constructor
 public Student () {
	
}


public  Student ( String name ,int age ) {
	this.name = name;
	this.age = age;
}

//instance method
public void display () {
	System.out.println(" my name is " + name + " may age is " + age + Student.school );
}


public static void main(String[] args) {
	
 Student s2 = new Student ("fares " , 16); 
	 s2.display();
	 Student s3 = new Student ("zeina" , 17); 
	 s3.display();
}






}
