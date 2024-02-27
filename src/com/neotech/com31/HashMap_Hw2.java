package com.neotech.com31;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Homework 2: Create the collection that will store single unique objects of a
 * String type in which order is preserved. Write a logic to concatenate all
 * string from the collection.
 **/
public class HashMap_Hw2 {

	public static void main(String[] args) {

		Collection<String> obj = new LinkedHashSet<String>();

		obj.add("Mohamed");
		obj.add("Ghazy");
		obj.add("Elbeialy");
		obj.add("@ NeoTech");

		Iterator<String> iterator = obj.iterator();

		while (iterator.hasNext()) {

			String str = iterator.next();

			System.out.print(str + " ");

		}

	}

}
