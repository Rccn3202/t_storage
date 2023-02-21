package javaMid3.p297;

public class D {

	public static void main(String[] args) {
		// A클래스 : 1~10까지의 합, 차(합-10)
		A a = new A();
		System.out.println( a.sum() );
		System.out.println( a.dif() );
		
		B b = new B();
		System.out.println( b.sum() );

		C c = new C();
		System.out.println( c.sum() );
		System.out.println( c.dif() );
		System.out.println( c.mul() );

	}

}
