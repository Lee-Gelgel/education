package com.multi.day10;

public class FinalizeExample {
	public static void main(String[] args) {
		for(int i=1; i<=50;i++){
			Counter c = new Counter(i); 
			c = null;
			System.gc();
		}
	}
}
