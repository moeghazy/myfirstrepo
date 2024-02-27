package com.neotech.com23;

/**
 * ▪ Create a class CreditCard and define two variables, balance and interest. ▪
 * Create an instance method that will calculate the interest based on the given
 * balance. ▪ Create 2 subclasses: Visa and AX. In AX class override the method
 * calculate interest. ▪ Call the method by creating an object of each of the
 * three classes.
 **/
public class credit_Card {

	double balance, interest;

	// creating instance method
	
	public void calculate(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
		
	
	System.out.println(" The final balance is : " +( balance * interest ));
	}
}

class Visa extends credit_Card {

}

class Amx extends credit_Card {
	public void calculate(double balance, double interest) {
       
		
		
       System.out.println(" Amx balance is : " + balance * interest );
	
	}

	
}
