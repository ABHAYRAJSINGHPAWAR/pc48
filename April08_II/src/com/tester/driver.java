package com.tester;

import java.util.Scanner;

import com.customer.Customer;
import com.dev.fun.FixedStack;
import com.dev.fun.GrowableStack;
import com.exception.OutOfBoundException;
import com.interfac.Stack;

public class driver {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws OutOfBoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		Stack s = null;
		while(!exit) {
		switch (selectChoice(sc)) {
		case 1:
			if (s == null) {
				s = new FixedStack();

			} else
				System.out.println("YOu have Already Selected Stack");
			break;
		case 2:
			if (s == null) {
				s = new GrowableStack();

			} else {
				System.out.println("YOu have Already Selected Stack");
			}
			break;

		case 3: System.out.println("Enter ID Name ADDRESS");
			Customer c = new Customer(sc.nextInt(),sc.next(),sc.next());
			s.push(c);
			break;

		case 4:
			s.pop();
			
			
			break;

		case 0:exit = true;
			break;
		default: {
			System.out.println("Wrong Choice");
		}
		}
		}
		sc.close();
	}
	public static int selectChoice(Scanner sc) {
		System.out.println("1:Fixed Stack");
		System.out.println("2:Growable Stack");
		System.out.println("3:Push");
		System.out.println("4:PoP");
		System.out.println("0:Exit");
		System.out.println("Enter Your choice");
		return sc.nextInt();
	}

}
