package com.interfac;
import com.customer.*;
import com.exception.OutOfBoundException;

public interface Stack {
	int STACK_SIZE=3;
       void push(Customer c) throws OutOfBoundException;
        Customer pop()throws OutOfBoundException;
	
}
