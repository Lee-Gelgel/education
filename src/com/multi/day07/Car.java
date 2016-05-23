package com.multi.day07;

public class Car {
	Tire[] tires = { 
			new Tire(TireLocation.FRONT_LEFT, 6), new Tire(TireLocation.FRONT_RIGHT, 2),
			new Tire(TireLocation.BACK_LEFT, 3), new Tire(TireLocation.BACK_RIGHT, 4) };

	// Tire[] tires = new Tire[4];
	// {
	// tires[0] = new Tire(TireLocation.FRONT_LEFT, 6);
	// tires[1] = new Tire(TireLocation.FRONT_RIGHT, 2);
	// tires[2] = new Tire(TireLocation.BACK_LEFT, 3);
	// tires[3] = new Tire(TireLocation.BACK_RIGHT, 4);
	// }

	// Tire frontLeftTire = new Tire(TireLocation.FRONT_LEFT,6);
	// Tire frontRightTire = new Tire(TireLocation.FRONT_RIGHT,2);
	// Tire backLeftTire = new Tire(TireLocation.BACK_LEFT,3);
	// Tire backRightTire = new Tire(TireLocation.BACK_RIGHT,4);

	TireLocation run() {
		System.out.println("자동차가 달립니다.");
		if (tires[0].roll() == false) {
			stop(TireLocation.FRONT_LEFT);
			return TireLocation.FRONT_LEFT;
		}
		if (tires[1].roll() == false) {
			stop(TireLocation.FRONT_RIGHT);
			return TireLocation.FRONT_RIGHT;
		}
		if (tires[2].roll() == false) {
			stop(TireLocation.BACK_LEFT);
			return TireLocation.BACK_LEFT;
		}
		if (tires[3].roll() == false) {
			stop(TireLocation.BACK_RIGHT);
			return TireLocation.BACK_RIGHT;
		}
		return TireLocation.NONE;
	}

	void stop(TireLocation where) {
		System.out.println("자동차" + where + "이 멈춤니다.");
	}
}
