package com.multi.day09;

interface RemoteControl {
	void turnOn();

	void turnOff();
	
}

public class AnonymousExample2 {
	public static void main(String[] args) {

		// interface, abstract�� new�� ��ü�����Ұ��ϴ�
		// RemoteControl tv = new RomoteControl();

		// new�� �����ϸ鼭 �������ϸ� ��밡��
		RemoteControl tv = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("tv trunOn");
			}

			@Override
			public void turnOff() {
				System.out.println("tv trunOff");
			}
		};
		// tv.turnOn();
		// tv.turnOff();
		work(tv);

		RemoteControl audio = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("audio turnOn");
			}

			@Override
			public void turnOff() {
				System.out.println("audio turnOff");
			}
		};
		// audio.turnOn();
		// audio.turnOff();
		work(audio);

		// �Լ��ȿ��� �ٷ� new�ؼ� ���� ������
		work(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("phone turnOn");
			}

			@Override
			public void turnOff() {
				System.out.println("phone turnOff");
			}
		});
	}

	public static void work(RemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.turnOff();
		
	}
}
