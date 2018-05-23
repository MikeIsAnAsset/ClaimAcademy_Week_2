package com.lecture_mon_lab_students;

public class Student {

	private String name;
	private int age;
	private int sID;
	private double gpa;
	
	public Student(String name, int age, int sID, double gpa) {
		super();
		this.name = name;
		this.age = age;
		this.sID = sID;
		this.gpa = gpa;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sID=" + sID + ", gpa=" + gpa + "]";
	}


	
	
}
