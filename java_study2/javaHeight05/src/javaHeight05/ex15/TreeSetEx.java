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
		System.out.println("�ְ����� : " + student.getScore());
		System.out.println("�ְ� ������ ���� ���̵� : " + student.getId());

        TreeSet<Student2> treeSet2 = new TreeSet<Student2>(  new Student2Comparator() );
		
		treeSet2.add(new Student2("blue", 96));
		treeSet2.add(new Student2("hong", 86));
		treeSet2.add(new Student2("white", 92));

		Student2 student2 = treeSet2.first();
		System.out.println("�������� : " + student2.getScore());
		System.out.println("���� ������ ���� ���̵� : " + student2.getId());
		
		int[] a = new int[5];
		a[0]=10;
		
		Integer[] a2 = {1,2,3};
		
		// a2�迭�� ����Ʈ �־���
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
		
		//���ڿ� �迭 5�� �̸� �־��
		//1�ܰ� �迭�� ����� ���� �ִ´� 2�ܰ� ArrayList����� 3�ܰ� ArrayList�ȿ� �迭�� ���� ��� add�Ѵ�
		List<String> nameList = Arrays.asList( "ȫ�浿", "������", "�̸��", "������", "�̼���");
		
		//�츮�ݿ� ���� �־��? �����
		if(nameList.contains("����")) {
			System.out.println("�־��");
		}else {
			System.out.println("�����");
		}
		//�츮�� ����ΰ���?
		
	}
}
