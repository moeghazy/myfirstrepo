package com.neotech.review07;

public class Forest {

  public static void main(String[] args) {
	

  Wolf w = new Wolf ("wolfy" , 4 );
  w.sleep ();
  w.displayinfo();

  System.out.println("------------------------------");
 
Fox f = new  Fox(" foxy", 4, "black");
 f.sleep();
 f.displayinfo();
 
 System.out.println("------------------------------");
 
 Bear B = new Bear(" teddy ", 2);
  B.sleep();
  B.displayinfo();
  B.roar();
  
  
  }


}
