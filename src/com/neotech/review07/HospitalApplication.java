package com.neotech.review07;

public class HospitalApplication {


	public static void main(String[] args) {
	

	 Doctor d1 = new Doctor (" asmaa " ,12000, "trd765");

            d1.checkUp("mohamed");


  System.out.println("--------------------------");


  dermatolodest d2 = new dermatolodest ();
     d2.name = "omar";
     d2 .salary = 12000;
     d2 .licenceId = "trf87";
     d2 .dermId = "dsd55";
 
	d2.checkUp("zeina ");
	d2.applySkintreatment();
	
	 dermatolodest d3 = new dermatolodest ("omar ",15000, "gf66" , "tr66");
	
	d3.applySkintreatment();
	d3.checkUp("zeina");
	
	
	
	}
}














