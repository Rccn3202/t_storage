package javaBasic2.ch05;

public class RefEx02 {

	public static void main(String[] args) {
		Car  car = new Car();
		Car car1 = new Car();
        
		car.carKind = "�ҳ�Ÿ";
        car.carPrice = 3500;
        car1.carKind = "�׷���";
        car1.carPrice = 5000;
        
        System.out.println(car.carKind + " " + car.carPrice);
        System.out.println(car1.carKind + " " + car1.carPrice);

        City  city    = new City();
        City  city1    = new City();
        city.cityName="�ϳ���";
        city.cityLocation ="��⵵";
        city.cityTex=0.125;
        city.cityGood=true;
        city1.cityName="������";
        city1.cityLocation ="�����";
        city1.cityTex=0.134;
        city1.cityGood=true;
        System.out.println(city.cityName + " " + city.cityLocation + " " + city.cityTex + " " + city.cityGood);
        System.out.println(city1.cityName + " " + city1.cityLocation + " " + city1.cityTex + " " + city1.cityGood);
	}

}
class Car{
	String carKind;
	int carPrice;
	
}
class City{
	String cityName;
	String cityLocation;
	double cityTex;
	boolean cityGood;
}