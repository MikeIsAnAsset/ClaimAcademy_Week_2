package com.classes_objects.assignment_1_Box;

public class Box {
	
	// Declare fields
	private double cost; // cost of material per square inch
	private double height;  // in inches
	private double length;  // in inches
	private double depth;  // in inches
		
	// Constructors
	public Box(double cost, double height, double length, double depth) {
		super();
		this.cost = cost;
		this.height = height;
		this.length = length;
		this.depth = depth;
	}

	// Method Behaviors
	// Volume = length x width x height.
	public double calculateVolume(double height, double length, double depth){
		double volume;
		
		volume = length * depth * height;
		return volume;
		
	}
	
	// A = 2wl + 2lh + 2hw
	public double calculateSurfaceArea(double height, double length, double depth){
		double surfaceArea;
		
		surfaceArea = (2*depth*length) + (2*height*length) + (2*height*depth);
		return surfaceArea;
		
	}
	
	// cost of material per square inch
	public double calculateCost(double cost, double height, double length, double depth){
		// A = lw of height in inches
		double areaSidesSet1 = 2 * length * height;
		
		// A = lw of height in inches
		double areaSidesSet2 = 2 * length * depth;
		
		// A = lw of length
		double areaSidesSet3 = 2 * depth * height;
		
		double totalArea = areaSidesSet1 + areaSidesSet2 + areaSidesSet3;
		
		double totalCost = cost * totalArea;
	
		return totalCost;
		
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the depth
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * @param depth the depth to set
	 */
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	
}
