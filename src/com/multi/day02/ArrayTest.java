package com.multi.day02;

public class ArrayTest {
	public static void main(String[] args) {
		// �迭..�ϳ��� �̸����� ���� type�� �������� ���� �����ϱ����� �ڷᱸ��

		// 1.�迭����
		int[] score; // stack���� ����
		double score2[];
		boolean b[];
		char[] c;
		// 2.�迭����
		score = new int[3]; // heap���� ����, �ڵ��ʱ�ȭ 0
		score2 = new double[4]; // �ڵ��ʱ�ȭ 0.0
		b = new boolean[2]; // �ڵ��ʱ�ȭ false
		c = new char[10]; // �ڵ��ʱ�ȭ ����
		// 3.�迭���
		score[0] = 100;
		score2[0] = 123.567;
		b[0] = true;
		c[0] = 'A';

		System.out.println(score[0]);
		System.out.println(score2[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);

		// ����+����
		int[] score3 = new int[20];
		System.out.println(score3[19]);

		// ����+����+�ʱ�ȭ
		//int[] score4 = new int[] { 10, 20, 30, 40 };
		int[] score4 = { 10, 20, 30, 40 };
		System.out.println(score4[0]);
		System.out.println(score4.length);
		//�Ϲ�FOR
		for(int i=0;i<score4.length;i++){
			System.out.print(score4[i]+"\t");
		}
		//Ȯ��FOR, ����FOR
		for(int i : score4){
			System.out.println(i);
		}
	}
}
