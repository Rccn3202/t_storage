package javaMid3.b1318.a01;

public class Buyer {  //������ ��� �մ�
    int money = 1000;
    int bonusPoint = 0;
    
    Product[] item = new Product[10];
    int i=0;
    
    void buy( Product p ) {
    	if(money  < p.price ) {
    		System.out.println( "�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
    		return;
    	}
    	money -= p.price;
    	bonusPoint += p.bonunsPoint;
    	item[i++] = p;
    	System.out.println( p.toString() + "�� �����ϼ̽��ϴ�.");
    }
    
    void summary() {
    	int sum=0;
    	String itemList = "";
    	for(int i=0; i< item.length ; i++ ) {
    		if( item[i] == null ) break;
    		sum += item[i].price;
    		itemList += item[i] + ", ";
    	}
    	System.out.println( "�����Ͻ� ��ǰ �ѱݾ��� " + sum + "�����Դϴ�");
    	System.out.println( "�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�");
     }
    
}
