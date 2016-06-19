package com.multi.test.swExam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SDSsw_������ {
	static int N;
	static int AnswerN;
	static String[][] arrCase;

	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();
		System.setIn(new FileInputStream("src/com/multi/test/swExam2/input4_��.txt"));
		checkCase();
		long endTime = System.currentTimeMillis();
		System.out.println("## �ҿ�ð� : " + (endTime - startTime) / 1000.0f + "��");
	}

	private static void checkCase() {
		Scanner sc = new Scanner(System.in);

		// �׽�Ʈ ���̽� ��
		N = Integer.parseInt(sc.nextLine());

		while (sc.hasNext()) {
			for (int n = 1; n <= N; n++) {

				// ��ǥ�� �ʱ�ȭ
				AnswerN = 0;

				// n��° ���̽� 2���� �迭 ũ��
				String arrRowCol[] = sc.nextLine().split(" ");
				int arrRow = Integer.parseInt(arrRowCol[0]);
				int arrCol = Integer.parseInt(arrRowCol[1]);

				// n��° ���̽� 2���� �迭 ����
				arrCase = new String[arrRow][arrCol];

				// n��° ���̽� 2���� �迭 �Է�
				for (int i = 0; i < arrCase.length; i++) {
					String str[] = sc.nextLine().split(" ");
					for (int j = 0; j < arrCase[i].length; j++) {
						arrCase[i][j] = str[j];
					}
				}

				// n��° ���̽� 2���� �迭 üũ
				for (int i = 0; i < arrCase.length; i++) {
					for (int j = 0; j < arrCase[i].length; j++) {
						if (arrCase[i][j].equals("G")) {
							
							// ���� üũ, col�� "G" ������ĭ���� �迭������ ���� ���������� ����
							for (int col = j + 1; col < arrCase[i].length; col++) {
								// ��ǥ���� ������ ��ǥ��"T"�� "X"�� ������ �극��ũ
								if (arrCase[i][col].equals("T")) {
									arrCase[i][col] = "X";
									break;
									// ��,�����̸� ������ �극��ũ
								} else if (arrCase[i][col].equals("G") || arrCase[i][col].equals("W")) {
									break;
								}
							}

							// ���� üũ, col�� "G" ����ĭ���� �迭������ ���� ���������� ����
							for (int col = j - 1; col >= 0; col--) {
								// ��ǥ���� ������ ��ǥ��"T"�� "X"�� ������ �극��ũ
								if (arrCase[i][col].equals("T")) {
									arrCase[i][col] = "X";
									break;
									// ��,�����̸� ������ �극��ũ
								} else if (arrCase[i][col].equals("G") || arrCase[i][col].equals("W")) {
									break;
								}
							}

							// ���� üũ, row�� "G" ����ĭ���� �迭������ ���� ���������� ����
							for (int row = i - 1; row >= 0; row--) {
								// ��ǥ���� ������ ��ǥ��"T"�� "X"�� ������ �극��ũ
								if (arrCase[row][j].equals("T")) {
									arrCase[row][j] = "X";
									break;
									// ��,�����̸� ������ �극��ũ
								} else if (arrCase[row][j].equals("G") || arrCase[row][j].equals("W")) {
									break;
								}
							}

							// ���� üũ, row�� "G" �Ʒ���ĭ���� �迭������ ���� ���������� ����
							for (int row = i + 1; row < arrCase.length; row++) {
								// ��ǥ���� ������ ��ǥ��"T"�� "X"�� ������ �극��ũ
								if (arrCase[row][j].equals("T")) {
									arrCase[row][j] = "X";
									break;
									// ��,�����̸� ������ �극��ũ
								} else if (arrCase[row][j].equals("G") || arrCase[row][j].equals("W")) {
									break;
								}
							}
						}
					}
				}

				// n��° ���̽� ��ǥ�� üũ
				for (int i = 0; i < arrCase.length; i++) {
					for (int j = 0; j < arrCase[i].length; j++) {
						if (arrCase[i][j].equals("X")) {
							AnswerN++;
						}
					}
				}
				System.out.println("#" + n + " " + AnswerN);

				// n��° ���̽� ��ü ��ǥ�� ���
				// for (int i = 0; i < arrCase.length; i++) {
				// for (int j = 0; j < arrCase[i].length; j++) {
				// System.out.print(arrCase[i][j] + " ");
				// }
				// System.out.println();
				// }
			}
		}

	}
}
