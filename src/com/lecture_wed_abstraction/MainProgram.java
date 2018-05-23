package com.lecture_wed_abstraction;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the amount to deposit: ");
		double depositAmount = in.nextDouble();
		
		System.out.println("Enter the amount to withdraw: ");
		double withdrawAmount = in.nextDouble();
		
		SavingsAccount savingsAcct1 = new SavingsAccount();
		
		savingsAcct1.deposit(depositAmount);
		savingsAcct1.withdraw(withdrawAmount);
		savingsAcct1.annualInterest(3);
		
		
	}



}
