package com.validation;

import java.time.LocalDate;

import com.Banking.AccountDetail;
import com.enums.AccountType;
import com.exception.AccountException;

public class ValidatingAccountDetail {
	public static AccountDetail validateAcc(int aNo,String fName,String lName,String acType,String dob,double bal) throws AccountException {
		AccountType type=validateAcType(acType);
		validateMinBalance(type,bal);
		return new AccountDetail(aNo,fName,lName,type,LocalDate.parse(dob),bal);
	}

	private static void validateMinBalance(AccountType type,double bal) throws AccountException {
		if(bal<type.getMinBalance()) {
			throw new AccountException("Less than min balance ");
		}
		
	}

	private static AccountType validateAcType(String acType) {
		return AccountType.valueOf(acType);
		
	}

}
//int aNo,String fName,String lName,String acType,String dob,double bal