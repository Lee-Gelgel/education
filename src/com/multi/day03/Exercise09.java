package com.multi.day03;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� : 2.�����Է� : 3.��������Ʈ : 4.�м� : 5.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("�л���>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					int score = scanner.nextInt();
					scores[i] = score;
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				double ave = 0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (scores[i] >= max) {
						max = scores[i];
					}
				}
				ave = sum/scores.length;
				System.out.println("�ְ����� : "+max);
				System.out.println("������� : "+ave);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}