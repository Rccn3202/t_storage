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
            	 System.out.println( "꺼내온 동전 : " + coin.getValue() + "원");
             }
             
             Stack<ParkingLot> parkingBox = new Stack<ParkingLot>();
             parkingBox.push(new ParkingLot("소나타"));
             parkingBox.push(new ParkingLot("벤츠"));
             parkingBox.push(new ParkingLot("그래져"));
             parkingBox.push(new ParkingLot("티코"));
             parkingBox.push(new ParkingLot("K5"));
             
             while( !parkingBox.isEmpty() ) {
            	 ParkingLot p = parkingBox.pop();
            	 System.out.println("출차 순서 " + p.getCarKind()) ;
 	 
             }
            
	}

}
