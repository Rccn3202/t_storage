package javaHeight01.p640;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList arrayList = new ArrayList();
        
        List list1 = new ArrayList();
        
		int[] n1 = new int[3];
		//���ڸ� 3���� �־��µ� ���� 2�� �� �־� �־�� ��
		// ��� 5�� �迭�� ���� ����� �Ű� �־�� �Ѵ�.
		//�迭�� ������ �߰��ϰų� �߰��� ���� �׷��� ����·� ������ �޸� ȿ�� ��������.
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("a");
		list1.add(10);
		
		System.out.println( list1.get(3) );
		System.out.println( "��� �ִ� ������" + list1.size() );
		//"k"��� �ڷ� �ֳ���? �����ϴ�.
		if( list1.contains("k") ) System.out.println( "�ֽ��ϴ�");
		else System.out.println("�����ϴ�");
	}
}
