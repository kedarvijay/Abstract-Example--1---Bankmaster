package com.bank;

public abstract class BankMaster {
	private int acno;
	private String achname;
	private double depAmount;
	public void openAccount(String achname, double depAmount) {
		this.acno=(int)(Math.random()*10000);
		this.achname=achname;
		this.depAmount=depAmount;
		
	}
	public void viewDetails() {
		System.out.println("Account no >>"+this.acno);

		System.out.println("Account Holder >>"+this.achname);

		System.out.println("Deposit Amount >>"+this.depAmount);
	}
	
	public double getDepAmount() {
		return depAmount;
	}
	public void setDepAmount(double depAmount) {
		this.depAmount = depAmount;
	}
	public int getAcno() {
		return acno;
	}
	public String getAchname() {
		return achname;
	}
	public abstract double credit(double amount);

	public abstract double debit(double amount);
}
