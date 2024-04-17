package com.validater;

import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import com.classes.Customer;
import com.enums.ServicePlan;
import com.exception.CustomerManagementException;

public class Validations {
	public static Customer validationInpu(int id, String fName, String lName, String email, String password, double bal,
			String dob, String plan) throws CustomerManagementException {
		ServicePlan pl = validatePlan(plan);
	//	validatePass(password);
		validateMail(email);

		// System.out.println("valInp Okk");
		return new Customer(id, fName, lName, email, password, bal, LocalDate.parse(dob), pl);
	}

//	public static void validatePass(String password)throws CustomerManagementException {
//
//		Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$");
//		Matcher matcher = p.matcher(password);
//		boolean matches = matcher.matches();
//		if (!matches) {
//			throw new CustomerManagementException("Password must contain Alphanumeric with Symbol ");
//		}
//		
//	}

	public static void validatePassword(String email, String password, ArrayList<Customer> customer)
			throws CustomerManagementException {
		boolean flag = false;

//		Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$");
//		Matcher matcher = p.matcher(password);
//		boolean matches = matcher.matches();
//		if (matches) {
			for (Customer a : customer) {
			//	System.out.println("TEST EMAIL " + email);
			//	System.out.println("TEST Password " + password);
				if (((a.getEmail()).equals(email)) && ((a.getPass()).equals(password))) {
					System.out.println(a.getName() + " ,You Are Log In ");
					flag = false;
					break;
				} else {
					// throw new CustomerManagementException("Password Incorrect !!!!");
					flag = true;
				}
			}
//		} else {
//			throw new CustomerManagementException("Please check password ");
//		}
		if (flag) {
			throw new CustomerManagementException("Password Incorrect !!!!");
		}

	}

	public static void validateMail(String email) throws CustomerManagementException {
		if (email.contains("@") && (email.contains(".com") || email.contains(".org") || email.contains(".net"))) {
			// System.out.println("Email Okk");
		} else
			throw new CustomerManagementException("INVALID EMAIL");

	}

	public static ServicePlan validatePlan(String plan) {
		ServicePlan pl = ServicePlan.valueOf(plan.toUpperCase());
		// System.out.println("servicePlan OKK");
		return pl;
	}
}
