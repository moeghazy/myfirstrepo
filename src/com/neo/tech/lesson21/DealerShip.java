package com.neo.tech.lesson21;

public class DealerShip {

	public static void main(String[] args) {
		
    Car car = new Car ();	
    car.make = "Toyota";
	car.model ="rav4";
	car.color ="pearlWhite";
	car.price = 43500;
	car.timeto60= 5.6;
	car.year = 2024;
	car.garantee=36;
	car.performance();
	car.marketValue();
	car.warranty();
System.out.println("..................................");	


   SportCar GM = new SportCar();
    GM.make = "Cadelac";
    GM.model ="Esclade";
	GM.color ="saphire";
	GM.price = 99500;
	GM.fuleCons=20;
	GM.timeto60= 4.3;
	GM.year = 2024;
	GM.garantee=36;
	GM.performance();
	GM.marketValue();
	GM.warranty();
	GM.Mpg();
	
	
	
	
	
	}

}
