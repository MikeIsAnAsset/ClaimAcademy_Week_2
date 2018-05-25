package com.classes_objects.assignment_1_library;

public class Address {
	private int streetNum;
	private String Street;
	private String city;
	private String state;	
	private int zip;

	public Address(int streetNum, String street, String city, String state, int zip) {
		super();
		this.streetNum = streetNum;
		Street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	

	
}
