package javaMid8.Exec.p422;

public class Exec01 {

	public static void main(String[] args) {
		// 9장 확인문제
        //InnerA를 객체생성하기
		OutterA o = new OutterA();
		o.localMethod();
		
		OutterA.InnterA oi = o.new InnterA();
		
		//InnserSA를 객체생성하기
		OutterA.InnterSA osi = new OutterA.InnterSA();
	}

}
