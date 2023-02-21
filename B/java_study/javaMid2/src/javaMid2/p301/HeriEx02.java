package javaMid2.p301;

import javaMid2.p302.AB;
import javaMid2.p302.C;

public class HeriEx02 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println( a.value );

		AA aa = new AA();
		System.out.println( aa.value );
		
		AB ab = new AB(); //다른 패키지에 있음 자식임
		System.out.println( ab.value );
		
		C c = new C(); //다른 패키지에 있음 자식이 아님
		//System.out.println( c.value );
		
		B b = new B();
		System.out.println( );
	}
}
