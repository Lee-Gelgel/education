package com.multi.day09;

interface RemoteControl {
	void turnOn();

	void turnOff();
	
}

public class AnonymousExample2 {
	public static void main(String[] args) {

		// interface, abstract는 new로 객체생성불가하다
		// RemoteControl tv = new RomoteControl();

		// new로 생성하면서 재정의하면 사용가능
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

		// 함수안에다 바로 new해서 생성 재정의
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
