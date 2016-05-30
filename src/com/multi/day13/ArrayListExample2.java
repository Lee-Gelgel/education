package com.multi.day13;

import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<Car> carList = MemberInfoDAO.makeCar();
		ListShowView.printcar(carList);
	}
}
