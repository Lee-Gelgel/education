package swExam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SDSsw_기지국 {
	static int N;
	static int AnswerN;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/swExam/input_기지국.txt"));
		Scanner sc = new Scanner(System.in);
		char[][] map;
		int testCase = sc.nextInt();
		for (int n = 0; n < testCase; n++) {
			N = sc.nextInt();
			AnswerN = 0;
			map = new char[N][N];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					map[i][j] = sc.next().charAt(0);
					// System.out.print(map[i][j]);
				}
				// System.out.println();
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if (map[i][j] == 'A') {
						map[i][j + 1] = 'X';
						map[i][j - 1] = 'X';
						map[i + 1][j] = 'X';
						map[i - 1][j + 1] = 'X';
					}
					if (map[i][j] == 'B') {
						map[i][j + 1] = 'X';
						map[i][j + 2] = 'X';
						map[i][j - 1] = 'X';
						map[i][j - 2] = 'X';
						map[i + 1][j] = 'X';
						map[i + 2][j] = 'X';
						map[i - 1][j + 1] = 'X';
						map[i - 2][j + 1] = 'X';
					}
					if (map[i][j] == 'C') {
						map[i][j + 1] = 'X';
						map[i][j + 2] = 'X';
						map[i][j + 3] = 'X';
						map[i][j - 1] = 'X';
						map[i][j - 2] = 'X';
						map[i][j - 3] = 'X';
						map[i + 1][j] = 'X';
						map[i + 2][j] = 'X';
						map[i + 3][j] = 'X';
						map[i - 1][j + 1] = 'X';
						map[i - 2][j + 1] = 'X';
						map[i - 3][j + 1] = 'X';
					}
				}
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if (map[i][j] == 'H') {
						AnswerN++;
					}
				}
			}
		}
	}
}
