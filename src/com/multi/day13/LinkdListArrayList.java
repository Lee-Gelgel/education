package com.multi.day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkdListArrayList {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<>();
		List<String> linkList = new LinkedList<>();
		long sTime;
		long eTime;
		sTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			arrList.add(0,""+i);
			
		}
		eTime = System.nanoTime();
		System.out.println("ArrayList:"+(eTime-sTime)+"nanoTime");
		
		
		sTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			linkList.add(0,""+i);
			
		}
		eTime = System.nanoTime();
		System.out.println("LinkList:"+(eTime-sTime)+"nanoTime");
		
	}
}
