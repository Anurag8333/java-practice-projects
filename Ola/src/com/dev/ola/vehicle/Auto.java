package com.dev.ola.vehicle;

public class Auto {
	static String vehicleType = "Auto";
	static String companyName = "Ola";
	int space;
	boolean manual;
	boolean automatic;
	
	public static void detail() {
		System.out.println(vehicleType);
		System.out.println(companyName);
	}
	
	public void autoDetail() {
		System.out.println(space);
		System.out.println(manual);
		System.out.println(automatic);
	}
}
