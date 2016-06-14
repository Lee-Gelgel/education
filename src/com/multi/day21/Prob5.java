package com.multi.day21;

public class Prob5 {
	public static void main(String[] args) {
		Book b1 = new Book("�ڹ��� ����", 25000);
		Book b2 = new Book("�ڹ��� ����", 25000);
		System.out.println(b1);
		System.out.println(b2);
		if (b1.equals(b2)) {
			System.out.println("�α��� å�� ����� ������ ��ġ�մϴ�.");
		} else {
			System.out.println("�α��� å�� ����� ������ ��ġ���� �ʽ��ϴ�.");
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
