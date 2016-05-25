package com.multi.day10;

public class Counter {
	int no;

	public Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+" ¹ø °´Ã¼ÀÇ finalize()°¡ ½ÇÇàµÊ");
	}
	
}
