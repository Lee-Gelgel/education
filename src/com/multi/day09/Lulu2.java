package com.multi.day09;

public class Lulu2 {
	String str = "lulu";
	int a = 1;

	public void print() {
		// 2-1 �޼ҵ� ���ο� ����� Ŭ����
		class Local {
			void print2() {
				str = "gelgel";
				a = 10;
				System.out.println(str); // 2-2 �ٱ�Ŭ������ ����ʵ�� �޼ҵ带 ����Ҽ��ִ�
			}
		}
	}

	public static void main(String[] args) {
	}

}
