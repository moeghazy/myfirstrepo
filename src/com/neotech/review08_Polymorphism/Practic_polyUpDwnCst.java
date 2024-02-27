package com.neotech.review08_Polymorphism;

public class Practic_polyUpDwnCst {

	public static void main(String[] args) {

 
        human h1;
        h1 = new egyptian ();
        
     
     American h2 = ( American) h1 ; 
      h2.payTax();
      h1.talk();
      h2.talk();  
      
      egyptian  eg = ( egyptian )h1;
       eg.working();
       eg.talk();
     
     
     
     
     
     
     
     
     human [] humanArray = new human [3];
      
        humanArray [0]= h1 ;
        humanArray [1]= h2 ;
        humanArray [2]= new American ();
     













}

}
