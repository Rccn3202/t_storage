package javaHeight05.ex14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// 확인문제 9

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name= null;
		int maxScore=0;
		int totalScore=0;
		//평균점수 ??, 최고점수 96 , 최고점수를 받은 아이디 "blue"
		
		Set<Entry<String, Integer>> es = map.entrySet();
		for(Entry<String, Integer> e  : es) {
			totalScore += e.getValue();
			if( maxScore < e.getValue() ) {
				maxScore = e.getValue();
				name = e.getKey();
			}
	    }
	    System.out.println( "평균점수 : " + ( totalScore / map.size() ) );	
	    System.out.println( "최고점수 : " + maxScore);
	    System.out.println( "최고점수를 받은 아이디 : " + name );
	}
}
