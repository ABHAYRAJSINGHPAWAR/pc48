package com.dev.detail;

public class StackGrowable implements Stack {
	public static int BOUND=1;
	public static int length=0;
	public static int top=-1;
	public int arrS[]=new int[length+BOUND];
	

	 static int[] create(int[] a)
	    {
	        int[] new_a = new int[length + BOUND];
	        for (int i = 0; i < length; i++)
	            new_a[i] = a[i];
	 
	        length += BOUND;
	        return new_a;
	    }
	 
	 static int[] delete(int[] a)
	 {
		 int[] del_a=new int[length +BOUND];
		 for (int i = 0; i < length; i++)
	            del_a[i] = a[i];
		 
		 length -= BOUND;
		 return del_a;
	 }
	
	

	@Override
	public void pop() {
		// TODO Auto-generated method stub
	     top--;
	     arrS=delete(arrS);
	   
	}

	@Override
	public int[] push(int[] arr, int i) {
		// TODO Auto-generated method stub
		  if (top == length - 1)
	            arrS = create(arrS);
	 
	        // insert element at top of the stack
	        arrS[++top] = i;

		return arrS;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		if(top>0)
		{
		for(int i:arrS)
			System.out.println(i + " ");
			
			}
		else
		{
			System.out.println("Stack is in underflow"); 
		}
		
	}

}
