package com.neotech.com23;
/**▪ Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
▪ Define some common behavior (methods) and some fields in the parent class,
 and override some of the methods in the child classes.
▪ Define some methods specific to the child classes.
▪ Create objects of the child classes and store them in an array.
▪ Loop through each object and execute available methods.
**/
public class Computer {
	                  public Computer (){
		
	                              }
	
	public void screen_Size () {
                	   System.out.println("All devices have deferent scree size ");
                   }
                   public void memorySpeed () {
                	   System.out.println("All devices have deferent memory Speed ");
                   }
                   public void hard_Drive () {
                	   System.out.println("All devices have deferent Hard drive capacity  ");
                   }
}   
                  
class Apple_IMac extends Computer {
	                 public void model_Name () {
	                	 System.out.println(" Apple has nice (OS) models  ");
	                 }
	                 public void memorySpeed () {
	                	   System.out.println("All  apple devices have deferent memory Speed ");
	                 }
}
class lenovo extends Computer {
	                public void memorySpeed () {
  	                    System.out.println("All  lenovo devices have deferent memory Speed ");
	                }
	                 public void price () {
	                	 System.out.println("All lenova  devices have 20% off ");
	                 }
}class Hp  extends Computer {
	                public void hard_Drive () {
  	                     System.out.println("All devices have deferent Hard drive capacity  ");
     }              public void  Cpu_model () {
    	                 System.out.println("All Hp devices have Celeron Cpu  ");
    	 }
	}
class Dell extends Computer {
	   public void screen_Size () {
    	   System.out.println("All  Dell devices have deferent scree size ");
       }

	   public void quality () {
		   System.out.println("All  Dell devices medium bulit quality ");
		   
	   }
	
	
	
}





























