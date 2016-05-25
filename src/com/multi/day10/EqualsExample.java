package com.multi.day10;

import java.util.Arrays;
import java.util.Objects;

public class EqualsExample {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		System.out.println(a.equals(b));

		System.out.println("--------------");
		// Car c1 = null;
		// Car c2 = null;
		Car c1 = new Car("¿¡Äí½º", 8000);
		Car c2 = new Car("¿¡Äí½º", 8000);
		System.out.println(c1.equals(c2));
		System.out.println(Objects.equals(c1, c2));
		System.out.println("--------------");
		Integer arr1[]={1,2,3};
		Integer arr2[]={1,2,3};
		System.out.println(arr1.equals(arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println("--------------");
	}

}
