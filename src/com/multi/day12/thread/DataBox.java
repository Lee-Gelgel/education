package com.multi.day12.thread;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if (data == null) {
			System.out.println("�Һ��ڰ� ���...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String returnValue = data;
		System.out.println("�Һ��ڰ� �Һ��� Data >>" + returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) {
			System.out.println("�����ڰ� ���...");
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		System.out.println("�����ڰ� ������ Data >>" + data);
		notify();
	}

}
