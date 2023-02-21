package javaMid8.Exec.p422.q6;

public class AnnonymousExample {
	public static void main(String[] args) {
      	Anonymous anony = new Anonymous();
      	anony.field.run(); //자동차가 달립니다.
      	anony.method1(); //승용차가 달립니다
      	anony.method2( new Vehicle() {
			
					@Override
					public void run() {
						System.out.println("트럭이 달립니다");
						
					}
				  }
      			
      	);

	}
}
