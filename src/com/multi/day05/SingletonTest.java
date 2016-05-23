package com.multi.day05;

import java.util.Calendar;

public class SingletonTest {
	public static void main(String[] args) {
		MyService myService = MyService.getInstance();
		MyService myService2 = MyService.getInstance();
		System.out.println(myService==myService2);
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal2.getTimeInMillis());
		System.out.println(cal==cal2);
		
		//static->class변수
		//final->상수
		//Integer.MAX_VALUE = 100;
		Integer aa = 100;
		//System.out.println(aa.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
	}
}
