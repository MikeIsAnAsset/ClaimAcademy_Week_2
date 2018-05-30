package com.lab_fri.loan_approver;

public class LoanApplication {
	// Declare and define variables
	private LoanID id;
	private String name;
	private String birthDate;
	private int creditScore;
	private double averageIncome;
	private double lastYearReportedTaxableIncome;
	private double loanAmountNeeded;
	

	// Constructors
	public LoanApplication(LoanID id, String name, String birthDate, int creditScore, double lastYearReportedTaxableIncome, double loanAmountNeeded) {

		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.creditScore = creditScore;
		this.lastYearReportedTaxableIncome = lastYearReportedTaxableIncome;
		this.loanAmountNeeded = loanAmountNeeded;
	}

	
	// Getters & Setters
	public LoanID getId() {
		return id;
	}

	public void setId(LoanID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public double getAverageIncome() {
		return averageIncome;
	}

	public void setAverageIncome(double averageIncome) {
		this.averageIncome = averageIncome;
	}

	public double getLastYearReportedTaxableIncome() {
		return lastYearReportedTaxableIncome;
	}

	public void setLastYearReportedTaxableIncome(double lastYearReportedTaxableIncome) {
		this.lastYearReportedTaxableIncome = lastYearReportedTaxableIncome;
	}

	public double getLoanAmountNeeded() {
		return loanAmountNeeded;
	}

	public void setLoanAmountNeeded(double loanAmountNeeded) {
		this.loanAmountNeeded = loanAmountNeeded;
	}
	
	
	// Custom Methods
	// Determine if score is above 600
	public boolean isScoreAbove(int creditScore) {
		if (creditScore > 600) {
			return true;
		} else {
			return false;
		} 
	}
	
	// Check that loan amount is no more than 5 times the previous year's income
	public boolean isLoanAmountAboveLimit(double lastYearReportedTaxableIncome, double loanAmountNeeded){
		if (loanAmountNeeded > ( 5 * lastYearReportedTaxableIncome)) {
			return true;
		} else {
			return false;
		}
	}
	
	public double calculateAverageThreeMonthsIncome(double lastYearReportedTaxableIncome) {
		double monthlyIncome = lastYearReportedTaxableIncome / 12;
		return (monthlyIncome * 3) / 3;
	}


	@Override
	public String toString() {
		return "LoanApplication [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", creditScore="
				+ creditScore + ", averageIncome=" + averageIncome + ", lastYearReportedTaxableIncome="
				+ lastYearReportedTaxableIncome + ", loanAmountNeeded=" + loanAmountNeeded + "]";
	}
	

	
	
	
	// ToString for nice printing
	
	
	
}
