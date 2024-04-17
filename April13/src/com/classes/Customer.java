package com.classes;

import java.time.LocalDate;

import com.enums.ServicePlan;

public class Customer {
	
	private int id;
	private String fName;
	private String lName;
	private String email;
	private String password;
	private double balance;
	private LocalDate dob;
	private ServicePlan plan;
	
	public Customer(int id,String fName,String lName,String email,String password,double bal,
			LocalDate dob,ServicePlan plan){
		this.id=id;
		this.fName=fName;
		this.lName=lName;
		this.email=email;
		this.password=password;
		this.balance=bal;
		this.dob=dob;
		this.plan=plan;
		
	}
	
	//overload CTOR
	Customer(String email){
		this.email=email;
		
	}
	
	public void setPass(String sP) {
		this.password=sP;
	}
	public String getPass() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return fName;
	}
	
	
	@Override
	public String toString() {
		return "ID " +id +" First Name " +fName +" Last Name " +lName +" Email " +email +" Paswword "
				+password +" Balance " +balance +" Date Of Birth "+dob +" PLAN "+plan;
	}

}
