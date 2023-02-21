package javaMid7.blog2265;

import java.util.Scanner;

public class CalculatorBusiness {
	Calculator ca = new Calculator();
	Scanner sc;
	
    void input() {
    	
    	sc = new Scanner(System.in);
    	System.out.print( "가로는 " );
    	ca.setWidth( sc.nextInt() );
    	System.out.print( "세로는 " );
    	ca.setHeight( sc.nextInt() );
    }
    void print() {
    	ca.printA();
    }
     //익명 자식객체 구현 넓이 구하기
    Calculator ca1 = new Calculator() {
    	@Override
    	void calc() {
    		input();
    		int result;
    		result = ca.getWidth() * ca.getHeight();
    		print();
    		System.out.println("넓이는 " + result );
    	}
    	
    }; 
    // 부피를 구하는 익명 자식객체 구현하기
    Calculator ca2 = new Calculator() {
    	 @Override
    	 void calc() {
    		 int volumn;//부피
    		 input();
    		 System.out.print( "부피는 " );
    	     volumn = sc.nextInt();
    	     int result;
    	     result = ca.getWidth() * ca.getHeight() * volumn;
    		 print();
    		 System.out.println("부피 계산 값은 " + result );
    	 }
    };
    //겉넓이 구하는 익명 자식 객체 구현하기
    Calculator ca3 = new Calculator() {
    	@Override
   	   void calc() {
   		 int volumn;//부피
   		 input();
   		 System.out.print( "부피는 " );
   	     volumn = sc.nextInt();
   	     System.out.println("부피는 " + volumn );
   	     int result;
   	     result = ( ca.getWidth() * ca.getHeight() + ca.getHeight() * volumn + ca.getWidth() * volumn ) * 2 ;
   		 print();
   		 System.out.println("겉넓이 계산 값은 " + result );
   	 }
    };
    
    
}
