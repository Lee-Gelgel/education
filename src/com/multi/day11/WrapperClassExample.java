package com.multi.day11;

public class WrapperClassExample {
	public static void main(String[] args) {
		int i = 10;
		
		// Boxing
		Integer a = new Integer(10);
		Integer a2 = new Integer(10);
		// AutoBoxing
		Integer b = 128;
		Integer b2 = 128;

		// UnBoxing
		int c = a.intValue();
		// AutoUnBoxing
		int d = a;
		
		//��
		System.out.println(b==b2);  //AutoBoxin 127������ ���ٰ� ���´�
		System.out.println(b.equals(b2));
		
	}
}
