package javaMid6.p395;

public class OuterA {
   
	int a=100;
	
	void aMethod() {
		a = a + 200;
		//ia = ia + 300; ���� Ŭ������ �ʵ�� ������.
		//iAMethod(); ���� Ŭ������ �޼ҵ�� ������. 
		InnerA ina = new InnerA(); //��üȭ�� �Ѵ�
		ina.ia = ina.ia + 300; // ��������.�ʵ�� ���
		ina.iAMethod();
	}
	
	public OuterA() {
		
	}
	
	class InnerA {
		//�ۿ� �ִ� Ŭ���� �����(�ʵ�, �޼ҵ�)�� ����� �� ���� 
		int ia=200;
		void iAMethod() { 
			ia = ia -10;
			a = a + 400;//�ܺο� �ִ� ����(�ʵ�) ����� �� �ִ�
			aMethod(); //�ܺο� �ִ� �޼ҵ� ����� �� �ִ�
		}
		public InnerA() {
			
		}
	}
	
}
