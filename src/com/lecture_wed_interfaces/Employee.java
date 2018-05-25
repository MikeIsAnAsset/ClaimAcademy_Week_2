package com.lecture_wed_interfaces;

public class Employee implements Person {

	@Override
	public double taxes(double amount) {
		// TODO Auto-generated method stub
		return amount * .2;
	}

}
