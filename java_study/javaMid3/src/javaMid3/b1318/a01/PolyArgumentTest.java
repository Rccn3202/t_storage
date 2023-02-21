package javaMid3.b1318.a01;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Phone());
		b.buy(new IPad());
		b.summary();
      //제품 품목 - 핸드폰 150만원, 아이패드 - 170만원,
	}

}
