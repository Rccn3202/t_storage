package javaHeight02.p641;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String> ();
        list1.add("ȫ�浿");
        list1.add("�̼���");
        list1.add("������");
        list1.add(1, "�ֿ�");
        
        for(int i=0; i<list1.size(); i++ ) {
        	  System.out.println(list1.get(i));
        }
    
        //�츮�ݿ� ȫ�浿�� �ֽ��ϱ�?
        System.out.println( list1.contains("ȫ�浿") );
        
        //������ �� �ֿ��� �����ϱ�
      //  list1.remove(1);
        list1.remove("�ֿ�");
        System.out.println("------------------");
        for(int i=0; i<list1.size(); i++ ) {
      	  System.out.println(list1.get(i));
      }
        
        list1.clear(); //��ü ����
        System.out.println("------------------");
        for(int i=0; i<list1.size(); i++ ) {
      	  System.out.println(list1.get(i));
        }
        
        System.out.println( list1.isEmpty() );
        
	}
	   }
