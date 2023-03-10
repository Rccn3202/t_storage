package javaHeight05.ex05;

import java.util.TreeSet;

public class ComparatorEx05 {

	public static void main(String[] args) {
		TreeSet<Fruit> fruitTs =new TreeSet<Fruit>(   new FruitComparator() );
		
		fruitTs.add( new Fruit("포도", 3000)  );
		fruitTs.add( new Fruit("수박", 10000) );
		fruitTs.add( new Fruit("딸기", 6000) );
		fruitTs.add( new Fruit("배", 3000) );
		fruitTs.add( new Fruit("샤인머스키", 8000) );
		
		System.out.println( "트리에 달려 있는 노드의 갯수는 " + fruitTs.size() ) ;
		
		
	}

}
