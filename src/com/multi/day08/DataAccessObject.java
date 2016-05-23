package com.multi.day08;

public interface DataAccessObject {

//	void select();
//	 void insert();
//	 void update();
//	 void delete();

	public default void select() {
		System.out.println(this.getClass().getSimpleName() + "에서 검색");
	};

	public default void insert() {
		System.out.println(this.getClass().getSimpleName() + "에 삽입");
	};

	public default void update() {
		System.out.println(this.getClass().getSimpleName() + "를 수정");
	};

	public default void delete() {
		System.out.println(this.getClass().getSimpleName() + "에서 삭제");
	};

}
