package javaMid3.b1318.a01;

public class Buyer {  //물건을 사는 손님
    int money = 1000;
    int bonusPoint = 0;
    
    Product[] item = new Product[10];
    int i=0;
    
    void buy( Product p ) {
    	if(money  < p.price ) {
    		System.out.println( "잔액이 부족하여 물건을 살 수 없습니다");
    		return;
    	}
    	money -= p.price;
    	bonusPoint += p.bonunsPoint;
    	item[i++] = p;
    	System.out.println( p.toString() + "을 구매하셨습니다.");
    }
    
    void summary() {
    	int sum=0;
    	String itemList = "";
    	for(int i=0; i< item.length ; i++ ) {
    		if( item[i] == null ) break;
    		sum += item[i].price;
    		itemList += item[i] + ", ";
    	}
    	System.out.println( "구입하신 물품 총금액은 " + sum + "만원입니다");
    	System.out.println( "구입하신 제품은 " + itemList + "입니다");
     }
    
}
