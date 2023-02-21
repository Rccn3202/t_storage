package javaHeight02.p645;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx05 {

	public static void main(String[] args) {
		    List<Student> vlist=new Vector<Student>(); //스레드 프로그램에서 이용되는 ArrayList와 동일한 컬렉션
		    
		    vlist.add( new Student("홍길동1",100));
		    vlist.add( new Student("홍길동2",80));
		    vlist.add( new Student("홍길동3",90));
		    vlist.add( new Student("홍길동4",100));
		    
		    Iterator<Student> it = vlist.iterator();//반복자 
		    
		    while( it.hasNext() ) {
		    	Student st = it.next();
		    	System.out.println( st );
		    }
		    
		    // 2번 인덱스로 삭제하기
		    vlist.remove(2);
		    
		   it = vlist.iterator();//반복자 
		    System.out.println( " 2번 인덱스로 삭제하기 ");
		    while( it.hasNext() ) {
		    	Student st = it.next();
		    	System.out.println( st );
		    }
		    
		    boolean isE = vlist.isEmpty();
		    if(isE) {
		    	System.out.println("아무것도 없습니다");
		    }else {
		    	System.out.println( "있습니다");
		    }
		    
              
	}

}
