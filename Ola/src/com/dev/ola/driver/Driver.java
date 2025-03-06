package com.dev.ola.driver;

public class Driver {
	static String companyName = "Ola";
	static String job ="Driving";
	public String name ;
	public int experience;
	double salary;
	
	public void driverDetail() {
		System.out.println(name);
		System.out.println(experience);
		System.out.println(salary);
	}
	
	public static void detail() {
		System.out.println(companyName);
		System.out.println(job);
	}
}
