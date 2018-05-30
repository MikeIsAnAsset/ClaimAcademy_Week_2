package com.lecture_wed_interfaces;

public interface Person {
	public double taxes(double amount);
	public default double testToBreak(double amount) {
		return amount;
	}
	
}
