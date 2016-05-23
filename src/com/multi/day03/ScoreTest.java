package com.multi.day03;

public class ScoreTest {
	
	public static void main(String[] args) {
		// 5¸íÀÇ 3°ú¸ñ Á¡¼ö ÀúÀåÇÏ°í °³ÀÎº°, ÀüÃ¼ ÃÑÁ¡, Æò±Õ
		// 1.Á¡¼öÇÒ´ç
		int[][] score = { { 100, 98, 88 }, { 70, 80, 89 }, { 99, 68, 87 }, { 87, 86, 85 }, { 100, 100, 99 } };
		// 2.ÃÑÁ¡°è»ê
		// °³º°
		int[][] personScore = new int[5][2]; // °³º° ÃÑÁ¡,Æò±Õ ¹è¿­
		for (int person = 0; person < score.length; person++) {
			int sum = 0; // ÃÑÁ¡
			int div = 0; // Æò±Õ
			for (int subject = 0; subject < score[person].length; subject++) {
				sum += score[person][subject];
			}
			div = sum / score[person].length;
			personScore[person][0] = sum;
			personScore[person][1] = div;
		}
		// ÀüÃ¼
		int totalSum = 0; // ÀüÃ¼ÃÑÁ¡
		int totalDiv; // ÀüÃ¼Æò±Õ
		for (int i = 0; i < personScore.length; i++) {
			totalSum += personScore[i][0];
		}
		totalDiv = totalSum / personScore.length;

		// 3.Ãâ·Â
		for (int i = 0; i < personScore.length; i++) {
			System.out.print("ÇÐ»ý" + i + "ÀÇ ÃÑÁ¡ = " + personScore[i][0]);
			System.out.println("  Æò±Õ = " + personScore[i][1]);
		}
		System.out.println("---------------------------");
		System.out.print("ÀüÃ¼ÃÑÁ¡ = " + totalSum);
		System.out.println("  Æò±Õ = " + totalDiv);

	}
}
