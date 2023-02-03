package com.bisratbelay.corporate.project.tracker;

public class Employee {
	
	String firstName;
	String lastName;
	String emailAddress;
	
	public Employee() {
		this.firstName="0";
		this.lastName="0";
		this.emailAddress="0";
	}
	
	public Employee(String firstName, String lastName, String emailAddress)  {
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailAddress=emailAddress;
	}

}
