package javaHeight05.ex12;

import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();  // Board 자료를 List에 넣어주고 List의 주소를 리턴해줌  
		for(Board board : list) {
			System.out.println( board.getTitle() + "-" + board.getContent());
		}
	}
}
