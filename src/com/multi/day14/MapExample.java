package com.multi.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			int value = map.get(key);
			totalScore += value;
			if(maxScore< value){
				maxScore=value;
				name = key;
			}
		}

		System.out.println("평균점수:"+totalScore/map.size());
		System.out.println("최고점수:"+maxScore);
		System.out.println("최고점수를 받은 아이디:"+name);
	}
}
