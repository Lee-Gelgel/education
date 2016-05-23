package com.multi.day07;

public enum Week {
	//MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY, SUNDAY;
	MONDAY(2,"��"), TUESDAY(3,"ȭ"), WEDNESDAY(4,"��"), THURDAY(5,"��"), FRIDAY(6,"��"), SATURDAY(7,"��"), SUNDAY(1,"��");
	

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
