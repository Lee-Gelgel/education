package com.multi.day02;

public class Gugudan2 {
	public static void main(String[] args) {

		aa:for (int gop = 1; gop <= 9; gop++) {
			for (int dan = 2; dan <= 9; dan++) {
				// 흐름을 변경
				if (dan == 4) {
					// continue; // 아래문장무시,loop시작점으로이동
					//break; // 가까운 loop 빠지기
					//break aa; // aa loop 빠지기
					continue aa; // aa loop시작점으로이동
				}
				System.out.print(dan + "*" + gop + "=" + dan * gop + "\t");
			}
			System.out.println();// 줄바꾸기
		}
	}
}
