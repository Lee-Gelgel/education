package com.multi.day05;

class Book {
	String title;
	int price;
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	@Override //Annotation=>�����Ϸ��� �ؼ��� �ϴ� �ּ�
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
}

public class AnnotationTest {
	public static void main(String[] args) {
		// �ּ�->������� �ҽ��ڵ带 �����ϱ����� ���
		// �����Ϸ��� ����...�ؼ�����
		Book b = new Book("�ڹ�",30000);
		System.out.println(b);
	}
}
