package com.multi.day12;

import java.util.ArrayList;

public class GenericsTest {
	public static void main(String[] args) {
		
		MyClass<Integer> bb = new MyClass<>();
		bb.setId(1234);
		System.out.println(bb.getId());
		
		MyClass<Double> aa = new MyClass<>();
		aa.setId(1234.0);
		System.out.println(aa.getId());
		
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		String s = list.get(0);
		System.out.println(s);
	}
}
