package com.multi.day09;

class Outter {
	String field = "JAVA";

	void method() {
		System.out.println("Outter Method field : " + field);
	}

	class Nested {
		String field = "Oracle";

		void method() {
			System.out.println("Nested Method field : " + field);
		}

		void print() {
			System.out.println("Nested field field : " + field);
			System.out.println("Nested field field : " + this.field);
			method();
			this.method();

			// Outter class의 field,method와 Nested class의 field,method 이름이 같을경우
			System.out.println("Outter field field : " + Outter.this.field);
			Outter.this.method();
		}
	}

}

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}
