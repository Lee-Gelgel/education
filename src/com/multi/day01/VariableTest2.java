package com.multi.day01;

public class VariableTest2 {
	// 1. 멤버 변수
	// 2. 생성자메서드
	// 3. 일반메서드
	// 4. innerclass
	// 5. static block

	public static void main(String[] args) {
		// 지역변수 => 반드시 초기화하고 사용한다.
		int a = 100;
		{
			int b = 200;
			System.out.println(a + b);
		}
		// System.out.println(a+b); //b사용불가
		// 1.boolean
		// 2.정수,실수 : byte(1)->short(2)->int(4)->long(8)->float(4)->double(8)

		// 형변환
		// 1.자동형변환
		// 큰방= 적은값
		int su = 100;
		long value;
		value = su;
		System.out.println(value);

		char ch = 'A'; // 65 (0100 0001)
		char ch2 = 0x41; // 0x(16진수) 0(8진수)
		int value2;
		value2 = ch;
		System.out.println(value2);

		// 2.강제형변환 ...... 값손실가능성
		// 작은방 = (작은방타입) 큰값
		byte aa;
		int bb = 128;
		aa = (byte) bb;
		System.out.println(aa);

		char cc;
		int dd = 97;
		cc = (char) dd;
		System.out.println(cc);

		int score1 = 100;
		double score2 = 200;
		score2 = score1 + score2;
		System.out.println(score2);
		System.out.println((int) score2);

		short score3 = 100;
		short score4 = 200;
		score4 = (short) (score3 + score4 + 300);
		System.out.println(score4);

		
		
		char ch3 = 'A';
		// ch3 = ch3+3; // 정수를 더함, 리터럴 기본형 int, 형변환(캐스팅) 필요함
		ch3 = (char) (ch3 + 3);
		//ch3 += 3; // 이 경우에는 강제형변환 안해도 컴파일에러 안남 why?
		System.out.println(ch3);

		
		
		String str = "자바!";
		// ch3 = (char) str; // String은 기본형이 아니여서 캐스팅이 안된다
		ch3 = str.charAt(0);
		System.out.println(ch3);

		char ch4 = ' ';
		System.out.println(ch4);
		System.out.println((int) ch4);

		byte by10 = 10;
		byte by11 = 11;
		byte by12 = (byte) (by10 + by11);

		int a1 = 10;
		int a2 = 10;
		int a3 = 10;
		int a4 = 10, a5 = 10, a6 = 10;
		int a7, a8, a9;
		a7 = a8 = a9 = 10;
	}
}
