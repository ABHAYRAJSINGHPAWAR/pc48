package com.utils;

import java.util.ArrayList;
//import java.util.regex.Pattern;

import com.classes.Customer;
import com.exception.CustomerManagementException;

public class Tasks {
            public static void removeAccount(String email,ArrayList<Customer> customer)throws CustomerManagementException {
            		
            	for(Customer c:customer) {
            	                
            	                
            	                if(c.getEmail().equals(email))
            	                {
            	                	//System.out.println(" matched for removing ");
            	                	customer.remove(c);
            	                	break;
            	                }
            	                            		}
            }
            
            public static void changePassword(String tEmail, String oPass, String nPass, ArrayList<Customer> customer) {
        		for(Customer c:customer) {
        			
        			
        			if((c.toString()).contains(tEmail) && ((c.toString()).contains(oPass))) {
        				c.setPass(nPass);
        			}
        		}
        		
       	}

}
