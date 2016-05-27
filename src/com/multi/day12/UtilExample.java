package com.multi.day12;

class Pair<K, V> {
	K key;
	V value;

	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

class ChildPair<K, V> extends Pair<K, V> {

	public ChildPair(K key, V value) {
		super(key, value);
		// TODO Auto-generated constructor stub
	}

}

class OtherPair<K, V> {
	K key;
	V value;

	public OtherPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

// class Util<T, T2>{
// T t;
// T2 key;
//
// public static Integer getValue(Pair<String, Integer> pair, String string) {
// if(pair.key == string) return pair.value;
// return null;
// }
// }

class Util {

//	public static Integer getValue(Pair<String, Integer> pair, String string) {
//		if (pair.key == string )return (Integer) pair.value;
//		return null;
//	}
	public static <K, V> V getValue(Pair<K, V> pair, K k) {
		if (pair.key == k)
			return pair.value;
		return null;
	}
}

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("È«±æµ¿", 35);
		Integer age = Util.getValue(pair, "È«±æµ¿");
		System.out.println(age);

		ChildPair<String, Integer> childPair = new ChildPair<>("È«»ï¿ø", 20);
		Integer childAge = Util.getValue(childPair, "È«»ï¼ø");
		System.out.println(childAge);

		// OtherPair<String, Integer> otherPair = new OtherPair<>("È«»ï¿ø",20);
		// int otherAge = Util.getValue(otherPair, "È«»ï¿ø");
		// System.out.println(otherAge);

	}
}
