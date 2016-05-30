package com.multi.day13;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(100);
		hs.add(90);
		hs.add(80);
		hs.add(70);
		hs.add(60);
		System.out.println(hs);

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(100);
		ts.add(90);
		ts.add(80);
		ts.add(70);
		ts.add(60);
		System.out.println(ts);

		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("z");
		ts2.add("f");
		ts2.add("e");
		ts2.add("a");
		ts2.add("b");
		
		System.out.println(ts2);
		System.out.println(ts2.descendingSet());
		
		//data�� add�Ǹ鼭 sort�ȴ�
		//Comparable<T> �������̽� �����ؾ��Ѵ�
		TreeSet<Car> tree = new TreeSet<>();
		tree.add(new Car("�׷���", 4000));
		tree.add(new Car("����", 8000));
		tree.add(new Car("ī�Ϲ�", 3000));
		tree.add(new Car("���", 2500));
		tree.add(new Car("�ҳ�Ÿ", 2800));
		for(Car c : tree){
			System.out.println(c);
		}

	}
}
