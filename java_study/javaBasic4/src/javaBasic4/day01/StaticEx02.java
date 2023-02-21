package javaBasic4.day01;

public class StaticEx02 {
    // A static B in stat
	//프로그램 생명주기(Life Cycle)  생성-활용-소멸 
	//
	static int a=100; //정적변수 static 붙어 있는 것은 프로그램 시작할 때 생성되고 프로그램이 종료되면 종료됨
	static double b=3.14; // 즉 계속 메모리에 남아 있음 
	static String name="홍길동";
	
	int c=200; //인스턴스 변수 동적변수 new하면 생성됨 해당 클래스를 더이상 쓰지 않으면 해당 클래스를 벗어나면 
	double d=5.5;
	String addr="하남시";
	
	public static void main(String[] args) {
		System.out.println(a + "  " + b + " " + name);
		StaticEx02 se02  = new StaticEx02();
		System.out.println(se02.c + "  " + se02.d + " " + se02.addr); //메모리 올려지지 않은 필드니깐
	}

}
