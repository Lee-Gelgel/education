package com.multi.day14;

import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
		treeSet.add(new Fruit("��", 10, "�뱸"));
		treeSet.add(new Fruit("����", 30, "���"));
		treeSet.add(new Fruit("���", 30, "���"));
		treeSet.add(new Fruit("�ٳ���", 40, "�ʸ���"));
		treeSet.add(new Fruit("���", 40, "�ʸ���"));
		treeSet.add(new Fruit("����", 40, "�ʸ���"));
		
		for(Fruit f : treeSet){
			System.out.println(f);
		}
		
	}
}
