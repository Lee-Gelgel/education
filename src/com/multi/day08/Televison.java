package com.multi.day08;

public abstract class Televison implements RemoteControl {

	@Override
	public abstract void turnOn();

	@Override
	public void turnOff() {
		System.out.println(getClass().getSimpleName() + "������ ����...");
	}

	
}
