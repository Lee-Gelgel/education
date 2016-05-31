package com.multi.day14;

import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
		treeSet.add(new Fruit("감", 10, "대구"));
		treeSet.add(new Fruit("딸기", 30, "논산"));
		treeSet.add(new Fruit("멜론", 30, "논산"));
		treeSet.add(new Fruit("바나나", 40, "필리핀"));
		treeSet.add(new Fruit("사과", 40, "필리핀"));
		treeSet.add(new Fruit("참외", 40, "필리핀"));
		
		for(Fruit f : treeSet){
			System.out.println(f);
		}
		
	}
}
