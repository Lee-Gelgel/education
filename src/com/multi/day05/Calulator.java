package com.multi.day05;

public class Calulator {
	// �����Լ�
	int plus(int x, int y) { // ���ǽÿ��� ��������
		int result = x + y;
		return result;
	}

	// ����Լ�
	double avg(int x, int y) {
		int sum = plus(x, y); // ȣ��ÿ��� ������
		double result = sum / 2.0;
		return result;
	}

	// �����Լ�
	void excute() {
		double result = avg(7, 10); // ȣ��ÿ��� ������
		System.out.println("result : " + result);
	}

	// ����Լ�
	void println(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		Calulator calulator = new Calulator();
		calulator.println("message print");
		
		calulator.excute();
	}
}
