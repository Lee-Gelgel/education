package com.multi.day02;

public class GCDTest {
	public static void main(String[] args) {
		// int su1 = 5;
		// int su2 = 15;
		// int high;
		// int low;
		// int mod;
		// int a;
		// int b;
		// boolean result = true;
		// // �ִ�����->����Ⱦ���� ����ū��
		// // ����Ⱦ��->�μ��� ������ �������� ��
		// if (su1 > su2) {
		// high = su1;
		// low = su2;
		// } else {
		// high = su2;
		// low = su1;
		// }
		// while (result) {
		// mod = high % low;
		// high = low;
		// low = mod;
		// if (mod == 0) {
		// result = false;
		// }
		// }
		// a = high;
		// System.out.println("�ִ�����" + a);
		// b = su1 * su2 / a;
		// System.out.println("�ּҰ����" + b);

		int su1 = 5;
		int su2 = 15;
		int min = su1 > su2 ? su2 : su1;
		int commonDivisor = 1;
		for (int i = min; i >= i; i--) {
			if(su1%i==0&&su2%i==0)
			commonDivisor = i;
			break;
		}
		System.out.println("�ִ�����"+commonDivisor);
	}
}
