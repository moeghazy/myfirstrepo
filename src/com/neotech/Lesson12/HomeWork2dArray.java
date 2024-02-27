package com.neotech.Lesson12;

public class HomeWork2dArray {

	public static void main(String[] args) {

		// Task # 2: Create A (2d Array) first raw will contain 4 names and second raw
		// will contain grades then my code should print names of students that has
		// grades( A , B )

		String[][] graduate = { { "Moe", "omar", "Asmaa", "Zeina" },
				                { "A", "B", "C", "A" } };

		for (int i = 0; i < graduate[0] .length; i++) {

			if (graduate[1][i].equalsIgnoreCase("a") || graduate[1][i].equalsIgnoreCase("B")) {

				System.out.println(graduate[0][i] + " graduate  Score has ---> " + graduate[1][i]);
			}

		}

	}

}
