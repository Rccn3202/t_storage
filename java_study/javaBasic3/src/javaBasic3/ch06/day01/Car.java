package javaBasic3.ch06.day01;

public class Car {
     String carName; //자동차종류
	 int carPrice; //가격
	 String carMan; //제조사
	 
	public Car() {
		System.out.println("기본 생성자임");
		carName="소나타";
		carPrice=5000;
		carMan="현대";
	}
	
	public Car( String carName  ) {
		this.carName = carName; 
	}
	
	public Car( String carName, int carPrice ) {
		this.carName = carName; 
		this.carPrice = carPrice;
	}
	
	public Car( String carName, int carPrice, String carMan) {
		this.carName = carName;
		this.carPrice = carPrice;
		this.carMan = carMan;
	}
	
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarMan() {
		return carMan;
	}
	public void setCarMan(String carMan) {
		this.carMan = carMan;
	}
	 
	 
}
