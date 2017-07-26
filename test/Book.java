package test;

import javax.naming.spi.ObjectFactoryBuilder;

public class Book implements Cloneable {
	private String name;
	private Author author;
	private double price;
	int qty = 0;

	public Book(String name, Author author, double price, int qty) {
		super();
		Author temp = author;
		this.name = name;
		this.author = temp;
		this.price = price;
		this.qty = qty;
	}

	public Book(String name, Author author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
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

	public Object clone() {
		Book book = null;
		try {
			book = (Book) super.clone();
			book.author = (Author) author.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return book;
	}

	public String toString() {
		String temp = "Book[name=%s,Author[name=%s,email=%s,gender=%s],price=%s,qty=%s]";
		return String.format(temp, name, author.getName(), author.getEmail(), author.getGender(), price, qty);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Book) {
			Book book = (Book) obj;
			if (this.getAuthor().getEmail().equals(book.getAuthor().getEmail())
					&& this.getName().equals(book.getName())) {
				return true;
			}
		}
		return false;

	}
	public int hashCode() {
		return 1;
	}

}
