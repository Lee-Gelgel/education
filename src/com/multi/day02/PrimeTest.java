package com.multi.day02;

//�Ҽ��� �ڽŰ� 1���� �ٸ� ���δ� ������ �������� �ʴ� �����Դϴ�. 
//���� ����� �Ʒ��� ���� 50 ������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻʽÿ�.
public class PrimeTest {
	public static void main(String[] args) {
		// int su = 7;
		// boolean isPrime = true;
		//
		// for (int i = 2; i < su; i++) {
		// if (su % i == 0) {
		// isPrime = false;
		// break;
		// }
		// }
		// if (isPrime) {
		// System.out.println(su + "�Ҽ�O");
		// } else {
		// System.out.println(su + "�Ҽ�X");
		// }

		for (int i = 2; i <= 50; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && i != j) {
					break;
				} else if (i == j) {
					System.out.println(i);
				}
			}
		}
	}
}
