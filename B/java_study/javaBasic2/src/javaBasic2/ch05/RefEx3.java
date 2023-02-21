package javaBasic2.ch05;

public class RefEx3 {
	public static void main(String[] args) {
	  Student1 s1 = new Student1();
	  s1.stName="홍길동";
	  s1.age = 20;
	  s1.m1();
	  System.out.println("이곳은 main()" + s1.stName);
	  s1.m2();
	  
	  Person1 person1 = new Person1();
	  person1.address = "하남시";
	  person1.point = 301.3;
	  person1.getAddress();
	  person1.getPoint();
	  person1.getAll();
	  
	  //메소드를 이용해서 값을 전달하기
	  person1.setAddress("하남시");
	  person1.setPoint(301.3);
	  person1.setAll("강동구", 40.2);
	  person1.setEx(5,true, "홍길동", 5.8);
	}
}
class Person1{
	//멤버필드
	String address;
	double point;
    //멤버 메소드 
	void setAddress( String address ) {
		this.address = address;
		System.out.println("이곳은 Person1클래스의 메소드임 " + address);
	}
	void setPoint( double  point ) {
		this.point = point;
		System.out.println(point);
	}
	void setAll( String address, double point  ) {
		this.address = address; //this 자신 클래스의 멤버필드를 가르킴 
		this.point = point;
		System.out.println(address + " " + point);
	}
	void setEx(double e, boolean f, String g, double h ) {
		
	}
	
	void getAddress() {
		System.out.println(address);
	}
	void getPoint() {
		System.out.println(point);
	}
	void getAll() {
		System.out.println(address + " " + point);
	}
}
class Teacher1{
	String dept;
	boolean gender;
}
class Student1{
	String stName;
	int age;
	//메서드 동작하기 실행하기
	//메서드 형식 
	// 리턴타입 메서드명( 메서드가 호출될때 넣어주는 값들 ) {  처리할 내용들 }
	void m1() {
		System.out.println("이곳은 Student클래스의 m1메소드입니다");
	}
	void m2() {
		System.out.println( age + "  " + stName + " 이곳은 Student클래스입니다");
	}
}

