package com.multi.study;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class NumberBaseball {
	public static void main(String args[]) {
		int[] arrInt = random();
		int cnt = 0;
		boolean run = true;
		while (run) {
			cnt++;
			int[] keyIn = keyIn();
			run = result(arrInt, keyIn);
		}
		System.out.println("HOMERUN!!!" + cnt + "번");
	}

	// 랜덤생성숫자
	static int[] random() {
		System.out.println("random method");
		int[] arrInt = new int[3];
		aa: for (int i = 0; i < arrInt.length; i++) {
			int randomNum = (int) (Math.random() * 10);
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					arrInt[i] = randomNum;
				} else if (randomNum == arrInt[j - 1]) {
					i--;
					continue aa;
				}
				arrInt[i] = randomNum;
			}
		}
		return arrInt;
	}

	// 입력받은숫자
	static int[] keyIn() {
		boolean run = true;
		String keyIn = null;
		while (run) {
			System.out.print("입력>>");
			Scanner sc = new Scanner(System.in);
			keyIn = sc.nextLine();
			String regExpr = "\\d-\\d-\\d";
			boolean keyInCheck = Pattern.matches(regExpr, keyIn);
			if (!keyInCheck) {
				System.out.println("입력패턴오류.");
			} else {
				run = false;
			}
		}
		int[] arrIntKyeIn = new int[3];
		StringTokenizer st = new StringTokenizer(keyIn, "-");
		for (int i = 0; st.hasMoreTokens(); i++) {
			arrIntKyeIn[i] = Integer.parseInt(st.nextToken());
		}

		if (arrIntKyeIn[0] == arrIntKyeIn[1] || arrIntKyeIn[0] == arrIntKyeIn[2] || arrIntKyeIn[1] == arrIntKyeIn[2]) {
			System.out.println("입력중복오류");
			keyIn();
		}
		return arrIntKyeIn;
	}

	static boolean result(int[] arrInt, int[] kyeIn) {
		boolean result = true;
		System.out.println("result method");
		int s = 0;
		int b = 0;

		// S
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] == kyeIn[i]) {
				s++;
			}
		}

		// B
		for (int i = 0; i < arrInt.length; i++) {
			for (int j = 0; j < kyeIn.length; j++) {
				if (i != j && arrInt[i] == kyeIn[j]) {
					b++;
				}
			}
		}
		String strSB = s + "S " + b + "B";
		if (s == 0 && b == 0) {
			System.out.println("OUT!!!");
		} else {
			System.out.println(strSB);
		}
		if (s == 3 && b == 0) {
			result = false;
		}
		return result;
	}
}
