package javaBasic4.day01;

public class StaticEx04 {

	public static void main(String[] args) {
		System.out.println(  Student.a + " " + Student.b +"  " +   Student.c  );
		Student.sM();
		
		
        //ia ib ic iM() 
		Student st = new Student();
		System.out.println( Student.getA() );
		
		float ii = st.getIb();
		System.out.println( ii );
		
		
	}

}

class Student{
	static int a=10;
	static float  b=1.1f;
	static double c=5.5;
	
	int ia=100;
	float ib = 2.2f;
	double ic=6.6;
	
	
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		Student.a = a;
	}
	public static float getB() {
		return b;
	}
	public static void setB(float b) {
		Student.b = b;
	}
	public static double getC() {
		return c;
	}
	public static void setC(double c) {
		Student.c = c;
	}
	public int getIa() {
		return ia;
	}
	public void setIa(int ia) {
		this.ia = ia;
	}
	public float getIb() {
		return ib;
	}
	public void setIb(float ib) {
		this.ib = ib;
	}
	public double getIc() {
		return ic;
	}
	public void setIc(double ic) {
		this.ic = ic;
	}
	public static void sM() {
		System.out.println( "이곳은 정적 메소드 " + a + b + c);
		//홍길동 서울이 나오게 출력하기
		System.out.println( Person.name + "  " + Person.addr );
	}
	public void iM() {
		System.out.println("이곳은 인스턴스 메소드" + a + b + c + ia + ib + ic);
	}
}

class Person{
	static String name="홍길동";
	static String addr="서울";
}