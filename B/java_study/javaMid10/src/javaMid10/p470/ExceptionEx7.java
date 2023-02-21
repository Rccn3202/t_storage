package javaMid10.p470;

public class ExceptionEx7 {

	public static void main(String[] args) {
		B b = new B();
		try {
			b.b1();
		} catch (ClassNotFoundException | ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
