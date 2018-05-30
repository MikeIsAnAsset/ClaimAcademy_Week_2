package com.lab_fri.loan_approver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MainProgram {

	public static void main(String[] args) {
		// Declare and define variables
		long twoDigitIndex = ThreadLocalRandom.current().nextLong(00, 99 + 1);
		String firstTwoLettersOfName;
		int threeDigitNumber = ThreadLocalRandom.current().nextInt(100, 999 + 1);
		
		// Get user input; Declare and define variables
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter person's name: ");
		String name = in.nextLine();
		
		String birthDate = "";
		do {
			//birthDate = "";
			System.out.print("Enter the birth date: ");
			birthDate = in.nextLine();
			} while (isDateValid(birthDate) == false);
		
		
		
		
		
		
		
		System.out.print("Enter credit score: ");
		int creditScore = in.nextInt();
				
		System.out.print("Enter last year's reported taxable income: ");
		double lastYearReportedTaxableIncome = in.nextDouble();
		
		System.out.print("Enter loan amount needed: ");
		double loanAmountNeeded = in.nextDouble();

		// Get first two letters of name
		firstTwoLettersOfName = name.substring(0, 2).toUpperCase();

		// Create loan ID
		LoanID loanId = new LoanID(twoDigitIndex, firstTwoLettersOfName, threeDigitNumber);
		
		// Create loan application
		LoanApplication app1 = new LoanApplication(loanId, name, birthDate, creditScore, lastYearReportedTaxableIncome, loanAmountNeeded);
		
		// Declare and define methods
		// Determine if approved and output decision with loanID
		if (app1.isScoreAbove(creditScore) == true &&
				app1.isLoanAmountAboveLimit(lastYearReportedTaxableIncome, loanAmountNeeded) == false) {
			if (app1.calculateAverageThreeMonthsIncome(lastYearReportedTaxableIncome) >= 12000){
				System.out.println("LoanID #" + app1.getId() + " is APPROVED");
			} else {
				System.out.println("LoanID #" + app1.getId() + " is DENIED");
			}
		} else {
			System.out.println("LoanID #" + app1.getId() + " is DENIED");
		}
		
	}
	// Declare and define methods
	public static boolean isDateValid(String birthDate) {
		
			try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			LocalDate date = LocalDate.parse(birthDate, formatter);
			// System.out.printf("%s%n", date);
			}
			catch (DateTimeParseException exc) {
				System.out.printf("%s is not valid.%nPlease try again using MM/dd/yyyy %n", birthDate);
				return false;
			}
			return true;
	}
}
