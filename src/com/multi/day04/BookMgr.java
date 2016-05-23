package com.multi.day04;
//BookMgr Ŭ������ �������� 
//1. å(Book) ��ü ���� ���� ������ �� �ִ� å ���(booklist)�̶�� �迭�� ��������� ������ �Ѵ�. 
//2. å ���(booklist)�̶�� �迭 ������ �ʱ�ȭ�ϴ� ������ �޼��带 �ۼ��ؾ� �Ѵ�. 
//3. å ����� ȭ�鿡 ����ϴ� printBookList() �޼��尡 �־�� �Ѵ�. 
//4. ��� å ������ ���� ����ϴ� printTotalPrice() �޼��尡 �־�� �Ѵ�. 
public class BookMgr {
	//1.�������
	Book[] booklist;
	//2.������

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	//3.�޼���
	//å ����� ȭ�鿡 ����ϴ� �Լ�
		void printBookList(){
			System.out.println("=== å ��� ===");
//			for(int i=0;i<booklist.length;i++){
//				System.out.println(booklist[i].getTitle());
//			}
			for(Book book : booklist){
				System.out.println(book.getTitle());
			}
			System.out.println();
		}
		//��� å ������ ���� ����ϴ� �Լ�
		void printTotalPrice(){
			int total=0;
			System.out.println("=== å ������ ���� ===");
//			for(int i=0;i<booklist.length;i++){
//				total += booklist[i].getPrice();
//			}
			for(Book book : booklist){
				total+=book.getPrice();
			}
			System.out.println("��ü å ������ �� : "+total);
		}
}
