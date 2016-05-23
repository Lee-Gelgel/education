package com.multi.day08;

public class Refre implements Volume, Searchable{

	@Override
	public void search(String url) {
		System.err.println(getClass().getSimpleName()+"search함수");
	}

	@Override
	public void volumeUp(int VolLevel) {
		System.err.println(getClass().getSimpleName()+"volumeUp함수");
	}

	@Override
	public void volumeDown(int VolLevel) {
		System.err.println(getClass().getSimpleName()+"volumeDown함수");
	}
	
}
