package com.neo.tech.lesson22.copy;

public class Overloaded_StMethd {

	/**Create a class with 3 overloaded static methods.
    Then call each overloaded methods with specific arguments
    and observe the results.
**/

 public static int add (int A , int B) {
	
	 return A+B ;
	}

 public static  int add (int A , int B , int C) {
	 return A+B+C ;
 }
 
 public static double add (double A , double B) {
	 
	 return A+B ;
 }
public static void add ( int [] numbers) {
	int result = 1;
   for ( int num : numbers) {
	   result += num ;
   }
    System.out.println(result);
}


public static void main(String[] args) {
	
	// first way\\
	
	int sum1 = add (9,25);
	System.out.println("the sum of method 1 " + sum1);
	
	int sum2 = add (9,25, 43);
	System.out.println("the sum of method 2 " + sum2);
	
	double sum3 = add (6.7 ,6.7);
	System.out.println("the sum of method 3 " + sum3);
	
	// second way\\
	
	System.out.println(Overloaded_StMethd .add(55,99 ));
	System.out.println(Overloaded_StMethd .add(55,99,66 ));
	System.out.println(Overloaded_StMethd .add(99.5 , 66.66 ));

  int []arry = { 1,1,1,1};
	add (arry);	  
  
}


























}
