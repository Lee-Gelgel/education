package com.multi.day03;

public class Person {
	// 1. �������(Ư¡..���)
	String name;
	int age;
	String major;

	// 2. ������...�ʱ�ȭ�۾��� ���ȴ�
	// default�����ڰ� �����ȴ�
	// �����ڸ� �߰��ϸ� default�����ڰ� ���ŵȴ�.
	// �����ڴ� class�̸��� ���ƾ��Ѵ�.
	// �������� overloading->�̸��� ���� �Ű������� �ٸ���.
	Person() {
		// System.out.println("�⺻�������̴�");
		this("�ƹ���", 12, "����");
	}

	Person(String name, int age, String major) {
		super();
		System.out.println("�Ű����� 3��¥�� ������");
		// �Ű������� ��������� �̸��� ���Ƽ� �浹�߻� // name = name ���Ұ�
		// ���簴ü�� �ǹ� => this.�Ӽ�
		// �����ڰ� �ٸ� �����ڸ� ȣ�� => this()
		this.name = name;
		this.age = age;
		this.major = major;
	}

	Person(String name) {
		this(name, 20, "����");
	}

	Person(String name, int age) {
		this(name, age, "����");
	}
	// 3. �Լ�(���..�������)
	public void print(){
		System.out.println("�̸��� "+name+", ���̴� "+age+", ������ "+major);
		System.out.println("******************************");
	}
	// 4. InnerClass
	// 5. static Block

}
