package com.multi.day02;

public class BreakTest {
	public static void main(String[] args) {
		// break, continue ==> �ݺ����� �帧�� ����

		for (int i = 1; i <= 10; i++) {
			//¦���϶� ����
			if(i%2==0){
				continue;//�ݺ����� ���������� �̵�
			}
			System.out.println("i=" + i);
		}
		System.out.println("==========================");
		
		//i�� 2�� �������Ѽ� Ȧ���� ���
		for (int i = 1; i <= 10; i+=2) {
			System.out.println("i=" + i);
		}
		
		System.out.println("==========================");
		for (int i = 1; i <= 10; i++) {
			//¦���϶� ����
			if(i%2==0){
				break;//�ݺ����� ��������
			}
			System.out.println("i=" + i);
		}
		System.out.println("==========================");
		System.out.println("Done.");
	}
}
