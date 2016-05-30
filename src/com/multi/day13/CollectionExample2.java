package com.multi.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionExample2 {
	//List -> ArrayList, LinkedList, Vector(동기화)
	public static void main(String[] args) {
		List<String> myClass = new ArrayList<>();
		myClass.add("gelgel");
		myClass.add("lulu");
		myClass.add("simon");
		myClass.add("donald");
		myClass.add("donald");
		// 일반for
		for (int i = 0; i < myClass.size(); i++) {
			System.out.print(myClass.get(i) + " ");
		}
		System.out.println();
		// 향상for
		for (String str : myClass) {
			System.out.print(str + " ");
		}
		System.out.println();
		// Iterator
		Iterator<String> it = myClass.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("================================");

		myClass = new Vector<>();
		myClass.add("gelgel");
		myClass.add("lulu");
		myClass.add("simon");
		myClass.add("donald");
		myClass.add("donald");
		// 일반for
		for (int i = 0; i < myClass.size(); i++) {
			System.out.print(myClass.get(i) + " ");
		}
		System.out.println();
		// 향상for
		for (String str : myClass) {
			System.out.print(str + " ");
		}
		System.out.println();
		// Iterator
		Iterator<String> it2 = myClass.iterator();
		while (it2.hasNext()) {
			String s = it2.next();
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("================================");

		myClass = new LinkedList<>();
		myClass.add("gelgel");
		myClass.add("lulu");
		myClass.add("simon");
		myClass.add("donald");
		myClass.add("donald");
		// 일반for
		for (int i = 0; i < myClass.size(); i++) {
			System.out.print(myClass.get(i) + " ");
		}
		System.out.println();
		// 향상for
		for (String str : myClass) {
			System.out.print(str + " ");
		}
		System.out.println();
		// Iterator
		Iterator<String> it3 = myClass.iterator();
		while (it3.hasNext()) {
			String s = it3.next();
			System.out.print(s + " ");
		}
	}
}
