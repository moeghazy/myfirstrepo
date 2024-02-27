package com.neotech.com34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exeptionHandler {

	static List<Object> ExceptionList() {

		List<Object> exlist = new ArrayList<>();
		{
			String filepath = "/mohamed/is a coder";
			try {
				FileInputStream fis = new FileInputStream(filepath);
			} catch (FileNotFoundException fnfe) {

				exlist.add(fnfe);}

			try {
				int x = 10, y = 0;

				System.out.println(x / y);

			} catch (ArithmeticException ae) {
				System.out.println("Error---> Division by zero is NOT ALLOWED !!!");
				exlist.add(ae);
			}

			System.out.println("The Code Is *--- HANDELED---* And Still Running ");

			try {
				int num[] = new int[4];
				System.out.println(num[4]);

			} catch (Exception e) {
				exlist.add(e);
			}

			return exlist;
           }
        }

	public static void main(String[] args) {

		for (Object ex : ExceptionList()) {

			System.out.println(ex);

		}
		Iterator<Object> Ex = ExceptionList().iterator();

		while (Ex.hasNext()) {
			Object object = Ex.next();

			System.out.println(object);

		}

	}

}
