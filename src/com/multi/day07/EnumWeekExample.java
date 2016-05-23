package com.multi.day07;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		//열거 타입 변수 선언
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(week);
		
		Week[] weeks = Week.values();
		for(Week w : weeks){
			//System.out.println(w.dayOfWeek+", "+w.dayName);
			if(week == w.dayOfWeek){
				System.out.println("오늘 요일: "+w.dayName);
			}
		}
		if(week == 1) {
			System.out.println("일요일에는 축구를 합니다");
		} else {
			System.out.println("열심히 자바 공부를 합니다");
		}
		
		
//		Calendar cal = Calendar.getInstance();
//		int week = cal.get(Calendar.DAY_OF_WEEK);
//		
//		switch(week){
//		case 1:
//			today = Week.SUNDAY; break;
//		case 2:
//			today = Week.MONDAY; break;
//		case 3:
//			today = Week.TUESDAY; break;
//		case 4:
//			today = Week.WEDNESDAY; break;
//		case 5:
//			today = Week.THURDAY; break;
//		case 6:
//			today = Week.FRIDAY; break;
//		case 7:
//			today = Week.SATURDAY; break;
//		}
		
//		System.out.println("오늘 요일: "+today);
//		
//		if(today == Week.SUNDAY){
//			System.out.println("일요일에는 축구를 합니다");
//		} else {
//			System.out.println("열심히 자바 공부를 합니다");
//		}
	}
}
