package javaMid6.p395;

public class A {
    
	class B{ 
		public B() {
			System.out.println("B클래스의 기본생성자");
		}
		void bMethod() {
			System.out.println("나는 내부 메소드임");
		}
	};
    
	B field = new B();
	
    A(){
    	System.out.println("A클래스의 기본생성자");
    	B b = new B();
    }
    
    void method() {
    	System.out.println("이곳은 메소드 부분임~~~~");
    	B b = new B();
    }
}
