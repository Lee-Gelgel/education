package com.multi.day08;

public class Speaker implements Volume {
	private int VolLevel;

	public Speaker() {
		super();
		this.VolLevel=0;
	}

	@Override
	public void volumeUp(int VolLevel) {
		if (VolLevel >= 100) {
			this.VolLevel = 100;
			System.out.println(getClass().getSimpleName() + "���� �ø��ϴ�." + this.VolLevel);
		} else {
			System.out.println(getClass().getSimpleName() + "���� �ø��ϴ�." + this.VolLevel);
		}

	}

	@Override
	public void volumeDown(int VolLevel) {
		if (this.VolLevel-VolLevel <= 0) {
			this.VolLevel = 0;
			System.out.println(getClass().getSimpleName() + "���� �����ϴ�." + this.VolLevel);
		} else {
			System.out.println(getClass().getSimpleName() + "���� �����ϴ�." + this.VolLevel);
		}
	}

}
