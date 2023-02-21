package javaMid6.p395;

public class OuterAEx {

	public static void main(String[] args) {
		//InnerA클래스의 iAMethod()를 호출하기
		//OuterA클래스 객체화하고 나서 참조변수로 InnerA클래스 객체화하기
		OuterA oa = new OuterA();
		OuterA.InnerA oi = oa.new InnerA();
		oi.iAMethod();
		
		

	}

}
