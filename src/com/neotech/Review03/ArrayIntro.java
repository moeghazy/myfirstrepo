package com.neotech.Review03;

public class ArrayIntro {

	public static void main(String[] args) {

for (int raw = 1; raw <= 4; raw++) {

	for (int col = 1; col <= 5; col++) {

		if (raw == 1 || raw == 4 || col == 1 || col == 5) {
					System.out.print("$");

				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}

	}

}
