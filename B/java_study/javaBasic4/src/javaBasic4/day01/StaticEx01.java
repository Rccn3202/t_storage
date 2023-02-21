package javaBasic4.day01;

public class StaticEx01 {

	public static void main(String[] args) {
		System.out.println("나는 정적 메소드야 클래스로더 단계에서 바로 메소드 영역에 올라감");
	
		StaticEx01 se = new StaticEx01();
		se.instanceMethod();
	}

	public void instanceMethod() {
		System.out.println("인스턴스 메소드 객체생성후 사용할 수 있음");
	}
}
