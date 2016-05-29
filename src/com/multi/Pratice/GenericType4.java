package com.multi.Pratice;

import java.util.ArrayList;

public class GenericType4 {
	public static void main(String args[]) {
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(10);
		arrInt.add(6);
		arrInt.add(9);
		arrInt.add(8);
		arrInt.add(7);

		for (Integer arr : arrInt) {
			System.out.print(arr + " ");
		}
		System.out.println();
		arrInt = genericTypeSort(arrInt);
		for (Integer arr : arrInt) {
			System.out.print(arr + " ");
		}

		System.out.println();
		ArrayList<String> arrStr = new ArrayList<>();
		arrStr.add("c");
		arrStr.add("e");
		arrStr.add("a");
		arrStr.add("d");
		arrStr.add("b");
		for (String arr : arrStr) {
			System.out.print(arr + " ");
		}
		System.out.println();
		arrStr = genericTypeSort(arrStr);
		for (String arr : arrStr) {
			System.out.print(arr + " ");
		}

	}

	public static <Type extends Comparable<Type>> ArrayList<Type> genericTypeSort(ArrayList<Type> list) {

		ArrayList<Type> newArrayList = new ArrayList<>();
		Type minimum = null;
		Integer minIndex = null;
		int cnt = list.size();
		for (int i = 0; i < cnt; i++) {
			minimum = list.get(0);
			minIndex = 0;
			for (int j = 1; j < list.size(); j++) {
				if (minimum.compareTo(list.get(j)) > 0) {
					minimum = list.get(j);
					minIndex = j;
				}
			}
			newArrayList.add(minimum);
			list.remove((int) minIndex);
		}
		return newArrayList;
	}
}
