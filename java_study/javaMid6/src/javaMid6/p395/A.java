package javaMid6.p395;

public class A {
    
	class B{ 
		public B() {
			System.out.println("BŬ������ �⺻������");
		}
		void bMethod() {
			System.out.println("���� ���� �޼ҵ���");
		}
	};
    
	B field = new B();
	
    A(){
    	System.out.println("AŬ������ �⺻������");
    	B b = new B();
    }
    
    void method() {
    	System.out.println("�̰��� �޼ҵ� �κ���~~~~");
    	B b = new B();
    }
}
