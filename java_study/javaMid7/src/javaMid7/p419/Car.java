package javaMid7.p419;

public class Car {
    
	Tire t1 = new Tire() {
		@Override
		public void roll() {
			System.out.println("�Ϲ�Ÿ�̾ �޸��ϴ�");
		}
	};
	
	Tire t2 = new Tire() {
		
		@Override
		public void roll() {
			System.out.println("��ȣŸ�̾ �޸��ϴ�");
			
		}
	};
}
