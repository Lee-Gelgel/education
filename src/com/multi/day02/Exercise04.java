package com.multi.day02;

public class Exercise04 {
	public static void main(String args[]) {
		int a = 100;
		System.out.println(Integer.MAX_VALUE);
		char c = 'A';
		System.out.println(Character.toLowerCase(c));
		/*
		int pencils = 534;
		int students = 30;
		// �л� �� ���� ������ ���� ��
		int pencilsPerStuent = pencils / students;
		System.out.println(pencilsPerStuent);
		// ���� ���� ��
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		*/
		
		//
		int pencils = Integer.parseInt(args[0]);
		int students = Integer.parseInt(args[1]);
		// �л� �� ���� ������ ���� ��
		int pencilsPerStuent = pencils / students;
		System.out.println(pencilsPerStuent);
		// ���� ���� ��
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);

		//Run->Run Configurations->Arguments
	}
}
