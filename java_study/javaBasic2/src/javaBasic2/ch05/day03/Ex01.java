package javaBasic2.ch05.day03;

public class Ex01 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("ȫ�浿");
		System.out.println( s1.getName() );
		s1.setPhone("010-1234-5678");
		System.out.println(s1.getPhone() );
		s1.setKor(90);
		System.out.println(s1.getKor() );  //11�� 10�б��� ����
	}
}

class Student{
	String name;//�л���
	String phone;//�л���ȭ
	int kor;
	
	void setName( String name ) {
		this.name = name;
	}
	
	void setPhone( String phone ) {
		 this.phone = phone;
	}
	
	void setKor(int kor) {
		this.kor = kor;
	}
	
	String  getName(){
		return name;  //this.name 
	}
	
	String getPhone(){
		return phone;
	}
	
	int getKor() {
		return kor;
	}
	
}