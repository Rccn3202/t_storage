package javaHeight4.p660;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx03 {

	public static void main(String[] args) {

		
		  Map<String, Data2> teacherMap = new Hashtable<String, Data2>();
          
		  School school1 = new School("정현희", new Data2("3-1", 30));
		  School school2 = new School("홍길동", new Data2("2-2", 27));
		  School school3 = new School("이순신", new Data2("1-1", 25));
		  
		  teacherMap.put(  school1.getTeacherName()  ,  school1.getData2() );
		  teacherMap.put(  school2.getTeacherName()  ,  school2.getData2() );
		  teacherMap.put(  school3.getTeacherName()  ,  school3.getData2() );
		  
		  //선생님 이름만 찍어 주세요
		  // 풀이 선생님이름은 키값이므로 키값을 추출하면 된다
		  Set<String> keys = teacherMap.keySet();
		  
		  Iterator<String> it=keys.iterator();
		  while( it.hasNext() ) {
			  System.out.println( it.next() );
		  }
		  
		  //학교 선생님 인원수는?
		  System.out.println( teacherMap.size() );
		  
		  //선생님 별로 학급 인원 출력하기
		  it = keys.iterator();
		  while( it.hasNext() ) {
			  String addr = it.next();
			  Data2 mapValue = teacherMap.get(  addr ); //
			  System.out.println( "선생님 이름 : " + addr);
			  System.out.println( " 학년 반 : " + mapValue.getGradeBan() );
			  System.out.println( " 학급인원수 : " + mapValue.getCnt() );
		  }
	}

}
