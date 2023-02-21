package javaMid6.p376;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Subway subway =  new Subway();
		
		Vehicle vehicle = new Bus();
		
		Vehicle[] v = new Vehicle[10];
		v[0] = new Bus();
		v[1] = new Taxi();
		
				
		driver.driver(bus);
		driver.driver(taxi);
		driver.driver(subway);
		//����ö�� �޸��ϴ�. 
		
		driver.farePrint(bus);
		driver.farePrint(taxi);
		driver.farePrint(subway);
		
		System.out.println(  "���� ����� " + driver.fare(bus) + "���Դϴ�"); //1350 
		System.out.println(  "�ý� ����� " + driver.fare(taxi) + "���Դϴ�"); //3850
		System.out.println(  "����ö ����� " + driver.fare(subway) + "���Դϴ�"); //1650

	}
}
