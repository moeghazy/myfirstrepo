package com.neotech.Review04;

public class MethodPractice {

	void ILoveMyWife() {

		for (int i = 0; i <= 5; i++) {
			System.out.println("i love my wife");
		}

	}

	void IamHappy(int n) {
		for (int i = 0; i <= n; i++) {

			System.out.println(" Iam happy ");
		}
	}

	void saygreeting(String greeting) {
		for (int i = 0; i <= 5; i++) {
			System.out.print(greeting + " -");
		}
	}

	void saygreetingWithNumbers(String greeting, int n) {
		for (int i = 0; i <= n; i++) {
			System.out.print(greeting + ", ");
		}

	}

	public static void main(String[] args) {

		MethodPractice m = new MethodPractice();

		m.ILoveMyWife();

		m.IamHappy(5);

		m.saygreeting("good day");

		m.saygreetingWithNumbers("hello", 4);
	}

}
