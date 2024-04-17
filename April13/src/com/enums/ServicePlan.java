package com.enums;

public enum ServicePlan {
    SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double minBalance;
	
	ServicePlan(double minBalance)
	{
		this.minBalance=minBalance;
	}
	
	public double getBalance() {
		return minBalance;
	}
	
	public void setBalance(double minBalance) {
		this.minBalance=minBalance;
	}
	
	public String toString() {
		return " "+name() +" --> " + minBalance +" ";
	}
	
}
