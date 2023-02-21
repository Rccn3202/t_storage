package javaBasic4.day01;

public class StaticEx05 {
	
    public static void main(String[] args) {
//		System.out.println("메인 메소드 부분임");
//		System.out.println( Car.a);
		Car car = new Car();
		System.out.println( car.ia ); 
		
	}
}

class Car{
	static int a;
	int ia;
	
	static {
	  System.out.println("이곳은 정적블록임-이곳은 정적 멤버들을 처리할 때 이곳 먼저");
	  System.out.println("이곳에는 정적멤버들의 초기값을 넣을 때 주로 사용함");
	  a=200;
	}
	
	{
		System.out.println("이곳은 인스턴스 블록임");
		ia=1000;
	}
	
	public Car() {
		System.out.println("이곳은 기본생성자 부분임");
		ia=2000;
	}
	
}