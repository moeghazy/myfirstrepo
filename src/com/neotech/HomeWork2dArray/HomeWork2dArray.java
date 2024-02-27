package com.neotech.HomeWork2dArray;

public class HomeWork2dArray {

	public static void main(String[] args) {
		
//Homework 1:
/*	Create an array of countries: north America countries,
 *  south America countries, Europe countries, Asian countries, 
 *  African countries.
 *  Then print all values from that array using 
 *  2 different loops and calculate how many total countries been stored.
		 */
  // FIRST WAY USING INDEX FOR LOOP ;
			
	String [][] homelands = {
			{"bahamas " , " bermuda",  "canada"},
			{"brazil" ," colombia", "chile ", "ecuador"},
			{"italy" , "france" , "england" , "germany",},
			{"bahrain", "iran" , "jorden","china"},
			{"egypt" , "libia" ,"nigeria", "sodan"},

         };  
	
	
	 for(int raw = 0; raw < homelands.length ; raw++) {
       	    
        	   for (int col = 0 ; col < homelands[raw].length ;  col++ ) {
        		   
        		 	  System.out.print(homelands [raw][col] + " , ");
        	   }
                   System.out.println();
        }      
	//SECOND WAY USING ENHANCED FOR LOOP;
			
			for( String [] raw : homelands) {
				 
				for(String col : raw) {
					 
					 System.out.print(col + " , ");
				 }
				
				System.out.println();
			
			}// total countries that have been stored
			System.out.println("//////////////////////////////");
	          
	      int total =0;
	
	      for(int i = 0 ; i < homelands.length; i++) {
	    	  
	    	  total = total + homelands[i].length ;
	    	  
	    	  
	      } System.out.println("total of countries listed -----> " + total );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
