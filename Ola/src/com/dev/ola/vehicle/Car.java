package com.dev.ola.vehicle;

public class Car {
	static String vehicleType = "Car";
	static String companyName = "Ola";
	int space;
	String fuelType;
	String company ;
	
	public static void detail() {
		System.out.println(vehicleType);
		System.out.println(companyName);
	}
	
	public void carDetail() {
		System.out.println(space);
		System.out.println(fuelType);
		System.out.println(company);
	}
}
