package com.multi.day14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StatckExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(150));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		System.out.println("����:"+coinBox.peek().getValue());
		
		
		while(!coinBox.isEmpty()){
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : "+coin.getValue()+"��"+" ���������� : "+coinBox.size());
		}
		
		System.out.println();
		
		Queue<Coin> coinBox2 = new LinkedList<>();
		coinBox2.offer(new Coin(150));
		coinBox2.offer(new Coin(50));
		coinBox2.offer(new Coin(500));
		coinBox2.offer(new Coin(10));
		
		while(!coinBox2.isEmpty()){
			Coin coin = coinBox2.poll();
			System.out.println("������ ���� : "+coin.getValue()+"��"+" ���������� : "+coinBox2.size());
		}
	}
}
