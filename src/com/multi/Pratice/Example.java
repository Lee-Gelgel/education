package com.multi.Pratice;

import java.util.HashSet;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("gelgel");
		set.add("null2");
		set.add("null1");
		set.add(null);
		set.add("");
		set.add(null);
		
		for(String str : set){
			System.out.println(str);
		}
		
	}
}
