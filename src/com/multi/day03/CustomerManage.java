package com.multi.day03;

public class CustomerManage {
	public static void main(String[] args) {
		// Person class�� �̿��� Object�� ����
		// 1.��ü������������
		int a;
		String s;
		Person p1;
		// 2.��ü����
		p1 = new Person(); // �ڵ��ʱ�ȭ
		// 3.��ü���
		p1.name = "gelgel";
		p1.age = 27;
		p1.major = "computer";
		p1.print();
		
		//��ü��������+����
		Person p2 = new Person();
		p2.name = "lulu";
		p2.age = 29;
		p2.major = "lover";
		p2.print();
		
		Person p3 = new Person("�ְ�",27,"�濵");
		p3.print();
		
		Person p4 = new Person("���");
		p4.print();
		
		Person p5 = new Person("�ְ�2", 27);
		p5.print();
	}
}
