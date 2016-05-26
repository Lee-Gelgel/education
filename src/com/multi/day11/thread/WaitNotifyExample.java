package com.multi.day11.thread;

class WorkObject {
	public synchronized void methodA(int i) {
		if (i == 10){notify(); return;}
			System.out.println("Thread의 methodA() 작업 실행");
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	public void methodAA(){
		notify();
	}

	public synchronized void methodB() {
		System.out.println("Thread의 methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ThreadAA extends Thread {
	private WorkObject workObject;

	public ThreadAA(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodA(i);
		}
		workObject.methodA(10);
	}
}

class ThreadBB extends Thread {
	private WorkObject workObject;

	public ThreadBB(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodB();
		}
	}
}

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();

		ThreadAA threadAA = new ThreadAA(sharedObject);
		ThreadBB threadBB = new ThreadBB(sharedObject);

		threadAA.start();
		threadBB.start();

	}
}
