package com.tester;
import com.dev.detail.StackGrowable;
import com.dev.detail.StackFixed;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the size of Array");
		
		StackFixed s=new StackFixed();
		StackGrowable sg=new StackGrowable();
	
		  

		//fixing value in stack
	    s.arr =s.push(s.arr, 1);
	    s.arr =s.push(s.arr, 2);
	    s.arr =s.push(s.arr, 3);
	    s.arr =s.push(s.arr, 4);
	    s.arr =s.push(s.arr, 5);
	    s.arr =s.push(s.arr, 6);
	    s.arr =s.push(s.arr, 7);
	    s.arr =s.push(s.arr, 8);
	    s.arr =s.push(s.arr, 9);
	    s.arr =s.push(s.arr, 10);
	    s.display();
	    
	    //overflowing stack
	    s.arr =s.push(s.arr, 11);
	    
	    
	    //underflow stack
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
	    s.display();
	    
	  	//fixing value in stack
	    sg.arrS =sg.push(sg.arrS, 1);
	    sg.arrS =sg.push(sg.arrS, 2);
	    sg.arrS =sg.push(sg.arrS, 3);
	    sg.arrS =sg.push(sg.arrS, 4);
	    sg.arrS =sg.push(sg.arrS, 5);
	    sg.arrS =sg.push(sg.arrS, 6);
	    sg.arrS =sg.push(sg.arrS, 7);
	    sg.arrS =sg.push(sg.arrS, 8);
	    sg.arrS =sg.push(sg.arrS, 9);
	    sg.arrS =sg.push(sg.arrS, 10);
	    sg.display();
	    
	    
	    sg.arrS =sg.push(sg.arrS, 11);
	    sg.display();
	    
	    sg.pop();
	    sg.pop();
	    sg.pop();
	    sg.pop();
	  
	    sg.display();
	}



}
