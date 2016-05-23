package com.multi.day05;

public class OverloadingTest {

	public static void sum(int a, int b) {
		System.out.println("정수 : " + (a + b));
	}

	// Overloading->이름같고 매개변수사양다르다.
	// return만 다른경우 Overloading이 아니다.
	// public static int sum(int a, int b){
	// System.out.println("정수 : "+(a+b));
	// return a+b;
	// }

	public static void sum(double a, double b) {
		System.out.println("실수 : " + (a + b));
	}

	public static void sum(String a, String b) {
		System.out.println("문자 : " + a + b);
	}

	// 비정형인자-->인자의 갯수가 기반인 경우
	// 비정형인자는 하나만 가능
	// 파라메타의 마지막에만 가능
	// public static void sum(String str, int... a) { // 사용가능
	// public static void sum(int... a, String str) { //사용불가
	// public static void sum(int... a, String b) { //사용불가
	public static void sum(int... a) {
		int total = 0;
		// 일반 for문
		// for (int i = 0; i < a.length; i++) {
		// total += a[i];
		// }
		// 향상된 for문
		for (int i : a)

		{
			total += i;
		}
		System.out.println("total : " + total);

	}

	public static void main(String[] args) {
		sum(10, 20);
		sum(3.14, 5.78);
		sum("Java", "Programing");

		sum(1, 2, 3);
		sum(1, 2, 3, 4, 5);
		sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Car car = new Car();
		System.out.println(car);
		
		int i = Integer.parseInt("9");
		System.out.println(i);
		int j = Integer.parseInt("Kona", 25);
		System.out.println(j);
	}
}
