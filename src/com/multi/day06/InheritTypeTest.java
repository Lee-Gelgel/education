package com.multi.day06;
class A{
	int a = 10;
	void printA(){
		System.out.println("A class");
	}
}
class B extends A{
	int b = 20;
	void printB(){
		System.out.println("B class");
	}
}
class C extends A{
	int c = 30;
	void printC(){
		System.out.println("C class");
	}
}
class BB extends B{
	String a = "java";
	int bb = 40;
	void printA(){
		System.out.println("BB���� override�� A method");
	}
	void printBB(){
		System.out.println("BB class");
	}
}
class CC extends C{
	int cc = 50;
	void printCC(){
		System.out.println("CC class");
	}
}

public class InheritTypeTest {
	public static void main(String[] args) {
		//�ڵ�����ȯ
		//���� = ����
		A obj3 = new BB();
		B obj2 = new BB();
		BB obj1 = new BB();
		
		//������ Ÿ�Կ� �ش��ϴ� ����� ���δ�
		//������ Ÿ�Կ��� �ش��ϴ� �Լ��� ���δ�
		//�Լ��� ����� �������� Override�� ��� �װ��� ����
		//**�Լ��� instancde�� ������
		//**������ class�� ������
		obj2.printA();
		obj3.printA();
	}
}
