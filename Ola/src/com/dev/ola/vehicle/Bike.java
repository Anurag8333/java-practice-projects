package com.dev.ola.vehicle;

public class Bike {
	static String vehicleType = "Bike";
	static String companyName = "Ola";
	int space;
	String fuelType;
	String company ;
	
	public static void detail() {
		System.out.println(vehicleType);
		System.out.println(companyName);
	}
	
	public void bikeDetail() {
		System.out.println(space);
		System.out.println(fuelType);
		System.out.println(company);
	}
}
