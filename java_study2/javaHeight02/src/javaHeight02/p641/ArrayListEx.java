package javaHeight02.p641;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String> ();
        list1.add("홍길동");
        list1.add("이순신");
        list1.add("김유신");
        list1.add(1, "최영");
        
        for(int i=0; i<list1.size(); i++ ) {
        	  System.out.println(list1.get(i));
        }
    
        //우리반에 홍길동이 있습니까?
        System.out.println( list1.contains("홍길동") );
        
        //전학을 간 최영을 삭제하기
      //  list1.remove(1);
        list1.remove("최영");
        System.out.println("------------------");
        for(int i=0; i<list1.size(); i++ ) {
      	  System.out.println(list1.get(i));
      }
        
        list1.clear(); //전체 삭제
        System.out.println("------------------");
        for(int i=0; i<list1.size(); i++ ) {
      	  System.out.println(list1.get(i));
        }
        
        System.out.println( list1.isEmpty() );
        
	}
	   }
