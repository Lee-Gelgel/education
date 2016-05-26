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
//			System.out.println("gel계좌에서 출금:"+amount);
//			shareArea.lu.deposit(amount);
//			System.out.println("lu계좌로 입금:"+amount);
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
