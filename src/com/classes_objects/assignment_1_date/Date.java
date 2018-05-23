package com.classes_objects.assignment_1_date;

public class Date {

	
	// Declare and define variables
	int month =0;
	int day;
	int year;
	
	//Constructor
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	// Method behavior
	public void displayDate() {
		this.getMonth();
		this.getDay();
		this.getYear();
		System.out.println(month + "/" + day + "/" + year);
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
}