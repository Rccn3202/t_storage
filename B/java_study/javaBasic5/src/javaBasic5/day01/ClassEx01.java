package javaBasic5.day01;

import dao.BookDao;

public class ClassEx01 {

	public static void main(String[] args) {
		Ex01.a(); //���� �޼ҵ� ȣ���� Ŭ������.�޼ҵ��()
		
		//�ν��Ͻ� �޼ҵ带 ȣ���ϴ� ���
        Ex01 ex01 = new Ex01(); //1. ��ü�����Ѵ�
        ex01.b(); //2. ����������.�޼ҵ��()
        
        //��Ű�� ����� - ���� 
        //�ٸ� ��Ű�� �ȿ� �ִ� Ŭ���� ����Ѵ� ~is a : ~�� ~�̴�. �������� �����̴�.-��Ӱ��� extends, implements
        // ~has a ~�� ~�� ������ �ִ�. �ڵ����� �ڵ��� ������ �ִ�.  - ���հ��� ������ �ִ� import
        BookDao bookdao = new BookDao();
        bookdao.setName("ȫ�浿") ; //����� - �������� / ���� ���� ���߰� ������ ���� �����ϱ� - ĸ��ȭ
        //���� ������ - public, protected, default(package)-�ƹ��� �Ⱦ� ��, private
        //�̱��� - 
        
	}

}

class Ex01{
	
	static int k=100;
	int s=200;
	
	static void a() {
		k=k+200;
		// s = s+ k; ��� ���� 
	}
	
	void b() {
		s = s + 100; 
		k = k + 300;
	}
	
	
	
	
	
}