package com.multi.day08;

public class InterfaceExample3 {
	public static void main(String[] args) {
		Refre r = new Refre();
		r.volumeUp(100);
		r.volumeDown(100);
		r.search("naver");
		
		Searchable s = new Searchable() {
			@Override
			public void search(String url) {
				System.out.println("Search¿Á¡§¿«");
			}
		};
		s.search("naver");
	}
}
