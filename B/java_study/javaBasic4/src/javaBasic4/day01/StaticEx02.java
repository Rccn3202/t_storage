package javaBasic4.day01;

public class StaticEx02 {
    // A static B in stat
	//���α׷� �����ֱ�(Life Cycle)  ����-Ȱ��-�Ҹ� 
	//
	static int a=100; //�������� static �پ� �ִ� ���� ���α׷� ������ �� �����ǰ� ���α׷��� ����Ǹ� �����
	static double b=3.14; // �� ��� �޸𸮿� ���� ���� 
	static String name="ȫ�浿";
	
	int c=200; //�ν��Ͻ� ���� �������� new�ϸ� ������ �ش� Ŭ������ ���̻� ���� ������ �ش� Ŭ������ ����� 
	double d=5.5;
	String addr="�ϳ���";
	
	public static void main(String[] args) {
		System.out.println(a + "  " + b + " " + name);
		StaticEx02 se02  = new StaticEx02();
		System.out.println(se02.c + "  " + se02.d + " " + se02.addr); //�޸� �÷����� ���� �ʵ�ϱ�
	}

}
