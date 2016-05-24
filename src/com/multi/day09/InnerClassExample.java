package com.multi.day09;

public class InnerClassExample {
	public static void main(String[] args) {
		outMethod(3, 4);
	}

	static void outMethod(final int arg1, int arg2) {
		// java7�� final ������ ���δ�, java8�� final ��������, �ǹ̴� ������ final ,�� ���� �Ұ�
		final int var1 = 1;
		int var2 = 2;
		class LocalClass {
			// final���� ������ �̰��� ����ȴ�
			void method() {
				// final�ִ� ������ �̰��� ����ȴ�
				int result = arg1 + arg2 + var1 + var2;
				System.out.println(result);
			}
		}
		LocalClass aa = new LocalClass();
		aa.method();
	}
}
