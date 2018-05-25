package com.classes_objects.assignment_1_library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	protected String name;
	private String address;
	private long phone;
	private List<Book> libraryBookList = new ArrayList<Book>(); 
	protected List<Customer> customers = new ArrayList<Customer>();
	
	// constructor
	public Library(String name, String address, long phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

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
		return "Library [name=" + name + ", address=" + address + ", phone=" + phone +"]";
	}
	
	
	
}
