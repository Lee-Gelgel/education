package com.multi.day08;

public class TV implements Volume{

	private int VolLevel;
	
	
	
	public TV() {
		super();
		this.VolLevel=0;
	}

	@Override
	public void volumeUp(int VolLevel) {
		this.VolLevel += VolLevel;
		System.out.println(getClass().getSimpleName() + "���� �ø��ϴ�." + this.VolLevel);
	}

	@Override
	public void volumeDown(int VolLevel) {
		if (this.VolLevel-VolLevel <= 0) {
			this.VolLevel = 0;
			System.out.println(getClass().getSimpleName() + "���� �����ϴ�." + this.VolLevel);
		} else {
			this.VolLevel -= VolLevel;
			System.out.println(getClass().getSimpleName() + "���� �����ϴ�." + this.VolLevel);
			
		}
	}
	
}
