package com.multi.day05;

class Book {
	String title;
	int price;
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	@Override //Annotation=>컴파일러가 해석을 하는 주석
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
}

public class AnnotationTest {
	public static void main(String[] args) {
		// 주석->사람에게 소스코드를 설명하기위해 사용
		// 컴파일러가 무시...해석안함
		Book b = new Book("자바",30000);
		System.out.println(b);
	}
}
