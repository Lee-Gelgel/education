package com.multi.day02;

public class SwitchTest {
	public static void main(String[] args) {
		// >java SwitchTest 10
		// 명령행 매개변수로 월이 들어온다.
		// 월에따라 결절을 출력하세요.
		int month = Integer.parseInt(args[0]);
		String str = null;
		if (month <= 0 || month >= 13) {
			System.out.println("1~12 입력");
			// return;
			System.exit(0);
		} else {

			switch (month) {
			case 12:case 1:	case 2:
				str = "겨울";
				break;
			case 3:	case 4: case 5:
				str = "봄";
				break;
			case 6:	case 7:	case 8:
				str = "여름";
				break;
			case 9:	case 10:case 11:
				str = "가을";
			}
			System.out.println(str);
		}
	}
}
