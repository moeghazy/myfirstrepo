
/**Create a ArrayList that will store 5 names into it.
▪ Find out whether the given ArrayList is empty or not?
▪ Check whether the specific name is present in an ArrayList or not?
▪ Find the size of your ArrayList and print all values from the ArrayList
**/
package com.neotech.com27;

import java.util.ArrayList;

public class ArrayList_Hw {

	public static void main(String[] args) {

		ArrayList<String> namesAarry = new ArrayList<String>();

		namesAarry.add("Mohamed");
		namesAarry.add("Omar");
		namesAarry.add("Fares");
		namesAarry.add("Asmaa");
		namesAarry.add("Zeina");

		System.out.println("ArrayList Elements Are :-----> " + namesAarry);
		System.out.println("Is Array List Empty :----> " + namesAarry.isEmpty() + "--- Not True ");
		System.out.println("Dose Array List Include Mr  Mohamed :-------> " + namesAarry.contains("Mohamed"));
		System.out.println("The Size Of My Array List Is :-------> " + namesAarry.size());

		// Printing All Values From The Array List using Index For Loop \\

		for (int i = 0; i < namesAarry.size(); i++) {

			System.out.print(namesAarry.get(i) + "-*-");

		}System.out.println();

		// Printing All Values From The Array List using Enhanced For Each Loop \\

		for (String NamesAarry : namesAarry) {

			System.out.println(namesAarry);

		}

	}

}
