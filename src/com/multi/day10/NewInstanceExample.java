package com.multi.day10;

interface Action {
	void execute();
}

class SendAction implements Action {
	@Override
	public void execute() {
		System.out.println("�����͸� �����ϴ�.");
	}
}

class ReceiveAction implements Action {

	public void execute() {
		System.out.println("�����͸� �޽��ϴ�.");
	}
}

public class NewInstanceExample {
	public static void excute(String aa) {
		try {
			Class<?> clazz = Class.forName(aa);
			// Class clazz = Class.forName(aa);
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		//"com.multi.day10.SendAction"
		//"com.multi.day10.ReceiveAction"
		excute("com.multi.day10.SendAction");
		excute("com.multi.day10.ReceiveAction");
	}
}
