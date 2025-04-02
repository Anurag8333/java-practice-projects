package com.employee;

public class Employee {
  int empId;
  String name;
  String email;
  long phone;
  String dob;
  int salary;
  String designation;
public Employee(int empId, String name, String email, long phone, String dob, int salary, String designation) {
	super();
	this.empId = empId;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.dob = dob;
	this.salary = salary;
	this.designation = designation;
}

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
  

  
}
