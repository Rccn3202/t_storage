package javaBasic3.ch06.day02;

public class ClassEx04 {

	public static void main(String[] args) {
		// 234페이지 가변 길이 매개변수
          Computer c1 = new Computer();
          System.out.println( c1.sum(1,2) );
          System.out.println( c1.sum(1,2,3,4) );
          System.out.println( c1.sum(10,20,30) );
          
          System.out.println( c1.cc("a", "b")); //ab
          System.out.println( c1.cc("a", "b", "c")); //abc
          System.out.println( c1.cc("a","b", "c","d")); //abcd
      }
}

class Computer{
	int sum(int ... values) {
		int total = 0;
		for(int i=0; i<values.length ; i++) {
			total += values[i];
		}
		return total;
	}
	String cc(String ... a) {
		String total=null;
		for(int i=0; i<a.length ; i++) {
			total += a[i];
		}
		return total;
	}

	//메소드명은 동일한데 매개변수가 다른 것-메소드 재사용(Overloading)
//	int  sum(int a, int b ){
//		return a+b;
//	}
//	int sum(int a, int b, int c, int d) {
//		return a+b+c+d;
//	}
//	int sum(int a, int b, int c) {
//		return a+b+c;
//	}
	
}