package com.multi.day07;

public class TVUser {

	public static void main(String[] args) {
		TV tv = new LGTV() ;
		tv.powerOn();
		tv.channelChange();
		tv.powerOff();
	}
}
