package com.multi.day12.thread;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread a = new AutoSaveThread();
		a.setName("자동저장스레드");
		a.setDaemon(true);
		a.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> keys = map.keySet();
		for(Thread t : keys){
			System.out.print("이름 >>" + t.getName() + (t.isDaemon()?"데몬":"주"));
			System.out.println("\t그룹 >>" + t.getThreadGroup().getName());
			System.out.println("===============================");;
			
		}
	}
}
