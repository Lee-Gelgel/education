package com.multi.day10;

import java.util.Comparator;

public class CarComparator implements Comparator<Car>{

	@Override
	public int compare(Car aa, Car bb) {
		if(aa.price<bb.price) return -1;
		if(aa.price>bb.price) return 1;
		return 0;
	}

	
}
