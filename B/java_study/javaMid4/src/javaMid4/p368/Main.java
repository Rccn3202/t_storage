package javaMid4.p368;

public class Main {
  public static void main(String[] args) {
	   //객체생성해보자
	    B b = new B();
	    C c = new C();
	    D d = new D();
	    E e = new E();
	    
	    //다형성 
	    B b1 = new D();
	    C c1 = new E();
	    A a1 = new B();
	    A a2 = new C();
	    A a3 = new D();
	    A a4 = new E();
	    
	  //  B b2 = new E(); //왜? 직계가 아니면 안됨
	    
	  // a2에서 C클래스에 메소드를 호출하고 싶다 될까? 된다
	    C c2 = (C) a2;
	    c2.c1();
	  // a4 참조변수에서 E클래스에 메소드를 호출하고 싶다 
	    E e4 = (E) a4;
	    e4.printAll(); // E클래스 값
	  // 다른방법 override 해서 하는 것 - 부모에게 만들어 두고 재정의 
	   // 부모는 C,A인데 코드 C만들어 재정의함  
	    c1.printAll();
    
  }
}
