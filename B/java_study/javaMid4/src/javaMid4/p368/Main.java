package javaMid4.p368;

public class Main {
  public static void main(String[] args) {
	   //��ü�����غ���
	    B b = new B();
	    C c = new C();
	    D d = new D();
	    E e = new E();
	    
	    //������ 
	    B b1 = new D();
	    C c1 = new E();
	    A a1 = new B();
	    A a2 = new C();
	    A a3 = new D();
	    A a4 = new E();
	    
	  //  B b2 = new E(); //��? ���谡 �ƴϸ� �ȵ�
	    
	  // a2���� CŬ������ �޼ҵ带 ȣ���ϰ� �ʹ� �ɱ�? �ȴ�
	    C c2 = (C) a2;
	    c2.c1();
	  // a4 ������������ EŬ������ �޼ҵ带 ȣ���ϰ� �ʹ� 
	    E e4 = (E) a4;
	    e4.printAll(); // EŬ���� ��
	  // �ٸ���� override �ؼ� �ϴ� �� - �θ𿡰� ����� �ΰ� ������ 
	   // �θ�� C,A�ε� �ڵ� C����� ��������  
	    c1.printAll();
    
  }
}
