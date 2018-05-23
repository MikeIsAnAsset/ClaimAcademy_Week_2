package com.lecture_wed_abstraction;

import java.text.DecimalFormat;

public class SavingsAccount extends Account {
	
	private double principal;
	private int numOfYears;
	private double annualInterest;
	
	public void annualInterest(double interest){
		DecimalFormat df = new DecimalFormat("#.##");
		annualInterest = balance * (interest / 100);
		System.out.println("The annual interest is: $" + df.format(annualInterest));
	}
}
