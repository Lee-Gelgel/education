package com.multi.day13;

import java.util.List;

public class ListShowView {
	public static void printcar(List<Car> carList){
		System.out.println("Car의 정보출력******");
		for(Car c : carList){
			System.out.println(c);
		}
	}
}
