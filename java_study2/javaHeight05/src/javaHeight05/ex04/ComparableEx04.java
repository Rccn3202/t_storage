package javaHeight05.ex04;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx04 {

	public static void main(String[] args) {
		TreeSet<Person> ts  = new TreeSet<Person>();
        ts.add( new Person("홍길동", 15, 2.0) );
        ts.add( new Person("감자바", 5, 5.5) );
        ts.add( new Person("박지원", 33, 1.2));
        ts.add( new Person("김지원", 31, 5.12));
        ts.add( new Person("최지원", 32, 7.5 ));
        
        Iterator<Person> it=ts.iterator();
        while( it.hasNext() ) {
        	Person p = it.next();
        	System.out.println( p.getName() + " - " + p.getAge() );
        }
        
        
        TreeSet<Person> ts1 = new TreeSet<Person>();
        ts1.add( new Person("홍길동", 15, 5.1) );
        ts1.add( new Person("감자바", 5,  2.2) );
        ts1.add( new Person("박지원", 33, 3.3));
        ts1.add( new Person("김지원", 31, 0.0));
        ts1.add( new Person("최지원", 32, 7.8));
        
        it=ts1.iterator();
        while( it.hasNext() ) {
        	Person p = it.next();
        	System.out.println( p.getName() + " - " + p.getAge() + "   " + p.getScore());
        }
        
	}

}
