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
				throw new IllegalSizeException("���ڿ��� ���̺��� size�� Ů�ϴ�.");
			} catch (IllegalSizeException e) {
			}
		}
		return str2;
	}

}
// String str : ��ȯ�Ϸ��� ���ڿ�
// int size : ��ȯ�� ���ڿ��� ����
// char fillChar : �� ������ ä�� ����
// << �������� >>
// ��ȯ�� �� ���� ��Ȳ(�ø����� ũ�⺸�� ���� ���ڿ��� ���̰� Ŭ ���)�� �Ǹ� ���ܷ� �����Ͽ� "���ڿ��� ���̺��� size�� Ů�ϴ�."
// ��� ���� �޽����� ������ IllegalSizeException�̶�� ����� ���� ���ܸ� �߻� ��Ų��.
// ���� IllegalSizeException�̶�� ����� ���� ����Ŭ������ �����ؼ� �����ؾ� �Ѵ�.
//
// << ���ǻ��� >>
// 1. �����Ǵ� prob1 ��Ű���� Prob1.java main() �޽��� �������� �ʰ� �����Ѵ�.
// 2. �������� �����Ǵ� leftPad() �޽�� �ñ״��Ĵ� ���� �����ؼ��� �ȵǸ�, ������ �ϼ��ϵ��� �Ѵ�.
// 3. IllegalSizeException Ŭ������ ������ IllegalSizeException.java ���Ͽ� �ۼ��Ѵ�.
// 4. ������ ���� ������ Prob1.java, IllegalSizeException.java �����̴�.
