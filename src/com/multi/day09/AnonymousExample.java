package com.multi.day09;

class Person {
	void wake() {
		System.out.println("7�ÿ� �Ͼ�ϴ�");
	}
}
// ������ �̷��� ��ӹ޾Ƽ� ��������� �͸�ü�������� �������ϴ� �͵� �����ϴ�
// class Student extends Person{
// @Override
// void wake() {
// System.out.println("6�ÿ� �Ͼ�ϴ�");
// }
// }

class Anonymous {
	Person p = new Person()
	// �Լ� ������, �߰� ����
 {
		void work() {
			System.out.println("����մϴ�");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�");
			work();
		}
	}
	;

	void print() {
		p.wake();
	}
	
	void method(){
		Person p = new Person(){
			void walk(){
				System.out.println("��å�մϴ�");
			}
			
			@Override
			void wake() {
				System.out.println("5�ÿ� �Ͼ�ϴ�");
				walk();
			}
			
		};
		p.wake();
	}
}

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		a.print();
		a.method();
		
		
		System.out.println("-------------");
		Person p = new Person(){

			void result(){
				System.out.println("�����Դϴ�");
			}
			
			@Override
			void wake() {
				System.out.println("11�ÿ� �Ͼ�ϴ�");
				result();
				
			}
			
		};
		p.wake();
		
		
		
		
		
			
	}
}
