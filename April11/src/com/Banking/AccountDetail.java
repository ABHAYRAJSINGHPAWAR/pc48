package com.Banking;

import java.time.LocalDate;

import com.enums.AccountType;

public class AccountDetail {
   private int accNum;
   private String fName;
   private String lName;
   private AccountType acType;
   private LocalDate dob;
   private LocalDate cDate;
   private double bal;

public AccountDetail(int aNo,String fName,String lName,AccountType acType,LocalDate dob,double bal) {
 this.accNum=aNo;
 this.fName=fName;
 this.lName=lName;
 this.acType=acType;
 this.dob=dob;
 this.cDate=LocalDate.now();
 this.bal=bal;
}

public AccountDetail(int accNo) {
	this.accNum=accNo;
}

@Override
public String toString() {
	return "ACCOUNT NUMBER " +accNum +" NAME " +fName +" " +lName +" AccountType " +acType +" DATE OF BIRTH "+dob +"  BALANCE " +bal;
}


}
