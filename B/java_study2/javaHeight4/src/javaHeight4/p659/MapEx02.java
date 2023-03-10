package javaHeight4.p659;

import java.util.HashMap;
import java.util.Map;

public class MapEx02 {

	public static void main(String[] args) {
		// key-전화번호, value=포인터, 주소 
		Map<String, Data1> shopMap1 = new HashMap<String, Data1>();
		
		Shop shop1 = new Shop("1111", new Data1(100,"미사동1"));
		Shop shop2 = new Shop("2222", new Data1( 120, "미사동2") );
		Shop shop3 = new Shop("3333", new Data1( 140, "미사동3") );
		Shop shop4 = new Shop("4444", new Data1( 160, "미사동4") );
		Shop shop5 = new Shop("5555", new Data1( 180, "미사동5") );
		
		shopMap1.put( shop1.getPhone(), shop1.getData1()  );
		shopMap1.put( shop2.getPhone(), shop2.getData1() );
		shopMap1.put( shop3.getPhone(), shop3.getData1()  );
		shopMap1.put( shop4.getPhone(), shop4.getData1()  );
		shopMap1.put( shop5.getPhone(), shop5.getData1()  );
		
		Data1 shop1Addr = shopMap1.get( shop1.getPhone() );
		System.out.println("고객 핸드폰 번호 " + shop1.getPhone() );
		System.out.println( "고객의 포인트는 " + shop1Addr.getPoint() );
		System.out.println("고객의 주소는 " + shop1Addr.getAddress() );
		
		Data1 shop4Addr = shopMap1.get( shop4.getPhone() );
		System.out.println("고객 핸드폰 번호 " + shop4.getPhone() );
		System.out.println( "고객의 포인트는 " + shop4Addr.getPoint() );
		System.out.println("고객의 주소는 " + shop4Addr.getAddress() );
	}
}
