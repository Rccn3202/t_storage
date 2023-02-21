package a;

import a.aa.AA;
import a.B;
import b.ba.BA;
import singleton.Single;

public class Main {

	public static void main(String[] args) {
		//B클래스 정적 변수값을 출력하기
		System.out.println( B.getSb() ) ;
       //AB클래스 인스턴스 변수값을 출력하기
		AA aa = new AA();
		System.out.println( aa.getName() );
		System.out.println( aa.getPhone() );
		
		//정적 변수값 출력하기
		System.out.println( BA.getSd() );
		BA ba =new BA();
		System.out.println( ba.getId() );
		
		BA ba1 =new BA();
		
		Single  ss3  = Single.getInstance();
		System.out.println(ss3);
		
		Single  ss4 = Single.getInstance();
		System.out.println(ss4);
		
	}
}


class Q8{
	int a;
	
	final int fa;
	final static int SA;
	
	static {
		//정적블록 
		// a=100; //안됨 왜? 인스턴스 변수는 new해야지 메모리에 올라감
		//static {} 은 클래스로더 단계에 메모리에 올라감 그러니깐 new보다 먼저 메모리에 올라감
		
	}
	{
		//인스턴스블록
		a=100;
	}
	public Q8(){
		//기본생성자
		a=100;
		fa = 1000;
		SA = 2000;
	}
}

