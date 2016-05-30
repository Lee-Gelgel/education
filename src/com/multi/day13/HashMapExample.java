package com.multi.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("gelgel", 100);
		map.put("lulu", 70);
		map.put("simon", 60);
		map.put("donald", 80);
		map.put("jhon", 90);
		Integer score = map.get("gelgel");
		System.out.println(score);
		System.out.println("============================");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + "=>" + value);
		}
		System.out.println("============================");
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key + "=>" + value);
		}
		System.out.println("============================");
		for (Map.Entry<String, Integer> ee : map.entrySet()) {
			String key = ee.getKey();
			Integer value = ee.getValue();
			System.out.println(key + "=>" + value);
		}
	}
}
