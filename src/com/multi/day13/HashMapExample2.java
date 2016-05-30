package com.multi.day13;

import java.util.HashMap;

public class HashMapExample2 {
	public static void cartPrint(HashMap<String, Fruit> cart){
		System.out.println("######장바구니확인######");
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
		cart.put("사과", new Fruit("사과", 10, "대구"));
		cart.put("바나나", new Fruit("자두", 20, "필리핀"));

		// 장바구니 확인
		cartPrint(cart);
		// 추가구매
		Fruit newFruit = new Fruit("딸기", 20, "청송");
		cartCheck(newFruit, cart);
		newFruit = new Fruit("사과", 20, "청송");
		cartCheck(newFruit, cart);
		
		// 장바구니 확인
		cartPrint(cart);
	}
}
