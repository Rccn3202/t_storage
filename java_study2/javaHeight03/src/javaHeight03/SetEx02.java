package javaHeight03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // "사과", "배", "바나나", "귤", "배","배"
		//1. Set 데이터 넣기
		Set<String> set2 = new HashSet<String>();
		set2.add("사과");
		set2.add("배");
		set2.add("바나나");
		set2.add("귤");
		set2.add("배");
		set2.add("배");
		set2.add("바나나");
		set2.add("바나나");
		set2.add("바나나");
		set2.add("바나나");
		set2.add("바나나");
		
		//2. 전체 출력하기
		Iterator<String> it = set2.iterator();
		while( it.hasNext() ) {
			String fruit = it.next();
			System.out.println(fruit);
		}
		
		//3. 크기 출력하기
		System.out.println( "과일이 "+ set2.size() + "종류 있습니다" );
		
		//4. "참외"가 있는지 검색하기
		if( set2.contains("참외") ) System.out.println( "참외 있습니다");
		else System.out.println("참외는 없습니다.");
	}

}
