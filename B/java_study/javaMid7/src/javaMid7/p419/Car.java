package javaMid7.p419;

public class Car {
    
	Tire t1 = new Tire() {
		@Override
		public void roll() {
			System.out.println("일반타이어가 달립니다");
		}
	};
	
	Tire t2 = new Tire() {
		
		@Override
		public void roll() {
			System.out.println("금호타이어가 달립니다");
			
		}
	};
}
