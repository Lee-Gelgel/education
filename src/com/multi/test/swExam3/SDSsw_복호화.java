package com.multi.test.swExam3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SDSsw_복호화 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/multi/test/swExam3/input2_암호화.txt"));

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		while (sc.hasNext()) {
			for (int i = 1; i <= N; i++) {
				System.out.print("#" + i + " ");

				String strLine = sc.nextLine();
				// strLine 가장 첫번째 3개의 수 : 키값
				String key = strLine.substring(0, 3);

				// 키값 10진수 변환
				int keyValue = 0;
				for (int k = 0; k < key.length(); k++) {
					keyValue += Integer.parseInt("" + key.charAt(k)) * Math.pow(2, ((key.length() - 1)) - k);
				}
				// strLine 벨류값 수
				int arrRange = strLine.substring(3).length() / 8;
				// strLine 벨류값 배열
				int[] values = new int[arrRange];
				for (int j = 0; j < values.length; j++) {
					// j 번째 벨류값
					String code = strLine.substring(8 * j + 3, 8 * j + 11);
					// j 번째 벨류값 10진수 변환
					int value = 0;
					for (int k = 0; k < code.length(); k++) {
						// code의 k번째 자리는 2의(code.length()-1)-k)제곱
						value += Integer.parseInt("" + code.charAt(k)) * Math.pow(2, (code.length() - 1) - k);
					}
					// j 번째 벨류값 - 키값
					values[j] = value - keyValue;
				}
				// 출력
				for (int j = 0; j < values.length; j++) {
					System.out.print((char) (values[j] + 65));
				}
				System.out.println();

			}
		}
	}
}
