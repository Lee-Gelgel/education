package com.multi.day02;

//����1. 1���� ũ�� 10���� ���� ������ �Է¹޾Ƽ� �Ʒ��� ���� ���� ����� ��Ÿ������ Prob1 Ŭ������ main �޼ҵ带 �ϼ��Ͻʽÿ�. 
//�Է¹��� ���ڿ� �ش��ϴ� �������� �ϼ���Ű�� ���α׷��Դϴ�. 
//2���� �۰ų� 9���� ū ������ �Էµ� ��쿡�� ���߸��� ���ڰ� �ԷµǾ����ϴ�.����� ��� �޽����� ����ϰ� ���α׷��� �����մϴ�.

public class Gugudan3 {
	public static void main(String[] args) {
		int dan = Integer.parseInt(args[0]);
		if (dan < 2 || dan > 9) {
			System.out.println("error");
			// return; // �Լ�������
			// System.exit(0);// ��������
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
		}

	}
}
