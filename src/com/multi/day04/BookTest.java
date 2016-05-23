package com.multi.day04;

//[Prob4 실행결과]
//=== 책 목록 ===
//Java Program
//JSP Program
//SQL Fundamentals
//JDBC Program
//EJB Program
//
//=== 책 가격의 총합 ===
//전체 책 가격의 합 : 132000

public class BookTest {
	public static void main(String[] args) {
	    Book[] b = new Book[5];
		b[0] = new Book("Java Program",30000);
		b[1] = new Book("JSP Program",25000);
		b[2] = new Book("SQL Fundamentals",20000);
		b[3] = new Book("JDBC Program",32000);
		b[4] = new Book("EJB Program",25000);
		
		BookMgr bm = new BookMgr(b);
		bm.printBookList();
		bm.printTotalPrice();
	}
}

