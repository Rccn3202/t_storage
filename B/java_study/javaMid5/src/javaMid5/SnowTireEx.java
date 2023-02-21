package javaMid5;

public class SnowTireEx {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();  //재정의한 메소드 수행된다.

		tire = new Tire();
		tire.run(); 
	}
}
