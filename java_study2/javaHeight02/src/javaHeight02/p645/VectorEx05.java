package javaHeight02.p645;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx05 {

	public static void main(String[] args) {
		    List<Student> vlist=new Vector<Student>(); //������ ���α׷����� �̿�Ǵ� ArrayList�� ������ �÷���
		    
		    vlist.add( new Student("ȫ�浿1",100));
		    vlist.add( new Student("ȫ�浿2",80));
		    vlist.add( new Student("ȫ�浿3",90));
		    vlist.add( new Student("ȫ�浿4",100));
		    
		    Iterator<Student> it = vlist.iterator();//�ݺ��� 
		    
		    while( it.hasNext() ) {
		    	Student st = it.next();
		    	System.out.println( st );
		    }
		    
		    // 2�� �ε����� �����ϱ�
		    vlist.remove(2);
		    
		   it = vlist.iterator();//�ݺ��� 
		    System.out.println( " 2�� �ε����� �����ϱ� ");
		    while( it.hasNext() ) {
		    	Student st = it.next();
		    	System.out.println( st );
		    }
		    
		    boolean isE = vlist.isEmpty();
		    if(isE) {
		    	System.out.println("�ƹ��͵� �����ϴ�");
		    }else {
		    	System.out.println( "�ֽ��ϴ�");
		    }
		    
              
	}

}
