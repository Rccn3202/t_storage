package javaMid7.p394;

public class OutterEx01 {

	public static void main(String[] args) {
		// OuterA는 인스턴스 멤버 클래스 객체화 하기
		OuterA o = new OuterA();
		OuterA.InnerA ia = o.new InnerA();
		
		//OutterB는 정적멤버 클래스 객체화 하기
		OutterB.InnerB oi = new OutterB.InnerB();
		oi.ia = 100;
		oi.iaM();
		//static 붙어 있는 멤버들은 클래스명.멤버변수 클래스명.메소드명()
		OutterB.InnerB.sia = 200;
		
		
		// 인스턴스 멤버 클래스 1~100까지 합 출력하기
		ia.iaM();
		ia.ipM();
		
		// 정적멤버 클래스 객체화 하기 *****
		//                      ****
		//                      ***
		//                      **
		//                      *
		OutterB.InnerB.siaM();
	/*	정적멤버 클래스 객체화하기
		*     *
		**   **
		*** ***
		*******
		          */
		oi.iaM2();
		
		OutterC outterC = new OutterC();
		outterC.iaM();
		
		OutterD.sM();
		
	}

}
