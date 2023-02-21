package javaHeight4.p656;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		   Map<String, Integer> map1=new HashMap<String, Integer>();
		   map1.put("��ǻ��", 200);
		   map1.put("������", 50);
		   map1.put("������", 210);
		   map1.put("��������", 170);
		   
		   System.out.println( map1.get("��ǻ��") );
		   System.out.println( map1.get("������"));
		   
		   // ���忡 ������� �ֳ���?
		   if( map1.containsKey("������") ) System.out.println("�ֽ��ϴ�");
		   else System.out.println("�����ϴ�.");
		   
		   // �ݾ��� 150���� �̻��� ���� ǰ���� ����ϱ� ��ǻ��, ������, ��������
		   // ��� Ű�� ���� �־ �ݾ��� ������ ���ǹ����� ���Ѵ�.
		   // ���ǿ� �����ϸ� Ű���� ��´�.
		   // Ǯ�� - ��� Ű�� ���ϴ� ����? 
		   Set<String> keys = map1.keySet();
		   //Ű�� ���ؼ� ��� �غ�
		   Iterator<String> it = keys.iterator();
		   while( it.hasNext() ) {
			   System.out.println( it.next() );
		   }
		   //Ű�� �־ �ݾ��� ���Ѵ�.
		   it = keys.iterator();
		   while( it.hasNext() ) {
			  Integer value =  map1.get(  it.next() );
			  System.out.println("����?  " + value);
		   }
		   
		   //�ݾ��� 150���� �̻����� �Ǵ�
		   it = keys.iterator();
		   while( it.hasNext() ) {
			   String key = it.next();
			   if( map1.get( key ) >= 150 ) {
				   System.out.println( key  + " - " + map1.get(key));
			   }
		   }
		   
		   
		   //�ݾ��� 170����¥�� ǰ���� �ֽ��ϱ�? ��� �� �ֽ��ϴ�.
		   System.out.println( map1.containsValue(170) );
		   
	}

}