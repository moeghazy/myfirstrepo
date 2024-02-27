package com.neotech.review07;

public class dermatolodest extends Doctor {


	String dermId ;
	
	
dermatolodest (){
		 
   }
dermatolodest( String name , int salary ,String licenceId ,String dermId){
	
	super ( name , salary , licenceId);
    
	this.dermId = dermId;

}

public void applySkintreatment () {
	 
	
	System.out.println(" Doctor " + name + " applay skintreatment");
	
}






}
