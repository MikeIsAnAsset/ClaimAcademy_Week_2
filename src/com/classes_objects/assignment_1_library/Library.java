package com.classes_objects.assignment_1_library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	protected String name;
	private Address address;
	private String address2; //just for test purposes
	private String phone;
	private List<Book> libraryBookList = new ArrayList<Book>(); 
	protected List<Customer> customers = new ArrayList<Customer>();
	
	// constructor
	public Library(String name, Address address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public Library(String name, String address2, String phone) {
		this.name = name;
		this.address2 = address2;
		this.phone = phone;	}

	// Getters and Setters
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
	public void setAddress2(String address2) {
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


	
	public List<Book> getLibraryBookList() {
		return libraryBookList;
	}

	public void setLibraryBookList(List<Book> libraryBookList) {
		this.libraryBookList = libraryBookList;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	// Custom methods
	// Add book to libraryBookList
	public void addBookToLibraryBookList(Book book) {
		libraryBookList.add(book);
	}
	
	// Add customer to customer list
	public void addCustomerToCustomer(Customer customer) {
		customers.add(customer);
	}
	
	//	Count the total number of books in the library.
	public int countTotalLibraryBooks() {
		int totalBooks=0;
		for (Book b : libraryBookList) {
			totalBooks += 1;
		}
		return totalBooks;
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", address=" + address + ",  address2=" + address2 + "phone=" + phone +"]";
	}
	
	
	
}
