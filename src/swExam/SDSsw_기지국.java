package swExam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SDSsw_������ {
	static int N;
	static int AnswerN;
	static String[][] arrCase;

	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();
		System.setIn(new FileInputStream("src/swExam/input_������.txt"));
		checkCase();
		long endTime = System.currentTimeMillis();
		System.out.println("## �ҿ�ð� : " + (endTime - startTime) / 1000.0f + "��");
	}

	public static void checkCase() {
		Scanner sc = new Scanner(System.in);
		
		// �׽�Ʈ ���̽� ��
		N = Integer.parseInt(sc.nextLine());
		
		while (sc.hasNext()) {
			for (int n = 1; n <= N; n++) {
				
				// ������ non-conver ���� �ʱ�ȭ
				AnswerN = 0;
				
				// n��° ���̽� 2���� �迭 ũ��
				int arrNum = Integer.parseInt(sc.nextLine());
				
				// n��° ���̽� 2���� �迭 ����
				arrCase = new String[arrNum][arrNum];

				// n��° ���̽� 2���� �迭 �Է�
				for (int i = 0; i < arrCase.length; i++) {
					String str[] = sc.nextLine().split(" ");
					for (int j = 0; j < arrCase[i].length; j++) {
						arrCase[i][j] = str[j];
					}
				}

				// n��° ���̽� 2���� �迭 ������ cover ���� üũ
				for (int i = 0; i < arrCase.length; i++) {
					for (int j = 0; j < arrCase[i].length; j++) {
						switch (arrCase[i][j]) {
						case "C":
							if (i - 3 >= 0) arrCase[i - 3][j] = (arrCase[i - 3][j].equals("H")? "O":arrCase[i - 3][j]);
							if (i + 3 < arrCase.length) arrCase[i + 3][j] = (arrCase[i + 3][j].equals("H")? "O":arrCase[i + 3][j]);
							if (j - 3 >= 0) arrCase[i][j - 3] = (arrCase[i][j - 3].equals("H")? "O":arrCase[i][j - 3]);
							if (j + 3 < arrCase[i].length) arrCase[i][j + 3] = (arrCase[i][j + 3].equals("H")? "O":arrCase[i][j + 3]);
						case "B":
							if (i - 2 >= 0) arrCase[i - 2][j] = (arrCase[i - 2][j].equals("H")? "O":arrCase[i - 2][j]);
							if (i + 2 < arrCase.length) arrCase[i + 2][j] = (arrCase[i + 2][j].equals("H")? "O":arrCase[i + 2][j]);
							if (j - 2 >= 0) arrCase[i][j - 2] = (arrCase[i][j - 2].equals("H")? "O":arrCase[i][j - 2]);
							if (j + 2 < arrCase[i].length) arrCase[i][j + 2] = (arrCase[i][j + 2].equals("H")? "O":arrCase[i][j + 2]);
						case "A":
							if (i - 1 >= 0) arrCase[i - 1][j] = (arrCase[i - 1][j].equals("H")? "O":arrCase[i - 1][j]);
							if (i + 1 < arrCase.length) arrCase[i + 1][j] = (arrCase[i + 1][j].equals("H")? "O":arrCase[i + 1][j]);
							if (j - 1 >= 0) arrCase[i][j - 1] = (arrCase[i][j - 1].equals("H")? "O":arrCase[i][j - 1]);
							if (j + 1 < arrCase[i].length) arrCase[i][j + 1] = (arrCase[i][j + 1].equals("H")? "O":arrCase[i][j + 1]);
						}
					}
				}
				
				// n��° ���̽� ������ non-conver ���� üũ
				for (int i = 0; i < arrCase.length; i++) {
					for (int j = 0; j < arrCase[i].length; j++) {
						if (arrCase[i][j].equals("H")) {
							AnswerN++;
						}
					}
				}
				System.out.println(n + "��° ���̽� non-cover ���� �� :" + AnswerN);
				
				// // n��° ���̽� ������ cover ���� ���
				// for (int i = 0; i < arrCase.length; i++) {
				// for (int j = 0; j < arrCase[i].length; j++) {
				// System.out.print(arrCase[i][j]+" ");
				// }
				// System.out.println();
				// }
			}
		}
	}
}
