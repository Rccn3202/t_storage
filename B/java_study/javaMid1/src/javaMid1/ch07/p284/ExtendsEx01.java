package javaMid1.ch07.p284;

public class ExtendsEx01 {

	public static void main(String[] args) {
		// ���
          A a = new A();
          a.setName("ȫ�浿");
          a.setPhone("010-123-1234");
          System.out.println( a.getName() );
          System.out.println( a.getPhone() );
          a.printM();
        //B PŬ���� ��� ���� 30 ��ȭ��ȣ "010-789-7890" ����ϱ�
          B b = new B();
          b.setAge(30);
          b.setPhone("010-789-7890");
          System.out.println( b.getAge() );
          System.out.println( b.getPhone() );
          b.printMM();
        // C �ʵ� school ������б�  ��� ȫ�浿, 010-123-1234, 30, ������б�
          C c = new C();
          c.setName("�̼���");
          c.setPhone("010-123-1234");
          c.setAge(30);
          c.setSchool("������б�");
          
          c.printAll();
          
             
          
          
	}
}

