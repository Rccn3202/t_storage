package javaMid6.p395;

public class AEx {

	public static void main(String[] args) {
		A a = new A();
        a.method();
        
        //BŬ������ �ٸ� Ŭ�������� ����ϰ� �ʹ�
        // ���) �ܺ�Ŭ������ A�� ��üȭ�ϰ� BŬ������ ��üȭ�ϱ�
        // ����  A.B b= a.new B(); . ~�ȿ� 
        A.B b = a.new B();
        b.bMethod();
        
	}

}
