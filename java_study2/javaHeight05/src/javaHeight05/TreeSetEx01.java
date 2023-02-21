package javaHeight05;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		
		ts1.add(4);
		ts1.add(7);
		ts1.add(4);
		ts1.add(0);
		ts1.add(8);
		ts1.add(9);
		ts1.add(2);
		

		System.out.println("트리의 노드 갯수=>" + ts1.size() );
		
		System.out.println("제일 낮은(작은) 객체 =>" + ts1.first());
		System.out.println("제일 높은(큰) 객체 =>" + ts1.last());
		System.out.println("7의 바로 아래 작은 객체는 =>" + ts1.lower(7));
		System.out.println("2보다 바로 위의 객체는 =>" + ts1.higher(2));	
		//교재 665페이지 메소드 설명을 보고 프로그램을 작성해 보세요
		System.out.println("5와 동등한 객체가 있으면 리턴 만약 없다면 주어진 객체의 바로 아래 객체리턴 =>" + ts1.floor(5));
		System.out.println("6와 동등한 객체가 있으면 리턴 만약 없다면 주어진 객체의 바로 위 객체리턴 =>" + ts1.ceiling(6));
		System.out.println("제일 낮은 객체를 꺼내오고 컬렉션에서 제거함 =>" + ts1.pollFirst());
		System.out.println("제일 낮은(작은) 객체 =>" + ts1.first()); //위에 프로그램에서 0을 제거 했기 때문에 2가 출력됨
		System.out.println("제일 높은 객체를 꺼내오고 컬렉션에서 제거함 =>" + ts1.pollLast());
		System.out.println("제일 높은(큰) 객체 =>" + ts1.last());
		
		System.out.println("트리의 노드 갯수=>" + ts1.size() );
		
		//모든 노드를 다 출력하기
		Iterator<Integer> it =ts1.iterator();
		while(it.hasNext()) {
			System.out.println( it.next() );
		}
		System.out.println( " 전체를 출력하기 ");
		for( Integer i : ts1) {
			System.out.println( i );
		}
		System.out.println("==== 내림 차순으로 정렬된 ====");
		//내림차순으로 정렬된 Iterator를 리턴
		Iterator<Integer> dit = ts1.descendingIterator();
		while( dit.hasNext() ) {
			System.out.println( dit.next() );
		}
		System.out.println("==== NavigableSet으로 정렬된 ====");
		NavigableSet<Integer> ns = ts1.descendingSet();
		for(Integer n : ns) {
			System.out.println( n );
		}
		System.out.println("==== 8보다 적은 노드들 전부 출력  ====");
		SortedSet<Integer> ss=ts1.headSet(8, false);
		for(Integer s : ss) {
			System.out.println( s );
		}
		System.out.println("==== 4보다 큰 노드들 전부 출력  ====");
		SortedSet<Integer> ss2=ts1.tailSet(4, false);
		for(Integer s : ss2) {
			System.out.println( s );
		}
		
		System.out.println("==== 4보다 크거나 같고 7보다 작거 같은 노드들 전부 출력  ====");
		SortedSet<Integer> ss3=ts1.subSet(4, true, 7, true);
		for(Integer s : ss3) {
			System.out.println( s );
		}
		
	}

}
