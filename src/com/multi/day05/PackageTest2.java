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
		System.out.printf("%tY�� %tm�� %td�� %tH�� %tM�� %tS��", calendar, calendar, calendar, calendar, calendar, calendar);
		System.out.println();
		System.out.printf("%tY�� %tm�� %td�� %tH�� %tM�� %tS��", calendar, calendar, calendar, calendar, calendar, calendar);

		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		//���ڸ� date�� �ٲٱ�
		Date d = sd.parse("2016-05-18");
		System.out.println(d);
		//date�� ���ڷ� �ٲٱ�
		Calendar cal2 = Calendar.getInstance(); 
		String s = sd.format(cal2.getTime());
		System.out.println(s);
		
		// int year = calendar.get(Calendar.YEAR);
		// int month = calendar.get(Calendar.MONTH);
		// int day = calendar.get(Calendar.DAY_OF_MONTH);
		// int hour = calendar.get(Calendar.HOUR);
		// int minute = calendar.get(Calendar.MINUTE);
		// int second = calendar.get(Calendar.SECOND);
		// System.out.println(year+"�⵵");
		// System.out.println(month+"��");
		// System.out.println(day+"��");
		// System.out.println(hour+"��");
		// System.out.println(minute+"��");
		// System.out.println(second+"��");

	}
}
