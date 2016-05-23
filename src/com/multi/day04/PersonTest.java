package com.multi.day04;

public class PersonTest {
	// object 변수
	String subject = "Java";
	// class 변수
	static String book = "This is java";

	// object 함수
	public void print() {
		System.out.println("Object Method");
	}

	// class 함수
	static public void print2() {
		System.out.println("Class Method");
	}

	public static void main(String[] args) {

		// System.out.println(subject); //static함수에서는 static변수만 사용가능
		System.out.println(book);
		// print(); //static함수에서는 static함수만 사용가능
		print2();
		PersonTest aa = new PersonTest();
		System.out.println(aa.subject);
		aa.print();
		

		System.out.println("현재인구수 : " + Person.getPopulation() + " 명");

		// int countPerson;
		Person p1 = new Person();
		p1.selfIntroduce();
		// countPerson = p1.numberOfPersons;
		int countPerson1 = p1.getPopulation();
		System.out.println("총인구수 : " + countPerson1 + " 명");
		System.out.println("------------------------------");

		Person p2 = new Person(27, "gelgel");
		p2.selfIntroduce();
		// countPerson = p2.numberOfPersons;
		int countPerson2 = p2.getPopulation();
		System.out.println("총인구수 : " + countPerson2 + " 명");
		System.out.println("------------------------------");

		Person p3 = new Person(29, "lulu");
		p3.selfIntroduce();
		// countPerson = p3.numberOfPersons;
		int countPerson3 = p3.getPopulation();
		System.out.println("총인구수 : " + countPerson3 + " 명");
		System.out.println("------------------------------");

		System.out.println("현재인구수 : " + Person.getPopulation() + " 명");
	}
}
