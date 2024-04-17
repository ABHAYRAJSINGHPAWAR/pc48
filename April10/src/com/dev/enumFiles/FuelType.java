package com.dev.enumFiles;

public enum FuelType {
	PETROL,DIESEL,CNG,ELECTRIC;
	
	public String toString() {
		return name().toLowerCase();
	}

}
