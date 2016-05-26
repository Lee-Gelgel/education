package com.multi.day11;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String data = "02-1234-1234";
		String regExpr = "(02|010)-\\d{3,4}-\\d{4}";

		// []선택
		// ^[]시작
		// [^]제외
		// $끝
		// -범위
		// ? 0이거나 1
		// + 1이상
		// * 0이상
		// {자리수}

		String email = "Lee.gelgel@gmail.co.kr";
		// String email = "hunlee001@naver.com";
		String regExpr2 = "\\w+(\\.\\w*)?@\\w+\\.\\w+(\\.\\w+)?";
		boolean b = Pattern.matches(regExpr, data);
		System.out.println(b);
		boolean b2 = Pattern.matches(regExpr2, email);
		System.out.println(b2);
	}
}
