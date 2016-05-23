package com.multi.day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PackageTest2 {
	public static void main(String[] args) throws ParseException {
		// Date d = new Date();
		// System.out.println(d);
		Calendar calendar = Calendar.getInstance();
		calendar.set(2010, 4, 5);
		System.out.printf("%tY년 %tm월 %td일 %tH시 %tM분 %tS초", calendar, calendar, calendar, calendar, calendar, calendar);
		System.out.println();
		System.out.printf("%tY년 %tm월 %td일 %tH시 %tM분 %tS초", calendar, calendar, calendar, calendar, calendar, calendar);

		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		//문자를 date로 바꾸기
		Date d = sd.parse("2016-05-18");
		System.out.println(d);
		//date를 문자로 바꾸기
		Calendar cal2 = Calendar.getInstance(); 
		String s = sd.format(cal2.getTime());
		System.out.println(s);
		
		// int year = calendar.get(Calendar.YEAR);
		// int month = calendar.get(Calendar.MONTH);
		// int day = calendar.get(Calendar.DAY_OF_MONTH);
		// int hour = calendar.get(Calendar.HOUR);
		// int minute = calendar.get(Calendar.MINUTE);
		// int second = calendar.get(Calendar.SECOND);
		// System.out.println(year+"년도");
		// System.out.println(month+"월");
		// System.out.println(day+"일");
		// System.out.println(hour+"시");
		// System.out.println(minute+"분");
		// System.out.println(second+"초");

	}
}
