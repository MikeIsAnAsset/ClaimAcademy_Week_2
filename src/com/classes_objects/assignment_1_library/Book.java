package com.classes_objects.assignment_1_library;

public class Book {
	private String title, author;
	private int isbn, numberOfPages, quantity;
	private Library libraryBookIsAssociated;
	
	
	public Book(String author, int isbn, String title, int numberOfPages, int quantity, Library libraryBookIsAssociated) {
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.quantity = quantity;
		this.libraryBookIsAssociated = libraryBookIsAssociated;
	}
		
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the numberOfPages
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}
	/**
	 * @param numberOfPages the numberOfPages to set
	 */
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public Library getLibraryBookIsAssociated() {
		return libraryBookIsAssociated;
		
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", numberOfPages=" + numberOfPages
				+ ", quantity=" + quantity + ", libraryBookIsAssociated=" + libraryBookIsAssociated + "]";
	}


	
	
	
	
}
