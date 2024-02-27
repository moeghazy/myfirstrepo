package com.neotech.com31;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class class_Task {

	public static void main(String[] args) {

		Set<String> obj = new HashSet<String>();

		obj.add("egypt");
		obj.add("Cameron");
		obj.add("Morocco");
		obj.add("Iraq");
		obj.add("Iraq");

		Iterator<String> iterator = obj.iterator();

		while (iterator.hasNext()) {

			String str = iterator.next();

			System.out.print(str + " ");
		}

		System.out.println();

		for (String country : obj) {
			System.out.print(country + " ");
		}

	}
}
