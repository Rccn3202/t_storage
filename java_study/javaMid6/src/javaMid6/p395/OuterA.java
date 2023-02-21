package javaMid6.p395;

public class OuterA {
   
	int a=100;
	
	void aMethod() {
		a = a + 200;
		//ia = ia + 300; 내부 클래스의 필드는 못쓴다.
		//iAMethod(); 내부 클래스의 메소드는 못쓴다. 
		InnerA ina = new InnerA(); //객체화를 한다
		ina.ia = ina.ia + 300; // 참조변수.필드로 사용
		ina.iAMethod();
	}
	
	public OuterA() {
		
	}
	
	class InnerA {
		//밖에 있는 클래스 멤버들(필드, 메소드)를 사용할 수 있음 
		int ia=200;
		void iAMethod() { 
			ia = ia -10;
			a = a + 400;//외부에 있는 변수(필드) 사용할 수 있다
			aMethod(); //외부에 있는 메소드 사용할 수 있다
		}
		public InnerA() {
			
		}
	}
	
}
