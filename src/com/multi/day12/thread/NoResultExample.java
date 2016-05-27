package com.multi.day12.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		// 스래드풀 생성
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("작업처리요청");

		// return 없는경우 Runnable
		// Runnable runnable = new Runnable() {
		// @Override
		// public void run() {
		// int sum = 0;
		// for (int i = 0; i <= 10; i++) {
		// sum += i;
		// }
		// System.out.println("처리후결과:" + sum);
		//
		// }
		// };

		// return 있는경우 Callable
		Callable<Integer> callalble = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 0; i <= 10; i++) {
					sum += i;
				}
				System.out.println("처리후결과:" + sum);
				return sum;
			}
		};
		// Future future = es.submit(runnable);
		Future<Integer> future = es.submit(callalble);
		System.out.println("작업처리완료");
		try {
			// Object obj = future.get(); // 브로킹...return없음
			// System.out.println("작업완료..." + obj);
			int sum = future.get();
			System.out.println("작업완료..."+sum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("실행오류:" + e.getMessage());
		}

		// 스래드풀 종료
		es.shutdown();
	}
}
