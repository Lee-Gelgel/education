package com.multi.day14;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit obj1, Fruit obj2) {
//		if(obj1.getCount()<obj2.getCount()) return 1;
//		if(obj1.getCount()>obj2.getCount()) return -1;
//		return 0;
		return obj2.getName().compareTo(obj1.getName());
	}
}
