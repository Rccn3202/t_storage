package javaHeight02.p644;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ������Ȳ����Ŭ���� {

	public static void main(String[] args) {
		 List<������ȲŬ����> list1 =new ArrayList<������ȲŬ����>();

		 list1.add(new ������ȲŬ����("4��3��", "BC103", "������", 230, 276000, "3470-1234"));
		 list1.add(new ������ȲŬ����("4��5��", "BL203", "���ʱ�", 150, 180000, "3470-2200"));
		 list1.add(new ������ȲŬ����("4��8��", "AC205", "���ı�", 270, 324000, "3470-3300"));
		 list1.add(new ������ȲŬ����("4��12��", "DU103", "��걸", 350, 420000, "3470-4321"));
		 
		 for(int i=0;i<list1.size(); i++) {
			 System.out.println( list1.get(i));
		 }
		 
		 Scanner sc =new Scanner(System.in);
		 System.out.print("�ŷ�ó�ڵ��? ");
		 String searchCode = sc.next();
		 boolean searchCodeOk=false;
		 
		 for(int i=0; i<list1.size(); i++) {
			 if( list1.get(i).get�ŷ�ó�ڵ�().equals(searchCode)) {
				 System.out.println("���� ������ " + list1.get(i).get��������() );
				 System.out.println("����ó�� " + list1.get(i).get����ó() );
				 searchCodeOk = true;
			 }
		 }
		 if( !searchCodeOk ) System.out.println( searchCode + " �ŷ�ó �ڵ�� ���� �ڵ��Դϴ�. "); 
		 
		 //4. ������� ���� ���� �ŷ�ó �ڵ带 ���
		 System.out.println( "=== ������� ���� ���� �ŷ�ó �ڵ� === ");
		 
		 int max = 0; //������� ���� ���� �ݾ��� ���� ����
		 int maxIndex = 0; //����� ���� ���� �ŷ�ó �ε����� ���� ���� 
		 for( int i=0; i< list1.size() ; i++) {
			 if( max < list1.get(i).get����ݾ�() ) {
				 max = list1.get(i).get����ݾ�();
				 maxIndex = i;
			 }
		 }
		 System.out.println( "����� ���� ���� �ŷ�ó�ڵ�� " + list1.get( maxIndex ).get�ŷ�ó�ڵ�() );
		 System.out.println( "����� ���� ���� ������� " + list1.get( maxIndex ).get����ݾ�() );
		 
		 System.out.println( "=== �Ǹŷ��� ���� ���� ��������, �ŷ�ó�ڵ�, �Ǹŷ� === ");
		 int min=999999999;
		 int minIndex=0;
		 for(int i=0; i<list1.size(); i++) {
			 if( min > list1.get(i).get�Ǹŷ�() ) {
				 min = list1.get(i).get�Ǹŷ�();
				 minIndex = i;
			 }
		 }

		 System.out.println( "�Ǹŷ��� ���� ���� �������� " + list1.get(minIndex).get��������() );
		 System.out.println( "�Ǹŷ��� ���� ���� �ŷ�ó�ڵ� " + list1.get(minIndex).get�ŷ�ó�ڵ�() );
		 System.out.println( "�Ǹŷ��� ���� ���� �Ǹŷ� " + list1.get(minIndex).get�Ǹŷ�() );
		 
	}

}
