package com.multi.day12.thread;

class PrintThread1 extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		// 1.flag이용방법
		// while (!stop) {
		// System.out.println("실행중");
		// try {
		// sleep(300);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }

		// 2.interrupt이용방법
		// try {
		// while (true) {
		// System.out.println("실행중");
		// sleep(300);
		// }
		// } catch (InterruptedException e) {
		// System.out.println("InterruptedException발생");
		// }

		// 3.interrupt
		while (true) {
			System.out.println("실행중");
			if (Thread.interrupted()) {
				System.out.println("InterruptedException발생");
				break;
			}
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}

}

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 p = new PrintThread1();
		p.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.interrupt(); // sleep함수에 Interrupt 건다
		// p.stop(); // 스레드 종료함수...정상종료아님
		// p.setStop(true); //flag이용

	}
}
