package com.classes_objects.assignment_1_library;

import java.util.ArrayList;
import java.util.*;

public class LibraryProgram {

	public static void main(String[] args) throws Exception {
		// Declare and define variables
		Scanner inString = new Scanner(System.in);
		Scanner inLong = new Scanner(System.in);
		String doWhileCondition = "Y";
		Library lib = null;
		ArrayList<Library> libraries = new ArrayList<>();
		
		while (!doWhileCondition.equals("N")){
			System.out.print("Enter the name of the library: ");
			String name = inString.nextLine();
			
			System.out.print("Enter the address of the library: ");
			String address = inString.nextLine();
			
			System.out.print("Enter the phone of the library: ");
			// inString.hasNextLong();
			/*try {
				in.hasNextDouble();
			} catch (InputMismatchException exception) {
		        throw new(Exception()); System.out.println("Enter only numbers.");;
				
			}*/
			/**
			 * @TODO validation to make sure user a number
			 */
			long phone = inLong.nextLong();
			
			// Create library
			libraries.add(new Library(name, address, phone));
			// lib = new Library(name, address, phone);
			// Library lib = new Library("Cliff Cave", "1212 Grand Blvd., Meramec, MO 63106", 3144221988l);
				
			/**
			 * @TODO validation to make sure user enters Y or N
			 */
			System.out.print("Do you have another library to create?  Enter Y or N: ");
			doWhileCondition = inString.nextLine();	
		}
		// inString.close();
		inLong.close();
		System.out.println("The libraries are: " + libraries);
		lib = new Library("Cliff Cave", "1212 Grand Blvd., Meramec, MO 63106", 3144221988l);
		
		
		
		// Create customer
		// Check to see if you are really a new customer or already exist
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter customer name: ");
		String nameAlreadyExistsTest = scan.next();
		for (int i=0; i<libraries.size(); i++) {
		// for (Library libIterator : libraries) {
			// if (libIterator.getName() == nameAlreadyExistsTest) {
			if (libraries.get(i).getName() == nameAlreadyExistsTest) {
			
			
			
			
			// if (libIterator.getName().equals(nameAlreadyExistsTest)) {
				System.out.println("Name already exists");
			}
			System.out.println("This is a new customer");
		}
		
		
		
		
		// Customer customer = new Customer(address, address, phone);
		Customer customerDante = new Customer("Dante Washington", "405 Union Blvd., St. Louis, MO 53115", 636-222-5555);
		Customer customerShameka = new Customer("Shameka Lewis", "37 Spring St., St. Louis, MO 62121", 618-333-4444);

		// Create list to hold books
 
		

		// Create book
		// Book book = new Book(author, isbn, title, numberOfPages, quantity, libraryBookIsAssociated);
		Book book1 = new Book("Mike", 123, "My First Book", 200, 3, lib);
		Book book2 = new Book("Darnell", 543, "The Road Upward", 500, 2, lib);

		
		// Add book to customer
		customerDante.addBookToBooks(book1);
		customerDante.addBookToBooks(book2);
		
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
		lib.customers.add(customerDante);
		lib.customers.add(customerShameka);
		System.out.println(lib.getCustomers());
		
		// Print out a customer's name and all the books, checked out under their names.
		System.out.println(customerDante.getName() + ":  ");
		System.out.println(customerShameka.getName() + ":  ");
		
		// System.out.println(customer.getCustomerBooks());
		customerDante.getCustomerBooks();
	}
}
