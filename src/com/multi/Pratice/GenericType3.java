package com.multi.Pratice;

import java.util.ArrayList;

public class GenericType3 {
	public static void main(String[] args) {
		ArrayList<String> arrStr = new ArrayList<>();
		arrStr.add("gelgel");
		arrStr.add("lulu");
		arrStr.add("gelgel");
		arrStr.add("lulu");
		arrStr.add("gelgel");
		arrStr.add("donald");
		arrStr = RemoveDuplication(arrStr);
		for (int i = 0; i < arrStr.size(); i++) {
			System.out.println(arrStr.get(i));
		}
		
		System.out.println(">>>><<<<<");
		ArrayList<Integer> arrInt = new ArrayList<>();
		arrInt.add(100);
		arrInt.add(100);
		arrInt.add(99);
		arrInt.add(100);
		arrInt.add(98);
		arrInt = RemoveDuplication(arrInt);
		for (int i = 0; i < arrInt.size(); i++) {
			System.out.println(arrInt.get(i));
		}
	}
	
	public static <Type> ArrayList<Type> RemoveDuplication(ArrayList<Type> list){
		ArrayList<Type> newArrayList = new ArrayList<>();
		for(int i=0;i<list.size();i++){
			if(!newArrayList.contains(list.get(i))){
				newArrayList.add(list.get(i));
			}
		}
		return newArrayList;
	}
}
