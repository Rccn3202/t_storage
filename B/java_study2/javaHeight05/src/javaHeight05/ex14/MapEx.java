package javaHeight05.ex14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// Ȯ�ι��� 9

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name= null;
		int maxScore=0;
		int totalScore=0;
		//������� ??, �ְ����� 96 , �ְ������� ���� ���̵� "blue"
		
		Set<Entry<String, Integer>> es = map.entrySet();
		for(Entry<String, Integer> e  : es) {
			totalScore += e.getValue();
			if( maxScore < e.getValue() ) {
				maxScore = e.getValue();
				name = e.getKey();
			}
	    }
	    System.out.println( "������� : " + ( totalScore / map.size() ) );	
	    System.out.println( "�ְ����� : " + maxScore);
	    System.out.println( "�ְ������� ���� ���̵� : " + name );
	}
}
