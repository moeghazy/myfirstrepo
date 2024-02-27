package com.neotech.review10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.*;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> PhoneBook = new HashMap<Integer, String>();

		PhoneBook.put(1234, "John Smith");
		PhoneBook.put(12345, "Taylor Swift");
		PhoneBook.put(123456, "Donald Trump");
		PhoneBook.put(1234567, "Obama");
		PhoneBook.put(12345678, "Brad Pitt");

		System.out.println(PhoneBook);

		PhoneBook.replace(1234, "Scott");
		String name = PhoneBook.get(123456);

		System.out.println(name + " is calling ");

		System.out.println(PhoneBook);

		boolean contain = PhoneBook.containsKey(1234);
		System.out.println(contain);
		// let us get all the keys and store them into a set

		Set<Integer> numbers = PhoneBook.keySet();

		System.out.println(numbers);

		for (Integer num : numbers) {
			System.out.print(num + "- ");
		}
		System.out.println("\n");

		Iterator<Integer> itNum = numbers.iterator();

		while (itNum.hasNext()) {
			Integer personNumber = itNum.next();

			String personName = PhoneBook.get(personNumber);

			System.out.println(personNumber + " --> " + personName);
		}

		System.out.println();

		Collection<String> value = PhoneBook.values();

		System.out.println(value);

		for (String names : value) {
			System.out.println(value);
		}
		Set<Entry<Integer, String>> entryset = PhoneBook.entrySet();

		System.out.println(PhoneBook);
		System.out.println(entryset);

		for (Entry<Integer, String> entry : entryset) {
           //  System.out.println(entry + " ");
	
			Integer key = entry.getKey();
		     String values = entry.getValue();
		System.out.println( key + " ----> " + values);
		
		System.out.println("-------------using iterator----------");
	
		Iterator<Entry<Integer, String>> entryIt =entryset .iterator();
		 
		while (entryIt.hasNext()) {
			
			Entry<Integer, String> entrys =  entryIt.next();
			System.out.println(entrys .getKey()+ " " + entrys.getValue());
		}
		
		
		
		}

	}

}
