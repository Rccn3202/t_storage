package javaMid2.p301;

import javaMid2.p302.AB;
import javaMid2.p302.C;

public class HeriEx02 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println( a.value );

		AA aa = new AA();
		System.out.println( aa.value );
		
		AB ab = new AB(); //�ٸ� ��Ű���� ���� �ڽ���
		System.out.println( ab.value );
		
		C c = new C(); //�ٸ� ��Ű���� ���� �ڽ��� �ƴ�
		//System.out.println( c.value );
		
		B b = new B();
		System.out.println( );
	}
}
