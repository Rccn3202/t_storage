package javaMid6.p395;

public class OuterAEx {

	public static void main(String[] args) {
		//InnerAŬ������ iAMethod()�� ȣ���ϱ�
		//OuterAŬ���� ��üȭ�ϰ� ���� ���������� InnerAŬ���� ��üȭ�ϱ�
		OuterA oa = new OuterA();
		OuterA.InnerA oi = oa.new InnerA();
		oi.iAMethod();
		
		

	}

}
