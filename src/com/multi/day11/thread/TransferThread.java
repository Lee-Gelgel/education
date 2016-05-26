package com.multi.day11.thread;

public class TransferThread extends Thread{
	private ShareArea shareArea;

	public TransferThread(ShareArea shareArea) {
		this.shareArea = shareArea;
	}

	@Override
	public void run() {
		for(int i=1;i<=12;i++){
			synchronized(shareArea){
//			int amount = shareArea.gel.witdraw(100);
//			System.out.println("gel���¿��� ���:"+amount);
//			shareArea.lu.deposit(amount);
//			System.out.println("lu���·� �Ա�:"+amount);
				shareArea.transfer();
				try {
					sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
