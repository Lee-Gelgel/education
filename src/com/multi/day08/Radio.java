package com.multi.day08;

public class Radio implements Volume {
	private int VolLevel;

	public Radio() {
		super();
		this.VolLevel = 0;
	}

	@Override
	public void volumeUp(int VolLevel) {
		this.VolLevel += VolLevel;
		System.out.println(getClass().getSimpleName() + "���� �ø��ϴ�." + this.VolLevel);
	}

	@Override
	public void volumeDown(int VolLevel) {
		this.VolLevel -= VolLevel;
		System.out.println(getClass().getSimpleName() + "���� �����ϴ�." + this.VolLevel);

	}

}
