package com.classes_objects.assignment_1_library;

public class Address {
	private int streetNum;
	private String street;
	private String city;
	private String state;	
	private int zip;

	public Address(int streetNum, String street, String city, String state, int zip) {
		super();
		this.streetNum = streetNum;
		this.street = street;
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
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", Street=" + street + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", getStreetNum()=" + getStreetNum() + ", getStreet()=" + getStreet()
				+ ", getCity()=" + getCity() + ", getState()=" + getState() + ", getZip()=" + getZip() + "]";
	}
	

	
}
