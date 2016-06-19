package com.multi.test.swExam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SDSsw_총잡이 {
	static int N;
	static int AnswerN;
	static String[][] arrCase;

	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();
		System.setIn(new FileInputStream("src/com/multi/test/swExam2/input4_총.txt"));
		checkCase();
		long endTime = System.currentTimeMillis();
		System.out.println("## 소요시간 : " + (endTime - startTime) / 1000.0f + "초");
	}

	private static void checkCase() {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 수
		N = Integer.parseInt(sc.nextLine());

		while (sc.hasNext()) {
			for (int n = 1; n <= N; n++) {

				// 목표물 초기화
				AnswerN = 0;

				// n번째 케이스 2차원 배열 크기
				String arrRowCol[] = sc.nextLine().split(" ");
				int arrRow = Integer.parseInt(arrRowCol[0]);
				int arrCol = Integer.parseInt(arrRowCol[1]);

				// n번째 케이스 2차원 배열 생성
				arrCase = new String[arrRow][arrCol];

				// n번째 케이스 2차원 배열 입력
				for (int i = 0; i < arrCase.length; i++) {
					String str[] = sc.nextLine().split(" ");
					for (int j = 0; j < arrCase[i].length; j++) {
						arrCase[i][j] = str[j];
					}
				}

				// n번째 케이스 2차원 배열 체크
				for (int i = 0; i < arrCase.length; i++) {
					for (int j = 0; j < arrCase[i].length; j++) {
						if (arrCase[i][j].equals("G")) {
							
							// 동쪽 체크, col은 "G" 오른쪽칸부터 배열범위를 넘지 않을때까지 증가
							for (int col = j + 1; col < arrCase[i].length; col++) {
								// 목표물을 만나면 목표물"T"를 "X"로 변경후 브레이크
								if (arrCase[i][col].equals("T")) {
									arrCase[i][col] = "X";
									break;
									// 벽,총잡이를 만나면 브레이크
								} else if (arrCase[i][col].equals("G") || arrCase[i][col].equals("W")) {
									break;
								}
							}

							// 서쪽 체크, col은 "G" 왼쪽칸부터 배열범위를 넘지 않을때까지 감소
							for (int col = j - 1; col >= 0; col--) {
								// 목표물을 만나면 목표물"T"를 "X"로 변경후 브레이크
								if (arrCase[i][col].equals("T")) {
									arrCase[i][col] = "X";
									break;
									// 벽,총잡이를 만나면 브레이크
								} else if (arrCase[i][col].equals("G") || arrCase[i][col].equals("W")) {
									break;
								}
							}

							// 북쪽 체크, row은 "G" 위쪽칸부터 배열범위를 넘지 않을때까지 감소
							for (int row = i - 1; row >= 0; row--) {
								// 목표물을 만나면 목표물"T"를 "X"로 변경후 브레이크
								if (arrCase[row][j].equals("T")) {
									arrCase[row][j] = "X";
									break;
									// 벽,총잡이를 만나면 브레이크
								} else if (arrCase[row][j].equals("G") || arrCase[row][j].equals("W")) {
									break;
								}
							}

							// 남쪽 체크, row은 "G" 아래쪽칸부터 배열범위를 넘지 않을때까지 증가
							for (int row = i + 1; row < arrCase.length; row++) {
								// 목표물을 만나면 목표물"T"를 "X"로 변경후 브레이크
								if (arrCase[row][j].equals("T")) {
									arrCase[row][j] = "X";
									break;
									// 벽,총잡이를 만나면 브레이크
								} else if (arrCase[row][j].equals("G") || arrCase[row][j].equals("W")) {
									break;
								}
							}
						}
					}
				}

				// n번째 케이스 목표물 체크
				for (int i = 0; i < arrCase.length; i++) {
					for (int j = 0; j < arrCase[i].length; j++) {
						if (arrCase[i][j].equals("X")) {
							AnswerN++;
						}
					}
				}
				System.out.println("#" + n + " " + AnswerN);

				// n번째 케이스 전체 목표물 출력
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
