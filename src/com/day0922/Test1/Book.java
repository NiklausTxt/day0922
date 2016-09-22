package com.day0922.Test1;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;

	public Book(String name, Author author, double price) {
		this.author = author;
		this.name = name;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		this.author = author;
		this.name = name;
		this.price = price;
		this.qty=qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}
	
	public String toString(){
		return "Book[name="+name+","+author.toString()+
				",price="+price+",qty="+qty+"]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Author author = new Author(this.author.getName(),this.author.getEmail(),this.author.getGender());
		Book book = new Book(this.name, author, this.price, this.qty);
		return book;
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Book)) return false;
		Book book = (Book) obj;
		return book.name==this.name && book.author.getEmail().equals(this.author.getEmail());
	}
}
