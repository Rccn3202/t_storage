package javaHeight05.ex13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// �������� 8
       Set<Student> set = new HashSet<Student>();
       
       set.add(new Student(1,"ȫ�浿"));
       set.add(new Student(2,"�ſ��"));
       set.add(new Student(1,"���ο�"));
       System.out.println("����� ��ü�� : " + set.size());
       for( Student s : set) {
    	 System.out.println( s.getStudentNum() + " : " + s.getName());
       }
       
	}

}
