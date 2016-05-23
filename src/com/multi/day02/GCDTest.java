package com.multi.day02;

public class GCDTest {
	public static void main(String[] args) {
		// int su1 = 5;
		// int su2 = 15;
		// int high;
		// int low;
		// int mod;
		// int a;
		// int b;
		// boolean result = true;
		// // 최대공약수->공통된약수중 가장큰수
		// // 공통된약수->두수를 나누어 떨어지는 수
		// if (su1 > su2) {
		// high = su1;
		// low = su2;
		// } else {
		// high = su2;
		// low = su1;
		// }
		// while (result) {
		// mod = high % low;
		// high = low;
		// low = mod;
		// if (mod == 0) {
		// result = false;
		// }
		// }
		// a = high;
		// System.out.println("최대공약수" + a);
		// b = su1 * su2 / a;
		// System.out.println("최소공배수" + b);

		int su1 = 5;
		int su2 = 15;
		int min = su1 > su2 ? su2 : su1;
		int commonDivisor = 1;
		for (int i = min; i >= i; i--) {
			if(su1%i==0&&su2%i==0)
			commonDivisor = i;
			break;
		}
		System.out.println("최대공약수"+commonDivisor);
	}
}
