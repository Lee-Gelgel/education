package com.multi.day02;

public class Gugudan2 {
	public static void main(String[] args) {

		aa:for (int gop = 1; gop <= 9; gop++) {
			for (int dan = 2; dan <= 9; dan++) {
				// �帧�� ����
				if (dan == 4) {
					// continue; // �Ʒ����幫��,loop�����������̵�
					//break; // ����� loop ������
					//break aa; // aa loop ������
					continue aa; // aa loop�����������̵�
				}
				System.out.print(dan + "*" + gop + "=" + dan * gop + "\t");
			}
			System.out.println();// �ٹٲٱ�
		}
	}
}
