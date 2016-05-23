package com.multi.day05;

public class OverloadingTest {

	public static void sum(int a, int b) {
		System.out.println("���� : " + (a + b));
	}

	// Overloading->�̸����� �Ű��������ٸ���.
	// return�� �ٸ���� Overloading�� �ƴϴ�.
	// public static int sum(int a, int b){
	// System.out.println("���� : "+(a+b));
	// return a+b;
	// }

	public static void sum(double a, double b) {
		System.out.println("�Ǽ� : " + (a + b));
	}

	public static void sum(String a, String b) {
		System.out.println("���� : " + a + b);
	}

	// ����������-->������ ������ ����� ���
	// ���������ڴ� �ϳ��� ����
	// �Ķ��Ÿ�� ���������� ����
	// public static void sum(String str, int... a) { // ��밡��
	// public static void sum(int... a, String str) { //���Ұ�
	// public static void sum(int... a, String b) { //���Ұ�
	public static void sum(int... a) {
		int total = 0;
		// �Ϲ� for��
		// for (int i = 0; i < a.length; i++) {
		// total += a[i];
		// }
		// ���� for��
		for (int i : a)

		{
			total += i;
		}
		System.out.println("total : " + total);

	}

	public static void main(String[] args) {
		sum(10, 20);
		sum(3.14, 5.78);
		sum("Java", "Programing");

		sum(1, 2, 3);
		sum(1, 2, 3, 4, 5);
		sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Car car = new Car();
		System.out.println(car);
		
		int i = Integer.parseInt("9");
		System.out.println(i);
		int j = Integer.parseInt("Kona", 25);
		System.out.println(j);
	}
}
