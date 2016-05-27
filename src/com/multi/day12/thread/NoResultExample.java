package com.multi.day12.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		// ������Ǯ ����
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("�۾�ó����û");

		// return ���°�� Runnable
		// Runnable runnable = new Runnable() {
		// @Override
		// public void run() {
		// int sum = 0;
		// for (int i = 0; i <= 10; i++) {
		// sum += i;
		// }
		// System.out.println("ó���İ��:" + sum);
		//
		// }
		// };

		// return �ִ°�� Callable
		Callable<Integer> callalble = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 0; i <= 10; i++) {
					sum += i;
				}
				System.out.println("ó���İ��:" + sum);
				return sum;
			}
		};
		// Future future = es.submit(runnable);
		Future<Integer> future = es.submit(callalble);
		System.out.println("�۾�ó���Ϸ�");
		try {
			// Object obj = future.get(); // ���ŷ...return����
			// System.out.println("�۾��Ϸ�..." + obj);
			int sum = future.get();
			System.out.println("�۾��Ϸ�..."+sum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�������:" + e.getMessage());
		}

		// ������Ǯ ����
		es.shutdown();
	}
}
