package com.multi.day11.thread;

public class BalancePrintThread extends Thread{
	private ShareArea shareArea;

	public BalancePrintThread(ShareArea shareArea) {
		this.shareArea = shareArea;
	}

	@Override
	public void run() {
		for(int i=1;i<=3;i++){
//			synchronized(shareArea){
//			int gel = shareArea.gel.getBalance();
//			int lu = shareArea.lu.getBalance();
//			System.out.println("µÎ °èÁÂÇÕ°è:"+(gel+lu));
//			}
			shareArea.print();
			try {
				sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
