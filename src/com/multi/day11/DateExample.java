package com.multi.day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		System.out.println(sdf.format(d));
	}
}
