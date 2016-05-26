package com.multi.day11;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar c = Calendar.getInstance(tz);
		System.out.println(c.getTime());
		
	}
}
