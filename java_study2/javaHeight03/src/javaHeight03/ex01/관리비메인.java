package javaHeight03.ex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 관리비메인 {

	public static void main(String[] args) {
		Set<관리비> mangerSet = new HashSet<관리비>();
		mangerSet.add(new 관리비("502", 1,423, 35000));
		mangerSet.add(new 관리비("303", 7,724, 25000));
		mangerSet.add(new 관리비("403", 2,222, 40000));
		mangerSet.add(new 관리비("503", 2,438, 35000));
		mangerSet.add(new 관리비("503", 3,171, 25000));
		
		Iterator<관리비> it=mangerSet.iterator();
		while( it.hasNext() ) {
			System.out.println( it.next().toString() );
		}
		
        String inputData="503";
        it=mangerSet.iterator();
        while( it.hasNext() ) {
        	관리비 addr = it.next();
			if( addr.get호수().equals(inputData) ){
				System.out.println( addr.get전기사용량() );
			}
		}
        
        it=mangerSet.iterator();
        int max=0;//전기최대 사용량
        관리비 maxAddr=null;
        while( it.hasNext() ) {
        	관리비 addr = it.next();
			if( max < addr.get전기사용량()  ){
			   max = addr.get전기사용량();
			   maxAddr = addr; //전기사용량이 제일 큰 객체의 주소를 넣어준다
			}
		}
        System.out.println( "우리 아파트에서 전기를 제일 많이 쓰는 호수는?");
        System.out.println( maxAddr.get호수() + "호 " + maxAddr.get가족수() + "명" );
        
        it=mangerSet.iterator();
        관리비[] minAddr= new 관리비[10];
        int min=99999999;
        int index=0; //관리비 배열의 인덱스 변수
        while( it.hasNext() ) {
        	관리비 addr = it.next();
        	
        	if( min > addr.get공동요금() ) {
        		min = addr.get공동요금();
        		minAddr[index] = addr; //minAddr[0] 25000에 대한 주소가 들어감
        	}else if( min == addr.get공동요금() ) {
        		index++;
        		minAddr[index] = addr;
        	}
        }
        for( int i=0; i< minAddr.length; i++) {
        	if( minAddr[i]==null) break;
        	minAddr[i].set공동요금( minAddr[i].get공동요금() + 500 );
        }

        it=mangerSet.iterator();
		while( it.hasNext() ) {
			System.out.println( it.next().toString() );
		}
		
	    it=mangerSet.iterator();
	    int sum전기사용 = 0;
	    int sum공동요금 = 0;
		while( it.hasNext() ) {
			관리비 addr=it.next();
			sum전기사용 += addr.get전기사용량();
		    sum공동요금 += addr.get공동요금();
		}
        System.out.println( " 전체 전기사용량의 평균은 " + ( sum전기사용 / mangerSet.size() ) );
        System.out.println( " 전체 공동요금의 평균은 " + ( sum공동요금 / mangerSet.size() ) );
		
		
	}

}
