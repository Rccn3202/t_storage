package javaHeight05.ex09;

import java.util.Stack;

public class StactEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Stack<Coin> coinBox=new Stack<Coin>(); 
             
             coinBox.push( new Coin(100));
             coinBox.push( new Coin(50));
             coinBox.push( new Coin(500));
             coinBox.push( new Coin(10));
             
             while( !coinBox.isEmpty() ) {
            	 Coin coin = coinBox.pop();
            	 System.out.println( "������ ���� : " + coin.getValue() + "��");
             }
             
             Stack<ParkingLot> parkingBox = new Stack<ParkingLot>();
             parkingBox.push(new ParkingLot("�ҳ�Ÿ"));
             parkingBox.push(new ParkingLot("����"));
             parkingBox.push(new ParkingLot("�׷���"));
             parkingBox.push(new ParkingLot("Ƽ��"));
             parkingBox.push(new ParkingLot("K5"));
             
             while( !parkingBox.isEmpty() ) {
            	 ParkingLot p = parkingBox.pop();
            	 System.out.println("���� ���� " + p.getCarKind()) ;
 	 
             }
            
	}

}
