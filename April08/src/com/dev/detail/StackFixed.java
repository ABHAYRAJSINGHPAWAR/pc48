package com.dev.detail;

public class StackFixed implements Stack {

	static int L_FIXED = 10;
	static int top = -1;
	public static int[] arr = new int[10];

	
	
	@Override
	public int[] push(int[] arr, int a) {
		++top;
		
		 if (top > L_FIXED-1)
			System.out.println(" Stack OverFlow ! Element not inserted");
		else {
		     
			arr[top] = a;
			
		}

		return arr;
	}

	@Override
	public void pop() {
		if(top<0)
			System.out.println("Stack UnderFlow ! ");
		else
		{
			top--;
		 
		}

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(top>0)
		{
		for(int i:arr)
			System.out.println(i + " ");
			
			}
		else
		{
			System.out.println("Stack is in underflow"); 
		}
	}

}
