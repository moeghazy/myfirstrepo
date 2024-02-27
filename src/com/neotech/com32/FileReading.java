package com.neotech.com32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {

		// full path

		String fullPath = "/Users/mohamedghazy/eclipse-workspace/JavaBasic6/configs/conf.properties";

		// find user directory

		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);

		// creating dynamic path                                
		String dynamicPath = System.getProperty("user.dir") + "/configs/conf.properties";

		System.out.println(dynamicPath);

		FileInputStream fis = new FileInputStream(dynamicPath);

		// creating properties object
		Properties prop = new Properties();
		prop.load(fis);

		String url = prop.getProperty("url");
		System.out.println(url);

       System.out.println(prop.getProperty("browser"));	
	
	
	}

}
