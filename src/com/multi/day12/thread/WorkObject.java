package com.multi.day12.thread;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA methodA call");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void methodB() {
		System.out.println("ThreadB methodB call");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}
}
