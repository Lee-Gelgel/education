package com.multi.day09;

public class InnerClassExample {
	public static void main(String[] args) {
		outMethod(3, 4);
	}

	static void outMethod(final int arg1, int arg2) {
		// java7은 final 무조건 붙인다, java8은 final 생략가능, 의미는 무조건 final ,값 수정 불가
		final int var1 = 1;
		int var2 = 2;
		class LocalClass {
			// final없는 변수는 이곳에 복사된다
			void method() {
				// final있는 변수는 이곳에 복사된다
				int result = arg1 + arg2 + var1 + var2;
				System.out.println(result);
			}
		}
		LocalClass aa = new LocalClass();
		aa.method();
	}
}
