package com.multi.day13;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
	ExecutorService executorService = Executors.newFixedThreadPool(4);
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed()실행: " + result);
		}

		@Override
		public void failed(Throwable exc, Void attachment) {
			// System.out.println("failed()실행 :" + exc.toString());
			System.out.println("failed()실행 :" + exc.getMessage());   //*****
		}
	};
	
	public void doWork(String a, String b){
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try{
				int x = Integer.parseInt(a);
				int y = Integer.parseInt(b);
				int result = x+y;
				callback.completed(result, null);
				} catch (Exception e) {
				callback.failed(e, null);
				}
			}
		};
		executorService.submit(task);
	}
	
	public void finish(){
		executorService.shutdown();
	}

	public static void main(String[] args) {
		CallbackExample callbackExample = new CallbackExample();
		callbackExample.doWork("10", "20");
		callbackExample.doWork("5", "7");
		callbackExample.doWork("5", "칠");
		callbackExample.finish();
	}

}
