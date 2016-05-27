package com.multi.day12;

class Container<T> {
	T t;

	void set(T t) {
		this.t = t;
	}

	T get() {
		return t;
	}

}

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<>();
		container1.set("ȫ�浿");
		String str= container1.get();
		
		Container<Integer> container2 = new Container<>();
		container2.set(6);
		int value= container2.get();
		System.out.println(str);
		System.out.println(value);
	}
}
