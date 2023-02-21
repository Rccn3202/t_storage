package javaBasic3.ch06.day01;

public class ClassEx02 {

	public static void main(String[] args) {
		// 생성자 오버로딩 공부
          Student st = new Student();
          Student st1 = new Student("홍길동");
          Student st2 = new Student("010-1234-5678", 100);
          Student st3 = new Student("홍길동", 90);
          Student st4 = new Student(85,"010-7894-5612");
          Student st5 = new Student("홍길동", 100, "5214-8788");
          Student st6 = new Student("010-555-6666");
       //에러를 고치고 전부 출력해 보기 
	}
}
class Student{
	String name;
	String phone;
	int scores;
	
	public Student() {
		System.out.println("Student클래스의 기본생성부분");
	}
	
	public Student(String name) {
		this.name = name;
	}
	public Student( String name, int scores) {
		this.scores = scores;
		this.name = name;
	}
	public Student(int scores, String phone) {
		this.scores = scores;
		this.phone = phone;
	}
	public Student(String name,  int scores, String phone) {
		this.name = name;
		this.phone = phone;
		this.scores = scores;
	}
	
	
	
}
