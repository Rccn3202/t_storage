package javaBasic4.day01;

public class FinalEx01 {
	
	static final double PI=3.14; 
	//상수선언 항상 그대로인 수,  대문자 사용한다(관례)
	
	public static void main(String[] args) {
		// final - 끝 마지막
        int a=10;
        a = a+100;
        
        final int b=100; //b라는 변수는 마지막으로 100을 갖는거야
        System.out.println( b+200 ) ;
        
        System.out.println( Math.PI );
        
       
        
	}

}
