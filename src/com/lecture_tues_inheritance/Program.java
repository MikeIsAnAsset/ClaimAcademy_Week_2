package com.lecture_tues_inheritance;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Create an object of Basic Calculator
		// Get user input for variabnles and b
		// Call the sum() and subtract() methods
		
		BasiCalculator bcal1 = new BasiCalculator();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter int for variable a: ");
		int a = in.nextInt();
		System.out.print("Enter int for variable b: ");
		int b = in.nextInt();

		System.out.println("The sum is: " + bcal1.sum(a, b));
		System.out.println("The difference is: " + bcal1.subtract(a, b));
		
	}

}
