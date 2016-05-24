package com.multi.day09;

public class Chatting {

	void start(String chatId) {
		String nickName = chatId;
		// nickName = chatId; // nickName : final이 생략된 상수 , 값 변경 불가
		Chat chat = new Chat() {
			@Override
			void start() {
				while (true) {
					String inputData = "Hello";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}

	class Chat {
		void start() {

		}

		void sendMessage(String message) {
			System.out.println(message);
		}
	}

	public static void main(String[] args) {
		// Chatting a = new Chatting();
		// a.start("123");
		new Chatting().start("gelgel");
	}
}
