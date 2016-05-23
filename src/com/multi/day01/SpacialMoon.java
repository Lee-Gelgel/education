package com.multi.day01;

public class SpacialMoon {

	public static void main(String[] args) {
		// 주어진 년도 월의 말일을 출력한다
		int year = 2016;
		int month = 2;
		int day;
		
		switch (month) {
		case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
			day = 31; break;
		case 4:	case 6:	case 9:	case 11: 
			day = 30;
		}
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && month == 2) {
			day = 29;
		} else {
			day = 28;
		}

		System.out.println(year + "년도 " + month + "월의 말일은 " + day + "일입니다.");
		/*
		if(month==2){
			if(year%4==0 && year!=100 || year%400==0) {
				day=29;
			} else {
				day=28;
			}
		} else {
			if(month==4 || month==6 || month==9 || month==11){
				day=30;
			} else {
				day=31;
			}
		}
		System.out.println(year + "년도 " + month + "월의 말일은 " + day + "일입니다.");
		*/

	}
}
