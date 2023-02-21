package javaBasic2.ch05;

import java.util.Scanner;

public class RefEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=10;
         String name="홍길동";//name변수는 홍길동이 들어 있는 힙메모리 주소를 가지고 있다
         Scanner sc = new Scanner(System.in);
         Student st = new Student();
        // 자료형   변수명 = new 클래스명() new 해당클래스를 힙메모리에 올려라
         Person p = new Person(); 
         Teacher t =new Teacher();
         st.stName = "홍길동";
         //힙메모리에 있는 변수에다 값을 모두 넣어 보세요
         st.age = 20;
         p.address = "경기도 하남시";
         p.point = 10.25;
         t.dept="컴퓨터공학과";
         t.gender=false;
         //그리고 출력해보세요.
         System.out.println(st.stName);
	}
}
class Student{
	String stName;
	int age;
	//메서드 동작하기 실행하기
	//메서드 형식 
	// 리턴타입 메서드명( 메서드가 호출될때 넣어주는 값들 ) {  처리할 내용들 }
	void m1() {
		System.out.println("이곳은 Student클래스의 m1메소드입니다");
	}
	
}

class Person{
	String address;
	double point;
}
class Teacher{
	String dept;
	boolean gender;
}


