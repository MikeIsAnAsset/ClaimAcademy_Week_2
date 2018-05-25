package com.classes_objects.assignment_1_library;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String address;
	private long phone;
	private List<Book> customerBooks=new ArrayList<Book>();
	
	public Customer(String name, String address, long phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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
