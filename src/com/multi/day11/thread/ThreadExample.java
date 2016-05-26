package com.multi.day11.thread;

//�����帧 ������ ����� (MultiThread)
//1.Thread�� ��ӹް� run()�Լ��� Override�Ѵ�.

class UpperPrintThread extends Thread {
	
	public UpperPrintThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(currentThread().getName()+"==>"+c);
			try {
				sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class LowerPrintThread extends Thread {
	
	
	
	public LowerPrintThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(currentThread().getName()+"==>"+c);
			try {
				sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class PrintTherad extends Thread {

	@Override
	public void run() {
		for (int c = 1; c <= 26; c++) {
			
			System.out.println(c);
		}
	}
}

public class ThreadExample{
	public static void main(String[] args) {
		//���������
		UpperPrintThread upper = new UpperPrintThread("Thread�빮���帧");
		LowerPrintThread lower = new LowerPrintThread("Thread�ҹ����帧");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("���ν����� =>");
		
		
		System.out.println(upper.getPriority());
		upper.setPriority(10);
		System.out.println(upper.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		// ���������...run�Լ� ����
		upper.start();
		// upper.start(); //������ �� ���� : ����
		lower.start();
		
		
		// 1~26����۾�
		for (int c = 1; c <= 26; c++) {
			System.out.println(Thread.currentThread().getName()+"==>"+c);
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
