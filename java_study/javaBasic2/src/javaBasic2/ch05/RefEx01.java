package javaBasic2.ch05;

import java.util.Scanner;

public class RefEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=10;
         String name="ȫ�浿";//name������ ȫ�浿�� ��� �ִ� ���޸� �ּҸ� ������ �ִ�
         Scanner sc = new Scanner(System.in);
         Student st = new Student();
        // �ڷ���   ������ = new Ŭ������() new �ش�Ŭ������ ���޸𸮿� �÷���
         Person p = new Person(); 
         Teacher t =new Teacher();
         st.stName = "ȫ�浿";
         //���޸𸮿� �ִ� �������� ���� ��� �־� ������
         st.age = 20;
         p.address = "��⵵ �ϳ���";
         p.point = 10.25;
         t.dept="��ǻ�Ͱ��а�";
         t.gender=false;
         //�׸��� ����غ�����.
         System.out.println(st.stName);
	}
}
class Student{
	String stName;
	int age;
	//�޼��� �����ϱ� �����ϱ�
	//�޼��� ���� 
	// ����Ÿ�� �޼����( �޼��尡 ȣ��ɶ� �־��ִ� ���� ) {  ó���� ����� }
	void m1() {
		System.out.println("�̰��� StudentŬ������ m1�޼ҵ��Դϴ�");
	}
	
}

class Person{
	String address;
	double point;
}
class Teacher{
	String dept;
	boolean gender;
}


