package javaBasic3.ch06.day01;

public class Car {
     String carName; //�ڵ�������
	 int carPrice; //����
	 String carMan; //������
	 
	public Car() {
		System.out.println("�⺻ ��������");
		carName="�ҳ�Ÿ";
		carPrice=5000;
		carMan="����";
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
