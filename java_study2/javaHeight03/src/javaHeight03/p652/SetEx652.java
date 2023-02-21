package javaHeight03.p652;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx652 {

	public static void main(String[] args) {
		
		Set<Shop> shopSet = new HashSet<Shop>();
		shopSet.add( new Shop( "이기쁨", "1234", 100));
		shopSet.add( new Shop( "김행복", "2345", 90));
		shopSet.add( new Shop( "박수진", "1467", 300));
		shopSet.add( new Shop( "정기쁨", "1234", 100));
		shopSet.add( new Shop( "최기쁨", "1234", 100));
		shopSet.add( new Shop( "이기쁨", "1234", 300));
		shopSet.add( new Shop( "이기쁨", "1234", 200));
		
		//전체 출력하기
		//동등객체는 전화번호가 같고 이름이 같으면 동등객체로 판단 합니다. 
		
		 System.out.println("set안에 들어 있는 요소는? " + shopSet.size());
	     Iterator<Shop> it3 = shopSet.iterator();
	     while( it3.hasNext() ) {
	        	Shop shopAddr = it3.next();
	        	System.out.println( shopAddr.getCustname() + " " +  shopAddr.getCustPhone() + " " + shopAddr.getPoint() );
	    }
	     
	    //이름과 전화번호를 입력하면 포인터나오게 
	     String searchName="김행복";
	     String searchPhone="5555";
	     // 90이 출력되게 만들어 보세요
	     it3 = shopSet.iterator();
	     boolean searchOk = false;
	     while( it3.hasNext() ) {
	    	 Shop shopAddr = it3.next();
	    	 if( shopAddr.getCustname().equals(searchName) && shopAddr.getCustPhone().equals(searchPhone)) {
	    		 System.out.println( shopAddr.getPoint());
	    		 searchOk = true;
	    		 break;
	    	 }
	     }
	     if ( !searchOk ) System.out.println( searchName + "과 " + searchPhone + " 고객은 없습니다.");
	     
	    System.out.println("-----------------");
		
		Set<Member> memberSet = new HashSet<Member>();
        memberSet.add( new Member("홍길동", 30));
        memberSet.add( new Member("이순신", 25));
        memberSet.add(new Member("최기쁨", 10));
        memberSet.add( new Member("홍길동", 30));
        memberSet.add( new Member("이순신", 35));
        memberSet.add( new Member("이순신", 25));
        
        System.out.println("set안에 들어 있는 요소는? " + memberSet.size());
        Iterator<Member> it = memberSet.iterator();
        while( it.hasNext() ) {
        	Member memberAddr = it.next();
        	System.out.println( memberAddr.getName() + " " +  memberAddr.getAge() );
        }
        
        //강아지 15, 고양이 10, 토끼 7, 닭 3
        Set<Animal> aniSet = new HashSet<Animal>();
        aniSet.add(new Animal("강아지", 15));
        aniSet.add(new Animal("고양이", 10));
        aniSet.add(new Animal("토끼", 7));
        aniSet.add(new Animal("닭",3));
        aniSet.add(new Animal("강아지", 15));
        aniSet.add(new Animal("강아지", 15));
        
        Iterator<Animal> it2=aniSet.iterator();
        while( it2.hasNext() ) {
        	Animal aniAddr = it2.next();
        	System.out.println( aniAddr.getKind() + "  " + aniAddr.getLifeSpan() );
        }
	}

}
