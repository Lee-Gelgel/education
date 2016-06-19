package com.multi.test.swExam3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SDSsw_��ȣȭ {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/multi/test/swExam3/input2_��ȣȭ.txt"));

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		while (sc.hasNext()) {
			for (int i = 1; i <= N; i++) {
				System.out.print("#" + i + " ");

				String strLine = sc.nextLine();
				// strLine ���� ù��° 3���� �� : Ű��
				String key = strLine.substring(0, 3);

				// Ű�� 10���� ��ȯ
				int keyValue = 0;
				for (int k = 0; k < key.length(); k++) {
					keyValue += Integer.parseInt("" + key.charAt(k)) * Math.pow(2, ((key.length() - 1)) - k);
				}
				// strLine ������ ��
				int arrRange = strLine.substring(3).length() / 8;
				// strLine ������ �迭
				int[] values = new int[arrRange];
				for (int j = 0; j < values.length; j++) {
					// j ��° ������
					String code = strLine.substring(8 * j + 3, 8 * j + 11);
					// j ��° ������ 10���� ��ȯ
					int value = 0;
					for (int k = 0; k < code.length(); k++) {
						// code�� k��° �ڸ��� 2��(code.length()-1)-k)����
						value += Integer.parseInt("" + code.charAt(k)) * Math.pow(2, (code.length() - 1) - k);
					}
					// j ��° ������ - Ű��
					values[j] = value - keyValue;
				}
				// ���
				for (int j = 0; j < values.length; j++) {
					System.out.print((char) (values[j] + 65));
				}
				System.out.println();

			}
		}
	}
}
