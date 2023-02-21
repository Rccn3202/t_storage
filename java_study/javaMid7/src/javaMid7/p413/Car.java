package javaMid7.p413;

public class Car {
   //비즈니스 클래스-실제로 프로그램 작성하는 부분
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체(한국타이어)가 굴러 갑니다.");
		}
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	private Tire tire3 = new Tire() {
		@Override
		public void roll() {
			System.out.println("금호 타이어가 굴러 갑니다.");
		}
	};
	public void run2() {
		tire1.roll();
		tire2.roll();
		tire3.roll();
	}
	//미쉐린 타이어가 굴러 갑니다
	
	
}
