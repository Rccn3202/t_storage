package javaHeight05.ex12;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
   //List<Board> list = dao.getBoardList();  // Board �ڷḦ List�� �־��ְ� List�� �ּҸ� ��������
   //�������� 7�� Ǯ��
	List<Board> getBoardList(){
		List<Board> list1 = new ArrayList<Board>();
		list1.add(new Board("����1", "����1"));
		list1.add(new Board("����2", "����2"));
		list1.add(new Board("����3", "����2"));
		return list1;
	}
}