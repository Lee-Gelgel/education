package com.multi.day08;

public interface DataAccessObject {

//	void select();
//	 void insert();
//	 void update();
//	 void delete();

	public default void select() {
		System.out.println(this.getClass().getSimpleName() + "���� �˻�");
	};

	public default void insert() {
		System.out.println(this.getClass().getSimpleName() + "�� ����");
	};

	public default void update() {
		System.out.println(this.getClass().getSimpleName() + "�� ����");
	};

	public default void delete() {
		System.out.println(this.getClass().getSimpleName() + "���� ����");
	};

}
