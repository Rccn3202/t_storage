package javaBasic4.day01;

public class StaticEx01 {

	public static void main(String[] args) {
		System.out.println("���� ���� �޼ҵ�� Ŭ�����δ� �ܰ迡�� �ٷ� �޼ҵ� ������ �ö�");
	
		StaticEx01 se = new StaticEx01();
		se.instanceMethod();
	}

	public void instanceMethod() {
		System.out.println("�ν��Ͻ� �޼ҵ� ��ü������ ����� �� ����");
	}
}
