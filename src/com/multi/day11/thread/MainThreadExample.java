package com.multi.day11.thread;

//공유자원
class Calculator{
	private int memory;

	public synchronized int getMemory() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}
		//System.out.println(Thread.currentThread().getName()+"=>"+memory);
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
	}
}

class User1Thread extends Thread{
	Calculator cal;
	public void setCal(Calculator cal) {
		this.cal = cal;
		setName(this.getClass().getSimpleName());
	}
	@Override
	public void run() {
		cal.setMemory(100);
		int value = cal.getMemory();
		 System.out.println(Thread.currentThread().getName()+"=>"+value);

	}
}

class User2Thread extends Thread{
	Calculator cal;
	public void setCal(Calculator cal) {
		this.cal = cal;
		setName(this.getClass().getSimpleName());
	}
	@Override
	public void run() {
		cal.setMemory(50);
		int value = cal.getMemory();
		System.out.println(Thread.currentThread().getName()+"=>"+value);

	}
}

public class MainThreadExample {
	public static void main(String[] args) {
		User1Thread user1 = new User1Thread();
		User2Thread user2 = new User2Thread();
		Calculator cal = new Calculator();
		user1.setCal(cal);
		user2.setCal(cal);
		user1.start();
		user2.start();
		
	}
}
