package com.multi.day10;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {

		String s1 = "gelgel";
		String s2 = null;

		System.out.println("s1 null? " + Objects.isNull(s1));
		System.out.println("s2 null? " + Objects.isNull(s2));
		System.out.println("s1 nonNull? " + Objects.nonNull(s1));
		System.out.println("s2 nonNull? " + Objects.nonNull(s2));

		String name = null;
		try {
			name = Objects.requireNonNull(s2, "이름이 없음");
			System.out.println(name);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Done.");
		}

	}
}
