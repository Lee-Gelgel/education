package com.multi.day12.thread;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("�۾������� ������");
	}

	@Override
	public void run() {
		while(true){
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			save();
		}
	}
}
