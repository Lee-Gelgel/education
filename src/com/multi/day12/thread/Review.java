package com.multi.day12.thread;

public class Review {
	public static void main(String[] args) {
		// 1.Thread���..�͸�ü
		Thread t1 = new Thread("Thread���") {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(currentThread().getName() + "=>" + i);
				}
			}
		};
		// 2.Runnable ����
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(ThreadB.currentThread().getName() + "=>" + i);
				}
			}
		},"Runnable����");
		
		
	
		t1.start();
		t2.start();
		
		System.out.println("main����");
	}
}
