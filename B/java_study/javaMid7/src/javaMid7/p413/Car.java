package javaMid7.p413;

public class Car {
   //����Ͻ� Ŭ����-������ ���α׷� �ۼ��ϴ� �κ�
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("�͸� �ڽ� Tire ��ü(�ѱ�Ÿ�̾�)�� ���� ���ϴ�.");
		}
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	private Tire tire3 = new Tire() {
		@Override
		public void roll() {
			System.out.println("��ȣ Ÿ�̾ ���� ���ϴ�.");
		}
	};
	public void run2() {
		tire1.roll();
		tire2.roll();
		tire3.roll();
	}
	//�̽��� Ÿ�̾ ���� ���ϴ�
	
	
}
