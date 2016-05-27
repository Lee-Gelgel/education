package com.multi.day12.thread;

public class WorkThread extends Thread{

	public WorkThread(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		while(true){
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName()+"interrupted");
				break;
			}
		}
		System.out.println(getName()+"Á¾·áµÊ");
	}
}
