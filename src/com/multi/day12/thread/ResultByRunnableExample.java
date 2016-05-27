package com.multi.day12.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Result {
	int accumValue;

	synchronized void addValue(int value) {
		accumValue += value;
	}
}

public class ResultByRunnableExample {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		System.out.println("�۾�ó����û");

		class Task implements Runnable {
			Result result;

			Task(Result result) {
				this.result = result;
			}

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				result.addValue(sum);
				
			}

		}

		System.out.println("�۾�ó����û");
		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		Runnable task3 = new Task(result);
		Future<Result> future1 = es.submit(task1,result);
		Future<Result> future2 = es.submit(task2,result);
		Future<Result> future3 = es.submit(task3,result);
		
		System.out.println("�۾�ó���Ϸ�");
		try {
			result = future1.get();
			System.out.println("ó�����>>"+result.accumValue);
			result = future2.get();
			System.out.println("ó�����>>"+result.accumValue);
			result = future3.get();
			System.out.println("ó�����>>"+result.accumValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("������Ǯ����");
		es.shutdown();
	}
}
