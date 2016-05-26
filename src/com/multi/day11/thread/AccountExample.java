package com.multi.day11.thread;

public class AccountExample {
	public static void main(String[] args) {
		Account gel = new Account("1128", "gel", 2000);
		Account lu = new Account("1217", "lu", 1000);
		ShareArea shareArea = new ShareArea(gel, lu);
		TransferThread tt = new TransferThread(shareArea);
		BalancePrintThread bp = new BalancePrintThread(shareArea);
		tt.start();
		bp.start();
	}
}
