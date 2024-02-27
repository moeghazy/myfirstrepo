package com.neotech.com30;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * - Print the list and check the order of the countries. - Verify if you have
 * your country (Albania, Turkey) in the list ( use containsKey() method ) -
 * Verify if a specific capital city is in the list ( use containsValue() method
 * ) - Get all the keys (countries names) in a Set. Print all country names
 * using for each loop. - Get all the values (capital names) in a Collection.
 * Print all capital names using iterator.
 **/

public class Task_2 {

	public static void main(String[] args) {

		Map<String, String> cntrys_cabital = new TreeMap<String, String>();
		cntrys_cabital.put("EGYPT", "CAIRO");
		cntrys_cabital.put("IRAQ", "BAGDAD");
		cntrys_cabital.put("TURKEY", "ANKARA");
		cntrys_cabital.put("ALBANIA", "TIRANA");
		cntrys_cabital.put("ENGLAND", "LONDON");
		cntrys_cabital.put("FRANCE", "PARIS");
		System.out.println(cntrys_cabital + "\n"); // THE INSERTION ORDER IS MAINTAINED \\

		System.out.println(" Dose Your key Maped To Value Contain--> EGYPT : " + cntrys_cabital.containsKey("EGYPT"));

		System.out
				.println(" Dose Your VALUE Maped To KEY Contain--> : CAIRO :" + cntrys_cabital.containsValue("CAIRO"));

		Collection<String> keys = cntrys_cabital.keySet();// up Casting

		// USING FOR EACH LOOP
		Collection<String> key = cntrys_cabital.values();// up Casting
		for (String values : keys) {

			System.out.print(values + " -*-");
		}
		System.out.println("\n");
		Iterator<String> iterator = key.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.print(str + " --//--");
		}
	}

}
