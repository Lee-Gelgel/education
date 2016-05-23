package com.multi.day04;

public class Person {
	//1.�������
	//static : calss�����̴ٴ� �ǹ�, object��������
	private static int numberOfPersons; 
	private int age;
	private String name;
	
	//2.������
	public Person(int age, String name) {
		numberOfPersons ++;
		System.out.println("�α��� �߰��Ǿ����ϴ�.");
		this.age = age;
		this.name = name;
	}

	public Person() {
		this(12, "Anonymous");
	}
	
	//3.�޼���
	void selfIntroduce(){
		System.out.println("�� �̸��� "+name+"�̸�, ���̴� "+age+"���Դϴ�.");
	}
	
	public static int getPopulation(){
		//static�Լ������� static������ ��밡��
		return numberOfPersons;
	}
	

}
