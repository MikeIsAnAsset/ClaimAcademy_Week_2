package com.classes_objects.assignment_1_library;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.ByteBuffer;
import java.util.*;

public class LibraryProgram {

	public static void main(String[] args) {
		// Declare and define variables
		Scanner inString = new Scanner(System.in);
		Scanner inNumericValues = new Scanner(System.in);
		String doWhileCondition = "Y";
		//Library lib = null;
		ArrayList<Library> libraries = new ArrayList<>();
		String printout;
		
// Creating libraries
		while (!doWhileCondition.equals("N")){
			System.out.print("Enter the name of the library: ");
			String name = inString.nextLine();
			
			// Create library address
			printout = "Enter the library's address by FIRST entering the street number: ";
			Address address = createAddress(printout);
			
			// Ask for library phone number and validate it is a valid phone number
			String phone = "";
			do {
				System.out.print("Enter the phone of the library: ");
				phone = inString.nextLine();
			} while (!validatePhoneNumber(phone));
			
	
			
			
			
			
			
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
		
		
// Samples for testing:
		// Create library so code executes down below
		Library lib = new Library("Central", "4210 Olive Blvd., St Louis, MO 63113", "3149991231l");
		
		
		// Add library to list of libraries
		libraries.add(new Library("Cliff Cave", "1212 Grand Blvd., Meramec, MO 63106", "3144221988l"));
		
		// Create new customer
		Customer customerTykesha = new Customer("Tykesha Johnson", "3038 Page Ave, St. Louis, MO 63106", 618-333-4444);

		
// Creating customers
		// TODO - check to see if customer already exists in any library
		

		System.out.print("Enter the customer name: ");
		String customerName = inString.nextLine();
		
		boolean isCustomerInAnyLibrary = false;
		for (Library libIterator : libraries) {
			for (int i=0; i < libIterator.getCustomers().size(); i++) {
				if (libIterator.customers.get(i).equals(customerName)) {
			// if (libIterator.getName().equals(nameAlreadyExistsTest)) {
					isCustomerInAnyLibrary = true;
					System.out.println("Customer " + customerName + "already exists in " + libIterator.getName());
					// TODO - if found, get user input if user wants to move customer from one library to another.
//		 			
					
				} 
			} 
		}// TODO if not found, create new customer
		
		printout = "Enter the customer's address by FIRST entering the street number: ";
		Address address = createAddress(printout);
		
		String phone = "";
		do {
			System.out.print("Enter the phone of the customer: ");
			phone = inString.nextLine();
		} while (!validatePhoneNumber(phone));
		
		// Create customer				
		Customer customer = new Customer(customerName, address, phone);
		System.out.println("Customer " + customer + "created.");
		
	// ADD CUSTOMER TO LIBRARY:
		// Display libraries
			System.out.println("The libraries are: " + libraries);
					
		// Get input for which library you want to add to?
			System.out.print("Enter the name of the library you want the customer to be added to: ");
			String inputLibraryName = inString.nextLine();
			
		// Find the library in the list of libraries
			
			/*Using the old For Loop:
			for (int i=0; i<libraries.size(); i++) {
				if (libraries.get(i).getName() == inputLibraryName) {}*/
				
			
			// Using For-each / Enhanced For Loop
			boolean isLibraryFound = false;
						
			for (Library libIterator : libraries) {
				if (libIterator.name.equals(inputLibraryName)) {
					// if (libIterator.getName().equals(inputLibraryName)) {
					System.out.println("Library found is: " + libIterator.getName());
					isLibraryFound=true;
					
					// Add customer to library's customer list				
					libIterator.customers.add(customerTykesha); // this is for testing
					libIterator.customers.add(customer);
					System.out.println(libIterator.customers);
				}
			}
			if(isLibraryFound==false)
				System.out.println("Library not found, customer cannot be added");
				// TODO Do you want to add a new library?  Maybe this option should not be available here...???
			
			
			// TODO Do you want to create another new customer?
			
			
			
			
		// lib.customers.add(customerTykesha);
		
		
		// Create customer
		// Check to see if you are really a new customer or already exist
		//Scanner scan1 = new Scanner(System.in);
		//String nameAlreadyExistsTest="";
		//System.out.print("Enter library name: ");
		//if (scan.hasNextLine()) {
			//nameAlreadyExistsTest = scan.next();
		//String nameAlreadyExistsTest= inString.nextLine();
		//}

		
		inString.close();
		inNumericValues.close();
		
		
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
	
	public static Address createAddress(String printout) {
		Scanner inString = new Scanner(System.in);
		Scanner inNumericValues = new Scanner(System.in);
		
		System.out.print(printout);
		int streetNum = inNumericValues.nextInt();
		System.out.print("Enter the street name: ");
		String street = inString.nextLine();
		System.out.print("Enter the city: ");
		String city = inString.nextLine();  // used this vs next() because this string can contain spaces.
		System.out.print("Enter the state: ");
		String state = inString.nextLine();
		System.out.print("Enter the zip: ");
		int zip = inNumericValues.nextInt();

/*		inString.close();
		inNumericValues.close();*/
		
		Address address = new Address(streetNum, street, city, state, zip);
		return address;
	}
	
	public static boolean validatePhoneNumber(String phone) {
/*		byte[] bytes = ByteBuffer.allocate(8).putLong(phone).array();
		String strPhone = new String(bytes);
		CharSequence charPhone = phone;*/
        
		// String phoneNumber = "1-(80..2)-321-0361";
        // System.out.println(phoneNumber.length());
        String regex = "^\\+?[0-9. ()-]{10,25}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        if (matcher.matches()) {
            System.out.println("Phone Number Valid");
        	return true;
        } else {
            System.out.println("Phone Number must be in the form XXX-XXXXXXX");
            return false;
        }
	}
}
