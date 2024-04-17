package com.runner;

import java.util.ArrayList;
import java.util.Scanner;
import static com.validation.ValidatingAccountDetail.validateAcc;
import com.Banking.AccountDetail;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try(Scanner sc=new Scanner(System.in)){
    	 ArrayList<AccountDetail> arr=new ArrayList<>();
    	 boolean flag=true;
    	 while(flag) {
    	
    	 
    	 System.out.println("PRESS 1: OPEN ACCOUNT\n"
    			 +"PRESS 2: DISPLAY ALL ACCOUNT\n"
    			 +"PRESS 3: CHECK ALL ACCOUNT\n"
    			 +"PRESS 0: EXIT");
    	 
    	 System.out.println("Enter your choice");
    	 switch(sc.nextInt()) {
    	 case 0:
    		 flag=false;
    			break;
    	 case 1:
    		 System.out.println(" Account_Number First_name Last_name Account_Type DOB Balance");
			 AccountDetail account=validateAcc(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
		     arr.add(account);
		     System.out.println("Account created");
    		 break;
    	 case 2:
    		 System.out.println("Display");
    		 for(AccountDetail a:arr)
    			 System.out.println(a); 
    		 break;
    	 case 3:
    		 break;
    	 default:
    		 System.out.println("WRONG CHOICE !!!TRy AGAIN"); 
    		 }
    	 } 
     }catch(Exception e) {
    	 System.out.println(e.getMessage());
     }
		//int aNo,String fName,String lName,String acType,String dob,double bal
		
	
	}

}
