package com.multi.day12.thread;

class PrintThread1 extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		// 1.flag�̿���
		// while (!stop) {
		// System.out.println("������");
		// try {
		// sleep(300);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }

		// 2.interrupt�̿���
		// try {
		// while (true) {
		// System.out.println("������");
		// sleep(300);
		// }
		// } catch (InterruptedException e) {
		// System.out.println("InterruptedException�߻�");
		// }

		// 3.interrupt
		while (true) {
			System.out.println("������");
			if (Thread.interrupted()) {
				System.out.println("InterruptedException�߻�");
				break;
			}
		}
		System.out.println("�ڿ�����");
		System.out.println("��������");
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
		p.interrupt(); // sleep�Լ��� Interrupt �Ǵ�
		// p.stop(); // ������ �����Լ�...��������ƴ�
		// p.setStop(true); //flag�̿�

	}
}
