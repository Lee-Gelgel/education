package com.multi.day03;

public class ArrayTest {
	public static void main(String[] args) {
		// �ϳ��� �̸����� ����Ÿ��, �� ������ ����
		// 1. �迭����
		int[] score = null;

		// 2. �迭����
		score = new int[4]; // �ڵ��ʱ�ȭ

		// 3. ���
		score[0] = 100;
		System.out.println("0��° ���� �� : " + score[0]);
		System.out.println("9��° ���� �� : " + score[3]);

		String[] season = new String[] { "��", "����", "����", "�ܿ�" };
		System.out.println("�迭�� ���� : " + season.length);
		int count = season.length;
		for (int i = 0; i < count; i++) {
			System.out.println(i+"��° ���� �� : "+season[i]);
		}
		
		score = new int[]{100, 95, 90, 85};
		for (int i : score){
			System.out.println(i);
		}
		
		String[] str = new String[3];
		System.out.println(str[0]);
		
		char[] ch = new char[4];
		System.out.println("*"+ch[0]+"*");
		
		char ch2 = ' ';
		char ch3 = '\u0000';
		System.out.println("*"+ch2+"*");
		System.out.println("*"+ch3+"*");
		
		System.out.println("main�� ���޵� ���ڰ��� : "+args.length);
		int su = Integer.parseInt(args[0]);
		System.out.println(su);
	}
}
