package com.neotech.review07;

public class Doctor {

String name ;
int salary ;	
String  licenceId ;

Doctor (){
	
}

     Doctor (String name , int salary , String licenceId ){
	
	  this.name = name ;
      this.salary = salary;
      this.licenceId = licenceId ;
    
}


     public void checkUp (String patientName) {
	System.out.println(" Doctor " + name + " makes a checkup on "
			+ patientName);


}




}
