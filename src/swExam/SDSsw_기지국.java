package swExam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SDSsw_기지국 {
	static int N;
	static int AnswerN;
	static String[][] arrCase;

	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();
		System.setIn(new FileInputStream("src/swExam/input_기지국.txt"));
		checkCase();
		long endTime = System.currentTimeMillis();
		System.out.println("## 소요시간 : " + (endTime - startTime) / 1000.0f + "초");
	}

	public static void checkCase() {
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 수
		N = Integer.parseInt(sc.nextLine());
		
		while (sc.hasNext()) {
			for (int n = 1; n <= N; n++) {
				
				// 기지국 non-conver 가구 초기화
				AnswerN = 0;
				
				// n번째 케이스 2차원 배열 크기
				int arrNum = Integer.parseInt(sc.nextLine());
				
				// n번째 케이스 2차원 배열 생성
				arrCase = new String[arrNum][arrNum];

				// n번째 케이스 2차원 배열 입력
				for (int i = 0; i < arrCase.length; i++) {
					String str[] = sc.nextLine().split(" ");
					for (int j = 0; j < arrCase[i].length; j++) {
						arrCase[i][j] = str[j];
					}
				}

				// n번째 케이스 2차원 배열 기지국 cover 가구 체크
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
				
				// n번째 케이스 기지국 non-conver 가구 체크
				for (int i = 0; i < arrCase.length; i++) {
					for (int j = 0; j < arrCase[i].length; j++) {
						if (arrCase[i][j].equals("H")) {
							AnswerN++;
						}
					}
				}
				System.out.println(n + "번째 케이스 non-cover 가구 수 :" + AnswerN);
				
				// // n번째 케이스 기지국 cover 가구 출력
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
