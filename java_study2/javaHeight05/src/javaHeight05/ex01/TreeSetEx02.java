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

		//���� ���� �⺻����?
		System.out.println( ts.last() );
		//���� ���� �⺻����?
		System.out.println( ts.first() );
		//�⺻�� ��������?
		System.out.println( );
		for(Integer s : ts) {
			System.out.print( s + " ");
		}
		//�⺻�� ��������?
		System.out.println();
		Iterator<Integer> it = ts.descendingIterator();
		while(it.hasNext()) {
			System.out.print(  it.next()  + "  ");
		}
		//2500000~3500000������ �⺻���� ��� ����ϼ���
		System.out.println();
		NavigableSet<Integer> ns = ts.subSet(2500000, true, 3500000, true);
		for(Integer n : ns) {
			System.out.print( n + " ");
		}
	}

}







