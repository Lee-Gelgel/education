package com.multi.day02;

public class ReferenceVar {
	public static void main(String[] args) {
		//int a = 10, b = 10;
		int a=10,b=8;b+=2;
		System.err.println(a == b);// ���� ��

		String s1 = "java";// compile�ÿ� ���� �ּ� �Ҵ�
		s1 += "pro";
		String s2 = "java";// �̹� ������ ���ڰ��ִٸ� �� �ּҸ� ����
		s2 += "pro";
		String s3 = new String("java");// runtime�ÿ� ����
		String s4 = new String("java");
		System.out.println(s1 == s2);// �ּ� ��
		System.out.println(s1.equals(s2));// ���� ��
		System.out.println(s3 == s4);// �ּ� ��
		System.out.println(s3.equals(s4));// ���� ��
	}
}

