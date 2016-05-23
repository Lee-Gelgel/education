package com.multi.day04;
//BookMgr 클래스의 제약조건 
//1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
//2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
//3. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
//4. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 
public class BookMgr {
	//1.멤버변수
	Book[] booklist;
	//2.생성자

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	//3.메서드
	//책 목록을 화면에 출력하는 함수
		void printBookList(){
			System.out.println("=== 책 목록 ===");
//			for(int i=0;i<booklist.length;i++){
//				System.out.println(booklist[i].getTitle());
//			}
			for(Book book : booklist){
				System.out.println(book.getTitle());
			}
			System.out.println();
		}
		//모든 책 가격의 합을 출력하는 함수
		void printTotalPrice(){
			int total=0;
			System.out.println("=== 책 가격의 총합 ===");
//			for(int i=0;i<booklist.length;i++){
//				total += booklist[i].getPrice();
//			}
			for(Book book : booklist){
				total+=book.getPrice();
			}
			System.out.println("전체 책 가격의 합 : "+total);
		}
}
