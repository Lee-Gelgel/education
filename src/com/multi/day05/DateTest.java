package com.multi.day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws ParseException {
		// 1. 일반적인 Date사용
		Date d = new Date();
		System.out.println(d);
		System.out.printf("%tY %tm %td", d, d, d);

		System.out.println();
		// System.out.println(d.getYear());

		// 2.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));

		// 3. 문자 -> Date
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
		Date dd = sd.parse("2016/05/18");
		System.out.println(dd);
		// 4. Date-> 날짜
		String today = sd.format(dd);
		System.out.println(today);
	}
}
