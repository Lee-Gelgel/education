package com.multi.Pratice;

public class GenericType2 {
	public static void main(String[] args) {
		Integer[] arrInt = { 10, 7, 6, 8, 9 };
		System.out.println(minimum(arrInt));

		String[] arrStr = { "z", "e", "i", "b", "k" };
		System.out.println(minimum(arrStr));
		
	}

	public static <E extends Comparable<E>> E minimum(E[] e) {
		E minimum = e[0];
		for (int i = 1; i < e.length; i++) {
			if (minimum.compareTo(e[i]) > 0) { // minimum == e[i] return 0 // minimum > e[i] return r>0 // minimum < e[i] return r<0
				minimum = e[i];
			}
		}
		return minimum;
	}
}
