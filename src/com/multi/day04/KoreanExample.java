package com.multi.day04;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("gelgel", "123456");
		System.out.println("�̸� : " + k1.name + ", ssn : " + k1.ssn + ", nation : " + k1.nation);

		Korean k2 = new Korean();
		// k2.nation = "USA"; // final�� �����Ұ�
		System.out.println("�̸� : " + k2.name + ", ssn : " + k2.ssn + ", nation : " + k2.nation);

	}
}
