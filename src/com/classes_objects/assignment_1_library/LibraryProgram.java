package com.classes_objects.assignment_1_library;

import java.util.ArrayList;
import java.util.*;

public class LibraryProgram {

	public static void main(String[] args) {
/*		// Declare and define variables to create a library
		// Declare number of libraries you want to create
		String name;
		String address;
		int phone;
		List<Book> books;
		List<Customer> customers;
		
		
		
		// Declare and define variables to create a Book
		// Declare number of books you want to create
		String author;
		int isbn;
		String title;
		int numberOfPages;
		int quantity;
		
		// Declare and define variables to create a Customer
		// Declare number of customers you want to create
		String name;
		String address;
		int phone;
		List<Book> books;*/

		// Create library
		// Library lib = new Library(name, address, phone, books, customers);
		Library lib = new Library("Cliff Cave", "1212 Grand Blvd., Meramec, MO 63106", 3144221988l);
		
		
		// Create list to hold customers
		List<Customer> customerList = new ArrayList<>();
		
		// Create customer
		// Customer customer = new Customer(address, address, phone, books);
		Customer customer = new Customer("Dante Washington", "405 Union Blvd., St. Louis, MO 53115", 636-222-5555);
		
		// Create list to hold books
 
		
		// Create book
		// Book book = new Book(author, isbn, title, numberOfPages, quantity, libraryBookIsAssociated);
		Book book1 = new Book("Mike", 123, "My First Book", 200, 3, lib);
		Book book2 = new Book("Darnell", 543, "The Road Upward", 500, 2, lib);

		
		// Add book to customer
		customer.addBookToBooks(book1);
		customer.addBookToBooks(book2);
		
		//customer.setBooks(books);
		
		// Add book to libraryBookList
		lib.addBookToLibraryBookList(book1);
		lib.addBookToLibraryBookList(book2);
		
		
		// CountTotalLibraryBooks
		int totalBooks = lib.countTotalLibraryBooks();
		System.out.println(totalBooks);
			
		//	Get the name of library a book is associated with.
		book1.getLibraryBookIsAssociated();
		book2.getLibraryBookIsAssociated();
		
		// Add new customer's to the list of customer for a particular library.	
		customerList.add(customer);
		
		// Print out a customer's name and all the books, checked out under their names.
		System.out.println(customer.getName() + ":  ");
		
		// System.out.println(customer.getCustomerBooks());
		customer.getCustomerBooks();
	}
}
