package com.neotech.review07;

public class Person {



 String name ;
 int  age , weight ;

 public Person () {
	 
 }

  public Person ( String name , int age) {
	  
	  this.name = name;
      this.age = age ;
  }
 
public Person (String name , int age , int weight) {
	  this(name , age);
      this.weight=weight;
   
}

  
  
  
  public void display () {
	
	     System.out.println(" name " + name + " age " + age + " weight " +  weight);
	     
}






}









