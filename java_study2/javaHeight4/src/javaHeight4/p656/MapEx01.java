package javaHeight4.p656;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		   Map<String, Integer> map1=new HashMap<String, Integer>();
		   map1.put("컴퓨터", 200);
		   map1.put("프린터", 50);
		   map1.put("아이폰", 210);
		   map1.put("갤럭시탭", 170);
		   
		   System.out.println( map1.get("컴퓨터") );
		   System.out.println( map1.get("아이폰"));
		   
		   // 매장에 냉장고가 있나요?
		   if( map1.containsKey("프린터") ) System.out.println("있습니다");
		   else System.out.println("없습니다.");
		   
		   // 금액이 150만원 이상인 것의 품목을 출력하기 컴퓨터, 아이폰, 갤럭시탭
		   // 모든 키를 집어 넣어서 금액을 구한후 조건문으로 비교한다.
		   // 조건에 만족하면 키값을 찍는다.
		   // 풀이 - 모든 키를 구하는 것은? 
		   Set<String> keys = map1.keySet();
		   //키를 구해서 출력 해봄
		   Iterator<String> it = keys.iterator();
		   while( it.hasNext() ) {
			   System.out.println( it.next() );
		   }
		   //키를 넣어서 금액을 구한다.
		   it = keys.iterator();
		   while( it.hasNext() ) {
			  Integer value =  map1.get(  it.next() );
			  System.out.println("값은?  " + value);
		   }
		   
		   //금액이 150만원 이상인지 판단
		   it = keys.iterator();
		   while( it.hasNext() ) {
			   String key = it.next();
			   if( map1.get( key ) >= 150 ) {
				   System.out.println( key  + " - " + map1.get(key));
			   }
		   }
		   
		   
		   //금액이 170만원짜기 품목이 있습니까? 결과 예 있습니다.
		   System.out.println( map1.containsValue(170) );
		   
	}

}
