package com.multi.day11.thread;

//실행흐름 여러개 만들기 (MultiThread)
//1.Thread를 상속받고 run()함수를 Override한다.

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
		//스레드생성
		UpperPrintThread upper = new UpperPrintThread("Thread대문자흐름");
		LowerPrintThread lower = new LowerPrintThread("Thread소문자흐름");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("메인스래드 =>");
		
		
		System.out.println(upper.getPriority());
		upper.setPriority(10);
		System.out.println(upper.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		// 스레드실행...run함수 실행
		upper.start();
		// upper.start(); //실행중 또 실행 : 에러
		lower.start();
		
		
		// 1~26출력작업
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
