package com.lecture_wed_interfaces;

public class Student implements Person  {

	@Override
	public double taxes(double amount) {
		
		return amount * .02;
	}

}
