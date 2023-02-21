package javaMid1.ch07.p293;

public class A {

	int a;
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	public A() {
		this(100);
		System.out.println("A 클래스의 기본생성자");
	}
	public A(int a) {
		this.a = a;
		System.out.println("A 클래스의 명시적 생성자");
	}
	
}
