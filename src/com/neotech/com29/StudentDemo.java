package com.neotech.com29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Homework 3:
    Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order. 
    Each student object should have name and studentID. Display name of each student.
   */

public class StudentDemo {

	public static void main(String[] args) {

		Set<student> st = new HashSet<student>();
		st.add(new student("Mohamed", " Mg1975"));
		st.add(new student("Ghazy", " gE1976"));
		st.add(new student("omar", " nbn1975"));

		System.out.println();

		for (student S : st) {

			S.studentInfo();
		}

		System.out.println("\n");

		Iterator<student> iterator = st.iterator();

		while (iterator.hasNext()) {

			student S = iterator.next();

			S.studentInfo();
		}

	}

}
