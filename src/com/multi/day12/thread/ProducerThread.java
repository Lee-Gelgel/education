package com.multi.day12.thread;

public class ProducerThread extends Thread{
	DataBox dataBox;
	String[] msg = {"Hello","glegel","lulu"};
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++){
			dataBox.setData(msg[i]);
		}
	}
	
	
}
