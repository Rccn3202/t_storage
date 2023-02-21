package javaHeight02.p642;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {

	public static void main(String[] args) {

		  List<Integer> list2 = new ArrayList<Integer>();
		  
		  //1~10까지 자료를 넣어 주세요
      
          for(int i=1; i<=10 ; i++) {
        	  list2.add(i);
          }
          
          //5번 인덱스 위치에 값을 50으로 변경하기
          list2.set(5, 50);
          
          //전체를 출력하기
          for(int i=0; i<10 ; i++) {
        	System.out.println(list2.get(i));
          }
          
          
	}
}
