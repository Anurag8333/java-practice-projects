package com.dev.ola.user;

public class User {
	static String companyName = "Ola";
	static String designation ="User";
	String name;
	String password;
	String email;
	
	public void userDetail() {
		System.out.println(name);
		System.out.println(password);
		System.out.println(email);
	}
	
	public static void detail() {
		System.out.println(companyName);
		System.out.println(designation);
	}
}
