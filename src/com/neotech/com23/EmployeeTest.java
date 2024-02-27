package com.neotech.com23;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee emp = new Employee ();
		emp .salary = 155000;
		emp.getPaid();
		
		System.out.println("-----------------");
		
		contractor c = new contractor ();
		 c.hourlyRate = 60;
		 c.getPaid();
		
fullTimeEmployee ftm = new  fullTimeEmployee ();
		
		ftm.salary = 140000;
		ftm.getPaid();
	}

}
