package javaBasic2.ch05.day03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Computer com1 =new Computer();
        com1.setComputerName("IBM I7-5700");
        com1.setPrice(2500000);
        com1.setManufacturer("삼성");
        System.out.println(com1.getComputerName());
        System.out.println(com1.getPrice());
        System.out.println(com1.getManufacturer());
        //TV 클래스 만들고 값 tvSize 15, tvPrice 3000000, tvModel "tv-m 1500"
        
        TV tv1 = new TV();
        tv1.setTvSize(15);
        tv1.setTvPrice(3000000);
        tv1.setTvModel("tv-m 1500");
        System.out.println( tv1.getTvSize() );
        System.out.println( tv1.getTvPrice() );
        System.out.println( tv1.getTvModel() );
        
	}

}

class TV{
	int tvSize;
	int tvPrice;
	String tvModel;
	
	public int getTvSize() {
		return tvSize;
	}
	public void setTvSize(int tvSize) {
		this.tvSize = tvSize;
	}
	public int getTvPrice() {
		return tvPrice;
	}
	public void setTvPrice(int tvPrice) {
		this.tvPrice = tvPrice;
	}
	public String getTvModel() {
		return tvModel;
	}
	public void setTvModel(String tvModel) {
		this.tvModel = tvModel;
	}
	
}

class Computer{
	//필드 클래스멤버  
	String computerName;
	int price;
	String manufacturer;//제조사 예) 삼성
	
	//메서드 동작 
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	//setter메소드 getter메소드 자동으로 만들어 주기
	

}