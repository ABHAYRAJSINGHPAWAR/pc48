package com.cdac.events;

public class Person {
	private String fname;
	private String lname;
	
	Person(String f,String l){
		this.fname=f;
		this.lname=l;
		
	}
	
	public String toString() {
		
		return "First name " +fname +" Last name " +lname;
	}

}
