package com.classes_objects.assignment_1_library;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private Address address;
	private String address2;
	private String phone;
	private List<Book> customerBooks=new ArrayList<Book>();
	
	// Constructor using address
	public Customer(String name, Address address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public Customer(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	// Constructor using address2
	public Customer(String name, String address2, String phone) {
		super();
		this.name = name;
		this.address2 = address2;
		this.phone = phone;
	}

	public Customer(String name, String address2) {
		super();
		this.name = name;
		this.address2 = address2;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}

	
	
	// This is a custom method
	public void getCustomerBooks() {
		for (Book b : customerBooks) {
			System.out.println(b);
		}
	}
	
/*	public List<Book> getCustomerBooks() {
		return customerBooks;
	}*/



	

	public void setCustomerBooks(List<Book> customerBooks) {
		this.customerBooks = customerBooks;
	}

	// Custom method to add a book to the list of books the customer checked out
	public void addBookToBooks(Book book) {
		customerBooks.add(book);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

	
	
	
	
}
