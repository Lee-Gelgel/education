package com.multi.day13;

import java.util.HashMap;

public class HashMapExample2 {
	public static void cartPrint(HashMap<String, Fruit> cart){
		System.out.println("######��ٱ���Ȯ��######");
		for (String key : cart.keySet()) {
			System.out.println(key + "=>" + cart.get(key));
		}
	}
	
	public static void cartCheck(Fruit newFruit, HashMap<String, Fruit> cart){
		String newKey = newFruit.getName();
		if (cart.containsKey(newKey)) {
			Fruit oldFruit = cart.get(newKey);
			int oldCount = oldFruit.getCount();
			oldFruit.setCount(oldCount + newFruit.getCount());
		} else {
			cart.put(newKey, newFruit);
		}
	}
	
	
	public static void main(String[] args) {
		HashMap<String, Fruit> cart = new HashMap<>();
		cart.put("���", new Fruit("���", 10, "�뱸"));
		cart.put("�ٳ���", new Fruit("�ڵ�", 20, "�ʸ���"));

		// ��ٱ��� Ȯ��
		cartPrint(cart);
		// �߰�����
		Fruit newFruit = new Fruit("����", 20, "û��");
		cartCheck(newFruit, cart);
		newFruit = new Fruit("���", 20, "û��");
		cartCheck(newFruit, cart);
		
		// ��ٱ��� Ȯ��
		cartPrint(cart);
	}
}
