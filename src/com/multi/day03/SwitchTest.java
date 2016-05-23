package com.multi.day03;

//dos창 -> java SwitchTest 10
public class SwitchTest {
	public static void ifPring(String month) {
		int mon = Integer.parseInt(month);
		String season;
		if (mon == 12 || mon == 1 || mon == 2) {
			season = "겨울";
		} else if (mon >= 3 && mon <= 5) {
			season = "봄";
		} else if (mon >= 6 && mon <= 8) {
			season = "여름";
		} else if (mon >= 9 && mon <= 11) {
			season = "가을";
		} else {
			System.out.println("1~12까지만 입력");
			return;
		}
		System.out.println("당신이 태어난 계절은 " + season);
	}

	public static void switchPrint(String month) {
		String season;
		switch (month) {
		case "12":case "1":case "2":
			season = "겨울";	break;
		case "3":case "4":case "5":
			season = "봄";	break;
		case "6":case "7":case "8":
			season = "여름";	break;
		case "9":case "10":case "11":
			season = "가을";	break;
		default:
			System.out.println("1~12까지만 입력");
			return;
		}
		System.out.println("당신이 태어난 계절은 " + season);
	}

	// main은 자바프로그램의 시작점(구조가 정해짐)
	public static void main(String[] args) {
		ifPring(args[0]);
		switchPrint(args[0]);
	}
}
