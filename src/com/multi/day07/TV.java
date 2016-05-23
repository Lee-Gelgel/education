package com.multi.day07;

public abstract class TV {
	public void print(){
		System.out.println("공유모듈입니다.");
	}
	
	public abstract void powerOn();

	public abstract void powerOff();

	public abstract void channelChange();
}
