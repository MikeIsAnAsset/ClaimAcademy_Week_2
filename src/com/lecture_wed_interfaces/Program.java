package com.lecture_wed_interfaces;

public class Program {

	public static void main(String[] args) {

		Student s1 = new Student();
		Employee e1 = new Employee();
		
		double taxes = s1.taxes(120.5);
		System.out.println(taxes);
		
		taxes = e1.taxes(120.5);
		System.out.println(taxes);
		
		;
		System.out.println(e1.testToBreak(125));
		System.out.println(s1.testToBreak(125));
		
		
		
	}

}
