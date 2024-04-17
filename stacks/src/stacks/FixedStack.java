package stacks;

import java.util.Scanner;

public class FixedStack implements StackInterface{
	int size = STACK_SIZE;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	Customer[] stack = new Customer[size];
	@Override
	public void pop() {
		if(stack[0]==null) {
			System.out.println("Stack is empty");
		}else {
		count--;
		System.out.println(stack[count]);
		stack[count]=null;
		}
	}

	@Override
	public void push() {
		if(count==size) {
			System.out.println("Stack is full");
		}else {
		stack[count] = new Customer(sc.nextInt(),sc.next(),sc.next());
		count++;
		}
		
	}

	@Override
	public void show() {
		for(Customer c:stack) {
			System.out.println(c);
		}
		
	}
	
}
