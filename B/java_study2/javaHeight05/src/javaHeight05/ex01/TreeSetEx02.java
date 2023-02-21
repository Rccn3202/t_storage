package javaHeight05.ex01;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx02 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(3500000);
		ts.add(2150000);
		ts.add(2200000);
		ts.add(2700000);
		ts.add(2750000);

		//가장 높은 기본급은?
		System.out.println( ts.last() );
		//가장 낮은 기본급은?
		System.out.println( ts.first() );
		//기본급 오름차순?
		System.out.println( );
		for(Integer s : ts) {
			System.out.print( s + " ");
		}
		//기본급 내림차순?
		System.out.println();
		Iterator<Integer> it = ts.descendingIterator();
		while(it.hasNext()) {
			System.out.print(  it.next()  + "  ");
		}
		//2500000~3500000사이의 기본급을 모두 출력하세요
		System.out.println();
		NavigableSet<Integer> ns = ts.subSet(2500000, true, 3500000, true);
		for(Integer n : ns) {
			System.out.print( n + " ");
		}
	}

}







