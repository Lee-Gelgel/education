package com.multi.day11.thread;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println(getClass().getSimpleName() + "�۾�����");
			} else {
				 yield();
			}
		}
		System.out.println(getClass().getSimpleName()  + "�۾�����");
	}
}
