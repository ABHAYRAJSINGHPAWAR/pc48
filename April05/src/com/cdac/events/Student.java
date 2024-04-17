package com.cdac.events;

public class Student extends Person {
	
	private String course;
	private int marks;
	private int fees;
	
	public Student(String f, String l,String c,int m,int fe) {
		super(f, l);
		this.course=c;
		this.marks=m;
		this.fees=fe;
	}
public String toString() {
		
	 return super.toString() +" Course "  +course +" Marks " +marks +" Fees " + fees;
	 }

}
