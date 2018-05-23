package com.lecture_tues_inheritance;

public class BasiCalculator implements Calculator{

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
