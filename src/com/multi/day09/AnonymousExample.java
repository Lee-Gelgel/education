package com.multi.day09;

class Person {
	void wake() {
		System.out.println("7시에 일어납니다");
	}
}
// 보통은 이렇게 상속받아서 사용하지만 익명객체구현으로 재정의하는 것도 가능하다
// class Student extends Person{
// @Override
// void wake() {
// System.out.println("6시에 일어납니다");
// }
// }

class Anonymous {
	Person p = new Person()
	// 함수 재정의, 추가 가능
 {
		void work() {
			System.out.println("출근합니다");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
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
				System.out.println("산책합니다");
			}
			
			@Override
			void wake() {
				System.out.println("5시에 일어납니다");
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
				System.out.println("지각입니다");
			}
			
			@Override
			void wake() {
				System.out.println("11시에 일어납니다");
				result();
				
			}
			
		};
		p.wake();
		
		
		
		
		
			
	}
}
