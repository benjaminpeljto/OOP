package tut_week6;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;
	
	public Library() {
		books = new ArrayList<>();
	}
	
	public void addBook(Book newBook) {
		this.books.add(newBook);
	}
	
	public void printBooks() {
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	
	public ArrayList<Book> searchByTitle(String title){
		ArrayList<Book> searched = new ArrayList<>();
		for (Book book : this.books) {
			if(StringUtils.included(book.title(), title)) {
				searched.add(book);
			}
		}
		return searched;
	}
	
	public ArrayList<Book> searchByPublisher(String publisher){
		ArrayList<Book> searched = new ArrayList<>();
		for (Book book : this.books) {
			if(StringUtils.included(book.publisher(), publisher)) {
				searched.add(book);
			}
		}
		return searched;
	}
	
	public ArrayList<Book> searchByYear(int year){
		ArrayList<Book> searched = new ArrayList<>();
		for (Book book : this.books) {
			if(book.year() == year) {
				searched.add(book);
			}
		}
		return searched;
	}
	
}
