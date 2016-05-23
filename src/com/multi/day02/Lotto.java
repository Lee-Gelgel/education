package com.multi.day02;

public class Lotto {
	public static void main(String[] args) {
		// 1~45���� 6�� �ߺ�������
		int range = 6;
		int[] num = new int[range];
		int cnt = num.length;
		aa: for (int i = 0; i < cnt; i++) {
			if (i == 0) {
				num[i] = random();
			} else {
				int number = random();
				// �ߺ���
				for (int j = 0; j < i; j++) {
					// �ߺ��϶�
					if (number == num[j]) {
						--i;
						continue aa;
					} else {
						// �ߺ��ƴҶ�
						num[i] = number;
					}
				}
			}
		}
		// ��������(��������)
		int temp;
		for (int j = 0; j < cnt - 1; j++) {
			for (int i = 0; i < cnt - 1; i++) {
				if (num[i] > num[i + 1]) {
					temp = num[i + 1];
					num[i + 1] = num[i];
					num[i] = temp;
					temp = 0;
				}
			}
		}
		
		// ���
		for (int i : num) {
			System.out.print(i + "\t");
		}
	}

	// �������ڻ���
	public static int random() {
		int range = 45;
		int number = (int) (Math.random() * range + 1);
		return number;
	}
}
