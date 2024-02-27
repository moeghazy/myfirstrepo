package com.neotech.Lesson12;

public class PracticFor2dArray {

	public static void main(String[] args) {
		
	
	
	String [] countries = { "italy", "turkey", "egypt", "brazil"," usa" };
	
	for( int i = 0; i < countries.length; i++) {
		 
		if(countries [i].equals("italy")) {
			
			System.out.println(countries [i] +" Roma");
			
		}
		
	}
		// second way;
		
		for( String country : countries) {
			
			if (country .equals ("italy")) {
				
				System.out.println(country + "---roma");
			}
			
			else if (country.equals("turkey")) {
				
				System.out.println(country + "----ankara");
			}
		
			else if (country .equals("egypt")) {
				
				System.out.println(country + "----> cairo");
			}
		
		
		
		
		
		}
		
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
