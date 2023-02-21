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
		

		System.out.println("Ʈ���� ��� ����=>" + ts1.size() );
		
		System.out.println("���� ����(����) ��ü =>" + ts1.first());
		System.out.println("���� ����(ū) ��ü =>" + ts1.last());
		System.out.println("7�� �ٷ� �Ʒ� ���� ��ü�� =>" + ts1.lower(7));
		System.out.println("2���� �ٷ� ���� ��ü�� =>" + ts1.higher(2));	
		//���� 665������ �޼ҵ� ������ ���� ���α׷��� �ۼ��� ������
		System.out.println("5�� ������ ��ü�� ������ ���� ���� ���ٸ� �־��� ��ü�� �ٷ� �Ʒ� ��ü���� =>" + ts1.floor(5));
		System.out.println("6�� ������ ��ü�� ������ ���� ���� ���ٸ� �־��� ��ü�� �ٷ� �� ��ü���� =>" + ts1.ceiling(6));
		System.out.println("���� ���� ��ü�� �������� �÷��ǿ��� ������ =>" + ts1.pollFirst());
		System.out.println("���� ����(����) ��ü =>" + ts1.first()); //���� ���α׷����� 0�� ���� �߱� ������ 2�� ��µ�
		System.out.println("���� ���� ��ü�� �������� �÷��ǿ��� ������ =>" + ts1.pollLast());
		System.out.println("���� ����(ū) ��ü =>" + ts1.last());
		
		System.out.println("Ʈ���� ��� ����=>" + ts1.size() );
		
		//��� ��带 �� ����ϱ�
		Iterator<Integer> it =ts1.iterator();
		while(it.hasNext()) {
			System.out.println( it.next() );
		}
		System.out.println( " ��ü�� ����ϱ� ");
		for( Integer i : ts1) {
			System.out.println( i );
		}
		System.out.println("==== ���� �������� ���ĵ� ====");
		//������������ ���ĵ� Iterator�� ����
		Iterator<Integer> dit = ts1.descendingIterator();
		while( dit.hasNext() ) {
			System.out.println( dit.next() );
		}
		System.out.println("==== NavigableSet���� ���ĵ� ====");
		NavigableSet<Integer> ns = ts1.descendingSet();
		for(Integer n : ns) {
			System.out.println( n );
		}
		System.out.println("==== 8���� ���� ���� ���� ���  ====");
		SortedSet<Integer> ss=ts1.headSet(8, false);
		for(Integer s : ss) {
			System.out.println( s );
		}
		System.out.println("==== 4���� ū ���� ���� ���  ====");
		SortedSet<Integer> ss2=ts1.tailSet(4, false);
		for(Integer s : ss2) {
			System.out.println( s );
		}
		
		System.out.println("==== 4���� ũ�ų� ���� 7���� �۰� ���� ���� ���� ���  ====");
		SortedSet<Integer> ss3=ts1.subSet(4, true, 7, true);
		for(Integer s : ss3) {
			System.out.println( s );
		}
		
	}

}