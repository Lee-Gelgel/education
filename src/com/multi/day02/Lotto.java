package com.multi.day02;

public class Lotto {
	public static void main(String[] args) {
		// 1~45숫자 6개 중복허용안함
		int range = 6;
		int[] num = new int[range];
		int cnt = num.length;
		aa: for (int i = 0; i < cnt; i++) {
			if (i == 0) {
				num[i] = random();
			} else {
				int number = random();
				// 중복비교
				for (int j = 0; j < i; j++) {
					// 중복일때
					if (number == num[j]) {
						--i;
						continue aa;
					} else {
						// 중복아닐때
						num[i] = number;
					}
				}
			}
		}
		// 버블정렬(오름차순)
		int temp;
		for (int j = 0; j < cnt - 1; j++) {
			for (int i = 0; i < cnt - 1; i++) {
				if (num[i] > num[i + 1]) {
					temp = num[i + 1];
					num[i + 1] = num[i];
					num[i] = temp;
					temp = 0;
				}
			}
		}
		
		// 출력
		for (int i : num) {
			System.out.print(i + "\t");
		}
	}

	// 랜덤숫자생성
	public static int random() {
		int range = 45;
		int number = (int) (Math.random() * range + 1);
		return number;
	}
}
