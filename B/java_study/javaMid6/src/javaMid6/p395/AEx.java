package javaMid6.p395;

public class AEx {

	public static void main(String[] args) {
		A a = new A();
        a.method();
        
        //B클래스를 다른 클래스에서 사용하고 싶다
        // 방법) 외부클래스인 A를 객체화하고 B클래스를 객체화하기
        // 형식  A.B b= a.new B(); . ~안에 
        A.B b = a.new B();
        b.bMethod();
        
	}

}
