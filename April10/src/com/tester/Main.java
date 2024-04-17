package com.tester;

//import static com.dev.fun.ValidationRule.validateSpeed;
import static com.dev.fun.ValidationRule.*;

import java.util.Scanner;

import com.dev.enumFiles.FuelType;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try  {	
			System.out.println("Enter the Speed");
			validateSpeed(sc.nextInt());
			System.out.println("You are a good Driver ");
		} catch (Exception e) {
			System.out.println("You are not a good Driver");
			e.printStackTrace();
		}

		try {

			for (FuelType f : FuelType.values()) {
				System.out.println(f);
			}

			System.out.println("Choose your fuel Type");
			validateFuel(sc.next());

		} catch (Exception e) {
            e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Enter your License Expiry date in dd-mm-yyyy format ");
			validateLicense(sc.next());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
        sc.close();
	}

}
