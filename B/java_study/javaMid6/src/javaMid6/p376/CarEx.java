package javaMid6.p376;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		// myCar.run();

		myCar.tire1 = new KumhoTire();
		
		//myCar.run();
		
		myCar.tire1 = new HankookTire();
		myCar.tire2  = new HankookTire();
		myCar.run();
	}

}
