package com.multi.day21;

public class Prob5 {
	public static void main(String[] args) {
		Book b1 = new Book("자바의 정석", 25000);
		Book b2 = new Book("자바의 정석", 25000);
		System.out.println(b1);
		System.out.println(b2);
		if (b1.equals(b2)) {
			System.out.println("두권의 책은 제목과 가격이 일치합니다.");
		} else {
			System.out.println("두권의 책은 제목과 가격이 일치하지 않습니다.");
		}
	}

	static class Book {
		String title;
		int price;
		
		public Book(String title, int price) {
			this.title = title;
			this.price = price;
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", price=" + price + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Book)) return false;
			Book b = (Book) obj;
			return  title.equals(b.title) && price ==b.price;
		}

	}
}
