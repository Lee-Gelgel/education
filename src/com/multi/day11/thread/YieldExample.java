package com.multi.day11.thread;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		tA.start();
		tB.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tA.work=false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		tA.work=true;
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		tA.stop = true;
		tB.stop = true;
		
	}
}
