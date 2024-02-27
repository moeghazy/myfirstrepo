package com.neotech.com32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class propertiesFileReading {

	public static void main(String[] args) throws IOException {

		// -1 location: this is file location

		String filePath = "/Users/mohamedghazy/eclipse-workspace/JavaBasic6/"
				+ "configs/example.Properties";

		// -2 creating an object of fileInputStream ( connection stream )

		FileInputStream fis = new FileInputStream(filePath);

		// 3- get the data and store it into properties object

		Properties prop = new Properties();

		prop.load(fis);

		String name = prop.getProperty("name");

		System.out.println(name);

		String lastName = prop.getProperty("lastName");

		System.out.println(lastName);

		// we can get all keys and print it

		Set<Object> keys = prop.keySet();
		Collection<Object> value = prop.values();
		System.out.println(keys);

		for (Object object : keys) {

			System.out.print(object + " ,");
		}
		System.out.println();
		for (Object val : value) {
			System.out.print(val + " - ");

		}

	}

}
