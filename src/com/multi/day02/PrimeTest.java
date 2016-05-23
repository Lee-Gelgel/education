package com.multi.day02;

//소수란 자신과 1외의 다른 수로는 나누어 떨어지지 않는 정수입니다. 
//실행 결과가 아래와 같이 50 이하의 소수를 모두 출력하는 프로그램을 작성하십시오.
public class PrimeTest {
	public static void main(String[] args) {
		// int su = 7;
		// boolean isPrime = true;
		//
		// for (int i = 2; i < su; i++) {
		// if (su % i == 0) {
		// isPrime = false;
		// break;
		// }
		// }
		// if (isPrime) {
		// System.out.println(su + "소수O");
		// } else {
		// System.out.println(su + "소수X");
		// }

		for (int i = 2; i <= 50; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && i != j) {
					break;
				} else if (i == j) {
					System.out.println(i);
				}
			}
		}
	}
}
