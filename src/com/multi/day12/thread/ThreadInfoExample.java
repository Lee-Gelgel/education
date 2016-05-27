package com.multi.day12.thread;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread a = new AutoSaveThread();
		a.setName("�ڵ����彺����");
		a.setDaemon(true);
		a.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> keys = map.keySet();
		for(Thread t : keys){
			System.out.print("�̸� >>" + t.getName() + (t.isDaemon()?"����":"��"));
			System.out.println("\t�׷� >>" + t.getThreadGroup().getName());
			System.out.println("===============================");;
			
		}
	}
}
