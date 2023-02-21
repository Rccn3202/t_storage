package my_application_1.app;

import my_lib.pack1.A;
import my_lib.pack2.B;

public class Main {

	public static void main(String[] args) {
		 A a  = new A();
         a.method();
         
         B b  = new B();
         b.method();
	}
   //의존성, 자동주입
}
