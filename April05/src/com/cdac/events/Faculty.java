package com.cdac.events;

public class Faculty extends Person{
	private String department;
	private String sme;
	
	public Faculty(String f,String l,String d,String s){
		super(f,l);
		this.department=d;
		this.sme=s;
	}
	
	public String toString() {
		return super.toString() +" Department " +department +" sme " +sme;
	}
	

}
