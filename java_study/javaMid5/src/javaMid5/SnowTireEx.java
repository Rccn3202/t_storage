package javaMid5;

public class SnowTireEx {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();  //�������� �޼ҵ� ����ȴ�.

		tire = new Tire();
		tire.run(); 
	}
}
