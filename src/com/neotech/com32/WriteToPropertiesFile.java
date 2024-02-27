package com.neotech.com32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {

		// 1- location
		String filePath = "/Users/mohamedghazy/eclipse-workspace/JavaBasic6/" 
		+ "configs/example.Properties";

		// 2- connection stream creating an object of (file input stream)
		FileInputStream fis = new FileInputStream(filePath);

		// 3- storing properties file into object of properties
		Properties prop = new Properties();

		// 4- we load information from the properties file.
		prop.load(fis);

		// 5- changing data from properties file
		prop.setProperty("browser", "safari");
		prop.setProperty("userName", "Ghazy moe");
		prop.setProperty("url", "www safari.com");
		prop.setProperty("password", "Mg1970");
		//6- writing new data to the file with new output object
		
		FileOutputStream fos = new FileOutputStream(filePath);
	    
	       prop.store(fos, " I Just updated the file");
	
	
	}

}
