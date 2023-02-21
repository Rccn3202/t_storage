package javaHeight05.ex11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImmutableEx11 {

	public static void main(String[] args) {
		 List<String> immutableList1 = List.of("A", "B", "C", "B"); //변경안되는 리스트 만들기
		 
		// immutableList1.add("D"); 추가할 수 없음
		// immutableList1.remove("B"); //삭제할 수 없음
		 
		 System.out.println( immutableList1.size() );
		 for(String i : immutableList1 ) {
			 System.out.println( i );
		 }
		 
 
		 Set s = new HashSet();
		 s.add(null);
		 
		 Set<String> iS = Set.of("1", "2", "3");
		 System.out.println( iS.size() );
		 if( iS.contains("5")) {
			 System.out.println( "5가 있습니다" );
		 }else {
			 System.out.println("없습니다");
		 }
		 
		 Map<Integer, String> mapof = Map.of(1, "A", 2,"B", 3,"C");
		 //키만 구하기
		 Set<Integer> keys = mapof.keySet();
		 Iterator<Integer> k =keys.iterator();
		 while(k.hasNext()) {
			 Integer k1 = k.next();
			 System.out.println( k1 + " - " + mapof.get(k1));
		 }
		 
//		 mapof.put(4, "D"); 추가할 수 없음
		 
		 
		 Map<String, Integer> studentMap = new HashMap<String, Integer>();
		 studentMap.put("이순신", 100);
		 studentMap.put("이순신2", 50);
		 studentMap.put("이순신3", 70);
		 studentMap.put("이순신4", 80);
		 
		 studentMap.remove("이순신");
		 
		 //고정 맵 - 변경 안되는 맵으로 만들기
		 Map<String, Integer> imMap2 = Map.copyOf(studentMap);
		 
		// imMap2.remove("이순신");
		 
		// 전체를 출력하기
		 Set<Entry<String, Integer>> imSet2 = imMap2.entrySet();
		 for(Entry<String, Integer> i : imSet2) {
			 System.out.println( i.getKey() + " " + i.getValue() );
		 }

	}

}
