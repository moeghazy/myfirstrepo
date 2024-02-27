package com.neotech.com23;

public class Employee {

	double salary;

	void getPaid() {

		System.out.println(" the employee salary is : " + salary);
	}

}

class contractor extends Employee {

	double hourlyRate;

	void getPaid() {
		System.out.println(" the contractor hourly rate is : " + hourlyRate);
	}

}

class fullTimeEmployee extends Employee {

}










