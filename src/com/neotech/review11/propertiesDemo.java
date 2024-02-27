package com.neotech.review11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo {

	public static void main(String[] args) throws IOException {
		

	String ProjectPath = System.getProperty("user.dir");
	
	System.out.println(ProjectPath);
	
	
	String filepath =  ProjectPath +"/extra/demo.properties";
	
	System.out.println(filepath);
	
	FileInputStream filesIs = new  FileInputStream(filepath);
	
	Properties proper = new Properties ();
	
	proper.load(filesIs);
	
	System.out.println(proper);
	
	String school = proper.getProperty("School");
	
	proper.setProperty("ssn", "67578878");
	System.out.println(proper);
	
	// saving into new file
	String newpath =  ProjectPath + "/extra/newFile.text";
	FileOutputStream fileOs = new FileOutputStream( newpath);
	
	proper.store(fileOs, "Moe was here !");
	}

}
