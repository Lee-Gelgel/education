package com.multi.day12.thread;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject share = new WorkObject();
		ThreadA a = new ThreadA(share);
		ThreadB b = new ThreadB(share);
		b.start();
		a.start();
	}
}
