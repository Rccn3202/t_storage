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
		//지하철이 달립니다. 
		
		driver.farePrint(bus);
		driver.farePrint(taxi);
		driver.farePrint(subway);
		
		System.out.println(  "버스 요금은 " + driver.fare(bus) + "원입니다"); //1350 
		System.out.println(  "택시 요금은 " + driver.fare(taxi) + "원입니다"); //3850
		System.out.println(  "지하철 요금은 " + driver.fare(subway) + "원입니다"); //1650

	}
}
