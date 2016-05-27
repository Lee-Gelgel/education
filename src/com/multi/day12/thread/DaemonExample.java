package com.multi.day12.thread;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread a = new AutoSaveThread();
		a.setDaemon(true); // 보조스레드
		a.start();
		
		String group = Thread.currentThread().getThreadGroup().getName();
		System.out.println(group);
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인종료");
	}
}
