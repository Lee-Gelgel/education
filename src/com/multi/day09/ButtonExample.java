package com.multi.day09;

class Button {
	interface OnClickListener {
		void onClick();
	}

	OnClickListener listner;

	void setOnClickListener(OnClickListener listner) {
		this.listner = listner;
	}

	void touch() {
		listner.onClick();
	}
}

class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�");
	}

}

class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("�޽����� �����ϴ�");
	}

}

public class ButtonExample {
	public static void main(String[] args) {
		Button btn1 = new Button();
		btn1.setOnClickListener(new CallListener());
		btn1.touch();
		Button btn2 = new Button();
		btn2.setOnClickListener(new MessageListener());
		btn2.touch();
	}
}
