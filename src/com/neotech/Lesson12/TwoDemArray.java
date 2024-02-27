package com.neotech.Lesson12;

public class TwoDemArray {

	public static void main(String[] args) {

		int[][] nums = {

				{ 3, 6, 9, 12 },

				{ 5, 10, 15, 20 },

				{ 15, 16, 17, 18 },

				{ 14 },

				{ 17 },

		};

		for (int[] raw : nums) {

			for (int col : raw) {
				System.out.print(col + ", ");

			}

			System.out.println();

		}

		System.out.println("<----------------->");

		int[][] Ary = { { 14, 16, 17, 18 },

				{ 12, 19, 8, 25 },

				{ 0, 11, 6, 28 }, };

		for (int[] raw : Ary) {

			for (int col : raw) {

				if (col % 2 == 0) {

				System.out.print(col + ", ");
				}
			}

			System.out.println();

		}

	}

}
