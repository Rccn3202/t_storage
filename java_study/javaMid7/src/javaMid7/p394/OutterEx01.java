package javaMid7.p394;

public class OutterEx01 {

	public static void main(String[] args) {
		// OuterA�� �ν��Ͻ� ��� Ŭ���� ��üȭ �ϱ�
		OuterA o = new OuterA();
		OuterA.InnerA ia = o.new InnerA();
		
		//OutterB�� ������� Ŭ���� ��üȭ �ϱ�
		OutterB.InnerB oi = new OutterB.InnerB();
		oi.ia = 100;
		oi.iaM();
		//static �پ� �ִ� ������� Ŭ������.������� Ŭ������.�޼ҵ��()
		OutterB.InnerB.sia = 200;
		
		
		// �ν��Ͻ� ��� Ŭ���� 1~100���� �� ����ϱ�
		ia.iaM();
		ia.ipM();
		
		// ������� Ŭ���� ��üȭ �ϱ� *****
		//                      ****
		//                      ***
		//                      **
		//                      *
		OutterB.InnerB.siaM();
	/*	������� Ŭ���� ��üȭ�ϱ�
		*     *
		**   **
		*** ***
		*******
		          */
		oi.iaM2();
		
		OutterC outterC = new OutterC();
		outterC.iaM();
		
		OutterD.sM();
		
	}

}
