package com.multi.day03;

public class ScoreTest {
	
	public static void main(String[] args) {
		// 5���� 3���� ���� �����ϰ� ���κ�, ��ü ����, ���
		// 1.�����Ҵ�
		int[][] score = { { 100, 98, 88 }, { 70, 80, 89 }, { 99, 68, 87 }, { 87, 86, 85 }, { 100, 100, 99 } };
		// 2.�������
		// ����
		int[][] personScore = new int[5][2]; // ���� ����,��� �迭
		for (int person = 0; person < score.length; person++) {
			int sum = 0; // ����
			int div = 0; // ���
			for (int subject = 0; subject < score[person].length; subject++) {
				sum += score[person][subject];
			}
			div = sum / score[person].length;
			personScore[person][0] = sum;
			personScore[person][1] = div;
		}
		// ��ü
		int totalSum = 0; // ��ü����
		int totalDiv; // ��ü���
		for (int i = 0; i < personScore.length; i++) {
			totalSum += personScore[i][0];
		}
		totalDiv = totalSum / personScore.length;

		// 3.���
		for (int i = 0; i < personScore.length; i++) {
			System.out.print("�л�" + i + "�� ���� = " + personScore[i][0]);
			System.out.println("  ��� = " + personScore[i][1]);
		}
		System.out.println("---------------------------");
		System.out.print("��ü���� = " + totalSum);
		System.out.println("  ��� = " + totalDiv);

	}
}
