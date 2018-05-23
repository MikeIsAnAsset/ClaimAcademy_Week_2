package com.classes_objects.assignment_1_Box;

import java.util.Scanner;

public class BoxProgram {

	public static void main(String[] args) {
		// Get input; Declare and define variables
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter cost of material per square inch: ");
		double cost = in.nextDouble();
		
		System.out.print("Enter the height in inches: ");
		double height = in.nextDouble();
		
		System.out.print("Enter the length in inches: ");
		double length = in.nextDouble();
		
		System.out.print("Enter the depth in inches: ");
		double depth = in.nextDouble();
		
		// Create box object
		Box box1 = new Box(cost, height, length, depth);
			box1.setCost(cost);
			box1.setHeight(height);
			box1.setLength(length);
			box1.setDepth(depth);
		
		// Print double Volume, Surface Area and Total Cost of box
		double volume = box1.calculateVolume(height, length, depth);
		double surfaceArea = box1.calculateSurfaceArea(height, length, depth);
		double totalCost = box1.calculateCost(cost, height, length, depth);

		System.out.println("The volume of the box is: " + volume);
		System.out.println("The surface area of the box is: " + surfaceArea);
		System.out.println("The totalCost of the box is: $" + totalCost);
	}

	// Create methods
}
