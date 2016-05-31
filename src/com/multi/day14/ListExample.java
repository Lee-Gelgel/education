package com.multi.day14;

import java.util.ArrayList;
import java.util.List;

class Board{
	private String title;
	private String content;
	public Board(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
}

class BoardDao{
	List<Board >getBoardList(){
		List<Board> list = new ArrayList<>();
		list.add(new Board("����1", "����1"));
		list.add(new Board("����2", "����2"));
		list.add(new Board("����3", "����3"));
		return list;
		
	}
}

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board:list){
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
	}
}
