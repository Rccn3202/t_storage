package javaHeight05.ex15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));

		Student student = treeSet.last();
		System.out.println("최고점수 : " + student.getScore());
		System.out.println("최고 점수를 받은 아이디 : " + student.getId());

        TreeSet<Student2> treeSet2 = new TreeSet<Student2>(  new Student2Comparator() );
		
		treeSet2.add(new Student2("blue", 96));
		treeSet2.add(new Student2("hong", 86));
		treeSet2.add(new Student2("white", 92));

		Student2 student2 = treeSet2.first();
		System.out.println("최저점수 : " + student2.getScore());
		System.out.println("최저 점수를 받은 아이디 : " + student2.getId());
		
		int[] a = new int[5];
		a[0]=10;
		
		Integer[] a2 = {1,2,3};
		
		// a2배열을 리스트 넣어줘
		List<Integer> list = new ArrayList<Integer>();
		list.add( a2[0]);
		list.add( a2[1]);
		list.add( a2[2]);
		
		System.out.println( list.get(0) );
		System.out.println( list.get(1) );
		System.out.println( list.get(2) );
		
		List list2 =Arrays.asList( 10,20,30,40 );
		System.out.println( list2.get(0) );
		System.out.println( list2.get(1) );
		System.out.println( list2.get(2) );
		System.out.println( list2.get(3) );
		
		//문자열 배열 5개 이름 넣어기
		//1단계 배열을 만들고 값을 넣는다 2단계 ArrayList만든다 3단계 ArrayList안에 배열의 값을 모두 add한다
		List<String> nameList = Arrays.asList( "홍길동", "정현희", "이명수", "최진영", "이순신");
		
		//우리반에 김경미 있어요? 없어요
		if(nameList.contains("김경미")) {
			System.out.println("있어요");
		}else {
			System.out.println("없어요");
		}
		//우리반 몇명인가요?
		
	}
}
