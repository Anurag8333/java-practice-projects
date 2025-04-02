package com.implementation;

import java.util.ArrayList;
import com.employee.Employee;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(101, "Anurag", "anurag8333@gmail.com",1234567891l,"30-08-2004",95000,"CEO"));
		e.add(new Employee(102, "Anuradha", "anuradha123@gmail.com",1234567891l,"1-02-2004",50000,"SALES"));
		e.add(new Employee(103, "Deepak", "deepak123@gmail.com",1234567891l,"5-07-2004",60000,"MANAGER"));
		e.add(new Employee(104, "Sagar", "sagar123@gmail.com",1234567891l,"10-05-2004",45000,"TRAINER"));
		
		for (Employee employee : e) {
			if(employee.getDesignation().equalsIgnoreCase("Sales")) {
				System.out.println(employee.getName()+" "+employee.getDesignation());
			}
		}
		
		for (Employee employee : e) {
			if(employee.getName().charAt(0)== 'a' || employee.getName().charAt(0)== 'A'){
				System.out.println(employee.getName());
			}
		}
		
		for (Employee employee : e) {
			if(employee.getSalary()>=50000 ||employee.getSalary()<=90000 ) {
				System.out.println(employee.getName());
			}
		}
	}
}
