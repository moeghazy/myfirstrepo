package com.neotech.com25_Practic;

import java.util.Iterator;

public class fruit_Market_Demo {

	public static void main(String[] args) {

		Apple A = new Apple();
		A.tasty();
		A.color();
		A.peel();
		A.wash();

		orange rg = new orange();
		rg.peel();
		rg.tasty();
		rg.sizes();
		Fruit F = new Apple();// up casting
		F.tasty();

		Washable F2 = new orange();
		F2.wash();

		Fruit F3 = (Fruit) F; // Down casting
		F3.tasty();

		Peelable ap = new Apple();
		ap.peel();
		Washable or = new orange();
		or.wash();
     
		
		Peelable[] pe = { ap, A };

		for (Peelable element : pe) {

			element.peel();

		}

		Washable[] ws = { rg, or };
		for (Washable elements : ws) {

			elements.wash();

		}

		for (int Washable = 0; Washable <= ws.length - 1; Washable++) {
			rg.sizes();
			F.tasty();
			F2.wash();
			F3.tasty();

		}
		System.out.println("================================");

		for (int Peelable = 0; Peelable <= pe.length; Peelable++) {

			ap.peel();
			F.tasty();
			F2.wash();
			F3.tasty();
		}

	}

}
