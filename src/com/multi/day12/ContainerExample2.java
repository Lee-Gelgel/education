package com.multi.day12;

class Container2<T, T2> {
	T key;
	T2 value;

	public void set(T key, T2 value) {
		this.key = key;
		this.value = value;
	}

	public T getKey() {
		return key;
	}

	public T2 getValue() {
		return value;
	}
}

public class ContainerExample2 {
	public static void main(String[] args) {
		Container2<String, String> container1 = new Container2<>();
		container1.set("È«±âµ¿", "µµÀû");
		String name1 = container1.getKey();
		String job = container1.getValue();

		Container2<String, Integer> container2 = new Container2<>();
		container2.set("È«±âµ¿", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();

		System.out.println(name1+", "+job);
		System.out.println(name2+", "+age);
	}
}
