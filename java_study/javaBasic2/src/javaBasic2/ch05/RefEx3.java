package javaBasic2.ch05;

public class RefEx3 {
	public static void main(String[] args) {
	  Student1 s1 = new Student1();
	  s1.stName="ȫ�浿";
	  s1.age = 20;
	  s1.m1();
	  System.out.println("�̰��� main()" + s1.stName);
	  s1.m2();
	  
	  Person1 person1 = new Person1();
	  person1.address = "�ϳ���";
	  person1.point = 301.3;
	  person1.getAddress();
	  person1.getPoint();
	  person1.getAll();
	  
	  //�޼ҵ带 �̿��ؼ� ���� �����ϱ�
	  person1.setAddress("�ϳ���");
	  person1.setPoint(301.3);
	  person1.setAll("������", 40.2);
	  person1.setEx(5,true, "ȫ�浿", 5.8);
	}
}
class Person1{
	//����ʵ�
	String address;
	double point;
    //��� �޼ҵ� 
	void setAddress( String address ) {
		this.address = address;
		System.out.println("�̰��� Person1Ŭ������ �޼ҵ��� " + address);
	}
	void setPoint( double  point ) {
		this.point = point;
		System.out.println(point);
	}
	void setAll( String address, double point  ) {
		this.address = address; //this �ڽ� Ŭ������ ����ʵ带 ����Ŵ 
		this.point = point;
		System.out.println(address + " " + point);
	}
	void setEx(double e, boolean f, String g, double h ) {
		
	}
	
	void getAddress() {
		System.out.println(address);
	}
	void getPoint() {
		System.out.println(point);
	}
	void getAll() {
		System.out.println(address + " " + point);
	}
}
class Teacher1{
	String dept;
	boolean gender;
}
class Student1{
	String stName;
	int age;
	//�޼��� �����ϱ� �����ϱ�
	//�޼��� ���� 
	// ����Ÿ�� �޼����( �޼��尡 ȣ��ɶ� �־��ִ� ���� ) {  ó���� ����� }
	void m1() {
		System.out.println("�̰��� StudentŬ������ m1�޼ҵ��Դϴ�");
	}
	void m2() {
		System.out.println( age + "  " + stName + " �̰��� StudentŬ�����Դϴ�");
	}
}

