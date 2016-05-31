package com.multi.day14;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		System.out.println(scores);
		Integer score = null;
		// score = scores.first();
		// System.out.println(score);
		// score = scores.last();
		// System.out.println(score);
		// score = scores.lower(95);
		// System.out.println(score);
		// score = scores.higher(95);
		// System.out.println(score);
		//
		// // ����...����
		// score = scores.floor(95);
		// System.out.println(score);
		// // �ø�...����
		// score = scores.ceiling(95);
		// System.out.println(score);

		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println(descendingSet);

		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet();
		System.out.println(descendingSet2);

		NavigableSet<Integer> set =scores.subSet(80, true, 95, true);
		System.out.println(set);

		System.out.println();
		// �ڿ��� ��
		while (!scores.isEmpty()) {
			score = scores.pollLast();
			System.out.println(score);
		}
		// �տ��� ��
		// while(!scores.isEmpty()){
		// score = scores.pollFirst();
		// System.out.println(score);
		// }

		System.out.println(scores);
	}

}