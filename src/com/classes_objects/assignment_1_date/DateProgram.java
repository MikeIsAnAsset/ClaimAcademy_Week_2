package com.classes_objects.assignment_1_date;

import java.util.Scanner;

public class DateProgram {

	public static void main(String[] args) {
		// Get user input; declare and define variables
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a two digit month: ");
		int month = in.nextInt();
		System.out.print("Enter a two digit day: ");
		int day = in.nextInt();
		System.out.print("Enter a four digit year: ");
		int year = in.nextInt();
		
		Date date = new Date(month, day, year);
		date.displayDate();
	}
}
