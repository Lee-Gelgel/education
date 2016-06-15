package com.multi.day23;

class IllegalSizeException extends Exception {

	public IllegalSizeException(String message) {
		super(message);
		System.out.println(message);
	}

}

public class Prob1 {
	public static void main(String[] args) {
		try {
			System.out.println(leftPad("Samsung", 10, '#'));
			System.out.println(leftPad("SDS", 5, '*'));
			System.out.println(leftPad("Multi Campus", 10, '@'));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String leftPad(String str, int size, char fillChar) {
		String str2 = "";
		if (str.length() <= size) {
			for (int i = str.length(); i < size; i++) {
				str2 += fillChar;
			}
			str2 += str;
		} else if (str.length() > size) {
			try {
				throw new IllegalSizeException("문자열의 길이보다 size가 큽니다.");
			} catch (IllegalSizeException e) {
			}
		}
		return str2;
	}

}
// String str : 변환하려는 문자열
// int size : 변환될 문자열의 길이
// char fillChar : 빈 공백을 채울 문자
// << 제약조건 >>
// 변환할 수 없는 상황(늘리려는 크기보다 실제 문자열의 길이가 클 경우)이 되면 예외로 간주하여 "문자열의 길이보다 size가 큽니다."
// 라는 예외 메시지를 포함한 IllegalSizeException이라는 사용자 정의 예외를 발생 시킨다.
// 따라서 IllegalSizeException이라는 사용자 정의 예외클래스를 정의해서 구현해야 한다.
//
// << 주의사항 >>
// 1. 제공되는 prob1 패키지의 Prob1.java main() 메쏘드는 수정하지 않고 실행한다.
// 2. 문제에서 제공되는 leftPad() 메쏘드 시그니쳐는 절대 수정해서는 안되며, 로직만 완성하도록 한다.
// 3. IllegalSizeException 클래스는 별도로 IllegalSizeException.java 파일에 작성한다.
// 4. 제출할 정답 파일은 Prob1.java, IllegalSizeException.java 파일이다.
