package com.neotech.com23;

public class Banks {

	public static void main(String[] args) {

		credit_Card card = new credit_Card();

		card.calculate(100.50, 6.7);

		Visa v = new Visa();

		v.calculate(2500, 13.11);

		Amx amx = new Amx();
		amx.calculate(9500, 9.2);

	}

}
