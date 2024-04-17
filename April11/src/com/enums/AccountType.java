package com.enums;

public enum AccountType {
SAVING(2000),CURRENT(10000),DMAT(100),FD(500);
	
	private double minBalance;
	
	AccountType(double bal) {
		this.minBalance =bal;
	}
	
	public double getMinBalance() {
		return  minBalance;
	}
	
	
	public void setBalance(double minBalance) {
		this.minBalance=minBalance;
	}
	
	@Override
	public String toString() {
		return name() + "--->" +minBalance;
	}
}
