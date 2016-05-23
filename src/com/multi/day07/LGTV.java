package com.multi.day07;

public class LGTV extends TV{

	@Override
	public void powerOn() {
		System.out.println(this.getClass().getName()+"powerOn!");
		
	}

	@Override
	public void powerOff() {
		System.out.println(this.getClass().getName()+"powerOff!");
		
	}

	@Override
	public void channelChange() {
		System.out.println(this.getClass().getName()+"channelChange!");
		
	}

	
}
