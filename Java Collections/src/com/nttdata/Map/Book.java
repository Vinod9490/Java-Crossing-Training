package com.nttdata.Map;

public class Book implements Comparable<Book> {
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + "]";
	}
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	
	public Book(int bookId, String bookName, String bookAuthor, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(o.getBookId()<this.getBookId())
		{
			return 1;
		}
		else if(o.getBookId()>this.getBookId())
		{
			return -1;
		}
		return 0;
	}
	
	
	
	

}
