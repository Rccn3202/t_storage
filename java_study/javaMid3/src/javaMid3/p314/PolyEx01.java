package javaMid3.p314;

public class PolyEx01 {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.tire = new Tire();
		car.run();
		
		car.tire = new HankookTire();
		car.run();
		
		car.tire = new KumhoTire();
		car.run();
		
	}
}
