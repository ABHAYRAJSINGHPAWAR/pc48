package com.runnable;

import java.util.ArrayList;
import java.util.Scanner;

import com.classes.Customer;

import static com.validater.Validations.validationInpu;
import static com.validater.Validations.validateMail;
import static com.validater.Validations.validatePassword;
import static com.utils.Tasks.changePassword;
import static com.utils.Tasks.removeAccount;
import static com.dummy.DummyData.dummyData;

public class runner {

	public static void main(String[] args) {
		
		try (Scanner sc=new Scanner(System.in)){
             ArrayList<Customer> customer =dummyData();
             int a=0;
             boolean flag=true;
             
             while(flag)
             {
            	System.out.println("PRESS 1: SIGN UP\n"
            			+ "PRESS 2:SIGN IN\n"
            			+ "PRESS 3:Change Password\n"
            			+ "PRESS 4:Unsubscribe\n"
            			+ "PRESS 5:Display All\n"
            			+ "PRESS 0:Exit\n");  
            	 
            	System.out.println("Enter your choice");
            	try {
            	switch(sc.nextInt())
            	{
            	case 1:
            		a+=1;
            		System.out.println("First_NAME Last_NAME Email Password Balance Dob Plan ");
            		Customer cs=validationInpu(a,sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
            		customer.add(cs);
            		System.out.println("Account Created ");
            		break;
            	case 2:
            		System.out.println("Enter Your Email id");
            		String tEmail=sc.next();
            		validateMail(tEmail);
            		System.out.println("Enter Password");
            		validatePassword(tEmail,sc.next(),customer);
            		
            		break;
            	case 3:
            		System.out.println("Enter Your Email id");
            		tEmail=sc.next();
            		validateMail(tEmail);
            		
            		System.out.println("Type old password");
            		String oPass=sc.next();
            		
            		System.out.println("Type new password");
            		String nPass=sc.next();
            		
            		changePassword(tEmail,oPass,nPass,customer);
            		System.out.println("Your Password changed");
            		break;
            	case 4:
            		System.out.println("Type your email id to unsubscribe");
            		 removeAccount(sc.next(),customer);
            		 System.out.println("Account Unsubscribed");
            		break;
            	case 5:
            		for(Customer c:customer)
            			System.out.println(c); 
            		break;
            		
            	case 0:
            		flag=false;
            		break;
            	default:
            		    System.out.println("Wrong choice");
            		}
            	}catch(Exception e) {
            		sc.nextLine();
            		System.out.println(e.getMessage());
            	}
             }
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}

	}

	

	

}
