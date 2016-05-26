package com.multi.day11;

import java.util.Arrays;

public class ShortExample {
	public static void main(String[] args) {

		Member[] members = new Member[6];
		members[0] = new Member("gelgel", 27);
		members[1] = new Member("lulu", 29);
		members[2] = new Member("donald", 24);
		members[3] = new Member("simon", 27);
		members[4] = new Member("jhon", 48);
		members[5] = new Member("jhonadan", 49);
		// System.out.println("before:"+Arrays.toString(members));
		Arrays.sort(members);
		for(Member printM : members){
			System.out.println(printM);
		}

		// Ascending Sort
		// for(int i=0;i<members.length;i++){
		// System.out.println(members[i]+"\t");
		// }
		//
		// Descending Sort
		// for(int i=members.length-1;i>=0;i--){
		// System.out.println(members[i]+"\t");
		// }

		System.out.println("++++++++++++++++++++++++++++++++++++++");
		String[] serchName = new String[members.length];
		for (int i = 0; i < members.length; i++) {
			serchName[i] = members[i].getName();
		}
		String name = "lulu";
		System.out.println("명단 : "+Arrays.toString(serchName));
		int serchAge = Arrays.binarySearch(serchName, name);
		System.out.println(name+"의 순서는 "+(serchAge+1)+"번째");
		System.out.println(name+"의 나이는 "+members[serchAge].getAge());

		// int index = Arrays.binarySearch(members, serchMember);
		// System.out.println(index);
		// String[] names = { "gelgel", "lulu", "donald", "simon", "jhon" };
		// System.out.println("before:"+Arrays.toString(names));
		// Arrays.sort(names);
		// System.out.println("after:"+Arrays.toString(names));

	}

}
