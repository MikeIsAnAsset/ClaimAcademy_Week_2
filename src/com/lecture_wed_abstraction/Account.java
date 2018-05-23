package com.lecture_wed_abstraction;

public abstract class Account {
	protected double balance = 400;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// methods
	public void deposit(double amount) {
		balance += amount;
		System.out.println("The new balance after deposit is: " + balance);
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("The new balance after withdrawal is: " + balance);
	}
	
	public abstract void annualInterest(double interest);
	
}
