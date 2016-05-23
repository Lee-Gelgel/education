package com.multi.day04;

public class PersonTest {
	// object ����
	String subject = "Java";
	// class ����
	static String book = "This is java";

	// object �Լ�
	public void print() {
		System.out.println("Object Method");
	}

	// class �Լ�
	static public void print2() {
		System.out.println("Class Method");
	}

	public static void main(String[] args) {

		// System.out.println(subject); //static�Լ������� static������ ��밡��
		System.out.println(book);
		// print(); //static�Լ������� static�Լ��� ��밡��
		print2();
		PersonTest aa = new PersonTest();
		System.out.println(aa.subject);
		aa.print();
		

		System.out.println("�����α��� : " + Person.getPopulation() + " ��");

		// int countPerson;
		Person p1 = new Person();
		p1.selfIntroduce();
		// countPerson = p1.numberOfPersons;
		int countPerson1 = p1.getPopulation();
		System.out.println("���α��� : " + countPerson1 + " ��");
		System.out.println("------------------------------");

		Person p2 = new Person(27, "gelgel");
		p2.selfIntroduce();
		// countPerson = p2.numberOfPersons;
		int countPerson2 = p2.getPopulation();
		System.out.println("���α��� : " + countPerson2 + " ��");
		System.out.println("------------------------------");

		Person p3 = new Person(29, "lulu");
		p3.selfIntroduce();
		// countPerson = p3.numberOfPersons;
		int countPerson3 = p3.getPopulation();
		System.out.println("���α��� : " + countPerson3 + " ��");
		System.out.println("------------------------------");

		System.out.println("�����α��� : " + Person.getPopulation() + " ��");
	}
}
