package com.multi.day07;

public enum Week {
	//MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY, SUNDAY;
	MONDAY(2,"월"), TUESDAY(3,"화"), WEDNESDAY(4,"수"), THURDAY(5,"목"), FRIDAY(6,"금"), SATURDAY(7,"토"), SUNDAY(1,"일");
	

	int dayOfWeek;
	String dayName;
	private Week(int dayOfWeek, String dayName) {
		this.dayOfWeek = dayOfWeek;
		this.dayName = dayName;
	}
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public String getDayName() {
		return dayName;
	}

	
	
	
}
