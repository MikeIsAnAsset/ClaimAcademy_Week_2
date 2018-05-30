package com.lab_fri.loan_approver;

import java.util.concurrent.ThreadLocalRandom;

public class LoanID {
	// Declare and define variables
	long twoDigitIndex = ThreadLocalRandom.current().nextLong(00, 99 + 1);
	String firstTwoLettersOfName;
	int threeDigitNumber = ThreadLocalRandom.current().nextInt(100, 999 + 1);

	// Constructors
	public LoanID(long twoDigitIndex, String firstTwoLettersOfName, int threeDigitNumber) {
		super();
		this.twoDigitIndex = twoDigitIndex;
		this.firstTwoLettersOfName = firstTwoLettersOfName;
		this.threeDigitNumber = threeDigitNumber;
	}

	@Override
	public String toString() {
		return twoDigitIndex + firstTwoLettersOfName + threeDigitNumber;
	}



}
