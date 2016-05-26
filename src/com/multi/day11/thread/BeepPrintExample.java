package com.multi.day11.thread;

import java.awt.Toolkit;

// �ٸ����� ��ӹް��־ Thread�� ��ӹ��� ���Ҷ� , �����带 ����Ϸ��� Runnable�������̽� ����
class BeepTask implements Runnable {
	
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 1; i <= 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class PrintTask implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class BeepPrintExample {
	public static void main(String[] args) {
		BeepTask beep = new BeepTask();
		PrintTask print = new PrintTask();
		
		//Thread t1 = new Thread(beep);
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 1; i <= 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		//Thread t2 = new Thread(print);
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("Beep������ => ");
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName()+"Beep");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}
}
