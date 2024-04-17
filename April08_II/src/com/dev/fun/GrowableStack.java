package com.dev.fun;

import com.customer.Customer;
import com.exception.OutOfBoundException;

public class GrowableStack extends FixedStack {
	@Override
	public void push(Customer c) throws OutOfBoundException{
		if(top<customers.length-1)
		{
			customers[++top]=c;
			
		}
		else
		{
			Customer[] temp=new Customer[customers.length*2];
			for(int i=0;i<customers.length;i++) {
				temp[i]=customers[i];
				
				
			}
			customers=temp;
		    customers[++top]=c;	
		}
		
		
	}

}



