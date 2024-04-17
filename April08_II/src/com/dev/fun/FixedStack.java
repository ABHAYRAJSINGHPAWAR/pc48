package com.dev.fun;



import com.customer.Customer;
import com.exception.OutOfBoundException;
import com.interfac.Stack;

public class FixedStack implements Stack {
	// static int SIZE = 5;
	// static int BOUND = 1;
	public  Customer[] customers;
	static int top;

	public FixedStack() {
		customers = new Customer[STACK_SIZE];
		top = -1;
	}
	
	@Override
	public void push(Customer c) throws OutOfBoundException {
		try {
		if(top<customers.length-1)
		{
			customers[++top]=c;
		}
		}catch(Exception e){
			System.out.println(e); 
		}
	}

	@Override
	public Customer pop() throws OutOfBoundException {
		// TODO Auto-generated method stub
		if(top==-1)
		{
			throw new OutOfBoundException("EMPTY STACK");
		}
		return customers[top--];
	}

	

}
