package com.multi.day12.thread;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if (data == null) {
			System.out.println("소비자가 대기...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String returnValue = data;
		System.out.println("소비자가 소비한 Data >>" + returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) {
			System.out.println("생산자가 대기...");
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		System.out.println("생산자가 생산한 Data >>" + data);
		notify();
	}

}
