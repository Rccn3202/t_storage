package a;

import a.aa.AA;
import a.B;
import b.ba.BA;
import singleton.Single;

public class Main {

	public static void main(String[] args) {
		//BŬ���� ���� �������� ����ϱ�
		System.out.println( B.getSb() ) ;
       //ABŬ���� �ν��Ͻ� �������� ����ϱ�
		AA aa = new AA();
		System.out.println( aa.getName() );
		System.out.println( aa.getPhone() );
		
		//���� ������ ����ϱ�
		System.out.println( BA.getSd() );
		BA ba =new BA();
		System.out.println( ba.getId() );
		
		BA ba1 =new BA();
		
		Single  ss3  = Single.getInstance();
		System.out.println(ss3);
		
		Single  ss4 = Single.getInstance();
		System.out.println(ss4);
		
	}
}


class Q8{
	int a;
	
	final int fa;
	final static int SA;
	
	static {
		//������� 
		// a=100; //�ȵ� ��? �ν��Ͻ� ������ new�ؾ��� �޸𸮿� �ö�
		//static {} �� Ŭ�����δ� �ܰ迡 �޸𸮿� �ö� �׷��ϱ� new���� ���� �޸𸮿� �ö�
		
	}
	{
		//�ν��Ͻ����
		a=100;
	}
	public Q8(){
		//�⺻������
		a=100;
		fa = 1000;
		SA = 2000;
	}
}

