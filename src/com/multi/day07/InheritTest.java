package com.multi.day07;

//�ڵ�����ȯ(�⺻��) ū�� = ������
//�ڵ�����ȯ : ���� = ����
//��������ȯ(�⺻��) ������ = (������Ÿ��) ū��
//��������ȯ....���� ������ instance���� ��ȯ�� ���� : ���� = (����) ����

class A {
	int score = 100;

	public void print() {
		System.out.println("A�� �Լ��Դϴ�." + score);
	}
}

class B extends A {

}

class C extends A {

}

class BB extends B {
	int score = 200;
	int cnt = 2;

	public void print() {
		System.out.println("BB�� ������ �Լ��Դϴ�." + score);
	}

	public void draw() {
		System.out.println("BB�� ���θ��� �Լ��Դϴ�." + score);
	}
}

class CC extends C {

}

public class InheritTest {
	public static void main(String[] args) {
		BB test = new BB();
		B test2 = new BB();
		A test3 = new BB();

		// System.out.println(test3.score);
		// test3.print();
		
		
		//�����Ͽ����� ���� �ȳ��µ� ���࿡�� ����
		// A test4 = new A();
		// BB test5 = (BB) test4;
		// ���� �ν��Ͻ��θ� �ɽ�Ʈ ����
		
		
		//��������ȯ
		if(test2 instanceof BB){
			((BB) test2).draw();
		}
		
		if(test3 instanceof BB){
			((BB) test3).draw();
		}

		// System.out.println(test2.score);
		// test2.print();

		// System.out.println(test.score);
		// test.print();

		// System.out.println(test instanceof BB); // test�� BB�� instance�ΰ���?
		// System.out.println(test2 instanceof B); // test2�� B�� instance�ΰ���?
		// System.out.println(test3 instanceof A); // test3�� A�� instance�ΰ���?
		//
		// System.out.println(test3 instanceof BB); // test3�� BB�� instance�ΰ���?
		// System.out.println(test3 instanceof B); // test3�� B�� instance�ΰ���?
		// System.out.println(test3 instanceof A); // test3�� A�� instance�ΰ���?
		// System.out.println(test3 instanceof Object); // test3�� Object��
		// // instance�ΰ���?
		//
		// System.out.println(test3 instanceof CC); // test3�� CC�� instance�ΰ���?
		// System.out.println(test3 instanceof C); // test3�� C�� instance�ΰ���?

	}

}
