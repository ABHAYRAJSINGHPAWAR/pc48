package com.dev.fun;

import com.exception.SpeedingException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.dev.enumFiles.FuelType;
import com.exception.FuelTypeException;
import com.exception.LicenseException;

public class ValidationRule {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;

	static {
		MIN_SPEED = 30;
		MAX_SPEED = 100;
	}

	public static void validateFuel(String str) throws FuelTypeException {
		for(FuelType f:FuelType.values()) {
			if(f.name().equalsIgnoreCase(str)) {
				System.out.println("Matched....");
				return;
			}
		}
		throw new FuelTypeException("Sorry Your vechile Fuel is not Available Here");
		
	}

	public static void validateSpeed(int speed) throws SpeedingException {
		if (speed < MIN_SPEED) {
			throw new SpeedingException(" Much Fuel Consumption at Speed " + speed);
		} else if (speed > MAX_SPEED) {
			throw new SpeedingException(" Excess speed ,You may GO to Hell at Speed " + speed);
		}
	}
	
	public static void validateLicense(String str) throws LicenseException{
		try {
			Date date=new SimpleDateFormat("dd-MM-yyyy").parse(str);
			Date currDate=new Date();
			if (date.after(currDate))
			{
				System.out.println("Valid");
			}
			else
				System.out.println("Invalid");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
