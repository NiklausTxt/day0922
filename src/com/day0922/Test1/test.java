package com.day0922.Test1;

public class test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Author author1 = new Author("����", "1234521@12.com", 'M');
		Author author2 = new Author("����", "dfessdd@12.com", 'F');
		Author author3 = new Author("����", "dfessdd@12.com", 'M');
		Book book1 = new Book("���μ�", author1, 34, 5);
		Book book2 = new Book("��¥��", author2, 34, 5);
		Book book3 = new Book("���μ�", author1, 35, 1);
		Book book4 = new Book("��¥��", author3, 35, 1);
		Book book5 = (Book) book1.clone();
		
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		System.out.println(book5.toString());
		System.out.println(book2.equals(book4));
		System.out.println(book1.equals(book5));
		
	}
}
