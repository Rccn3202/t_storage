package javaHeight05.ex11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImmutableEx11 {

	public static void main(String[] args) {
		 List<String> immutableList1 = List.of("A", "B", "C", "B"); //����ȵǴ� ����Ʈ �����
		 
		// immutableList1.add("D"); �߰��� �� ����
		// immutableList1.remove("B"); //������ �� ����
		 
		 System.out.println( immutableList1.size() );
		 for(String i : immutableList1 ) {
			 System.out.println( i );
		 }
		 
 
		 Set s = new HashSet();
		 s.add(null);
		 
		 Set<String> iS = Set.of("1", "2", "3");
		 System.out.println( iS.size() );
		 if( iS.contains("5")) {
			 System.out.println( "5�� �ֽ��ϴ�" );
		 }else {
			 System.out.println("�����ϴ�");
		 }
		 
		 Map<Integer, String> mapof = Map.of(1, "A", 2,"B", 3,"C");
		 //Ű�� ���ϱ�
		 Set<Integer> keys = mapof.keySet();
		 Iterator<Integer> k =keys.iterator();
		 while(k.hasNext()) {
			 Integer k1 = k.next();
			 System.out.println( k1 + " - " + mapof.get(k1));
		 }
		 
//		 mapof.put(4, "D"); �߰��� �� ����
		 
		 
		 Map<String, Integer> studentMap = new HashMap<String, Integer>();
		 studentMap.put("�̼���", 100);
		 studentMap.put("�̼���2", 50);
		 studentMap.put("�̼���3", 70);
		 studentMap.put("�̼���4", 80);
		 
		 studentMap.remove("�̼���");
		 
		 //���� �� - ���� �ȵǴ� ������ �����
		 Map<String, Integer> imMap2 = Map.copyOf(studentMap);
		 
		// imMap2.remove("�̼���");
		 
		// ��ü�� ����ϱ�
		 Set<Entry<String, Integer>> imSet2 = imMap2.entrySet();
		 for(Entry<String, Integer> i : imSet2) {
			 System.out.println( i.getKey() + " " + i.getValue() );
		 }

	}

}
