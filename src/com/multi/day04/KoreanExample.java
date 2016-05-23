package com.multi.day04;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("gelgel", "123456");
		System.out.println("이름 : " + k1.name + ", ssn : " + k1.ssn + ", nation : " + k1.nation);

		Korean k2 = new Korean();
		// k2.nation = "USA"; // final은 수정불가
		System.out.println("이름 : " + k2.name + ", ssn : " + k2.ssn + ", nation : " + k2.nation);

	}
}
