package javaBasic4.day01;

public class StaticEx05 {
	
    public static void main(String[] args) {
//		System.out.println("���� �޼ҵ� �κ���");
//		System.out.println( Car.a);
		Car car = new Car();
		System.out.println( car.ia ); 
		
	}
}

class Car{
	static int a;
	int ia;
	
	static {
	  System.out.println("�̰��� ���������-�̰��� ���� ������� ó���� �� �̰� ����");
	  System.out.println("�̰����� ����������� �ʱⰪ�� ���� �� �ַ� �����");
	  a=200;
	}
	
	{
		System.out.println("�̰��� �ν��Ͻ� �����");
		ia=1000;
	}
	
	public Car() {
		System.out.println("�̰��� �⺻������ �κ���");
		ia=2000;
	}
	
}