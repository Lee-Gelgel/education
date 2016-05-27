package com.multi.day12.thread;

public class WaitNotifyExample2{
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		ProducerThread pt= new ProducerThread(dataBox);
		ConsumerThread ct = new ConsumerThread(dataBox);
		
		pt.start();
		ct.start();
		
	}
}
