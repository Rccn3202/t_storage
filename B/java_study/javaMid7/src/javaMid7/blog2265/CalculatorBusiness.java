package javaMid7.blog2265;

import java.util.Scanner;

public class CalculatorBusiness {
	Calculator ca = new Calculator();
	Scanner sc;
	
    void input() {
    	
    	sc = new Scanner(System.in);
    	System.out.print( "���δ� " );
    	ca.setWidth( sc.nextInt() );
    	System.out.print( "���δ� " );
    	ca.setHeight( sc.nextInt() );
    }
    void print() {
    	ca.printA();
    }
     //�͸� �ڽİ�ü ���� ���� ���ϱ�
    Calculator ca1 = new Calculator() {
    	@Override
    	void calc() {
    		input();
    		int result;
    		result = ca.getWidth() * ca.getHeight();
    		print();
    		System.out.println("���̴� " + result );
    	}
    	
    }; 
    // ���Ǹ� ���ϴ� �͸� �ڽİ�ü �����ϱ�
    Calculator ca2 = new Calculator() {
    	 @Override
    	 void calc() {
    		 int volumn;//����
    		 input();
    		 System.out.print( "���Ǵ� " );
    	     volumn = sc.nextInt();
    	     int result;
    	     result = ca.getWidth() * ca.getHeight() * volumn;
    		 print();
    		 System.out.println("���� ��� ���� " + result );
    	 }
    };
    //�ѳ��� ���ϴ� �͸� �ڽ� ��ü �����ϱ�
    Calculator ca3 = new Calculator() {
    	@Override
   	   void calc() {
   		 int volumn;//����
   		 input();
   		 System.out.print( "���Ǵ� " );
   	     volumn = sc.nextInt();
   	     System.out.println("���Ǵ� " + volumn );
   	     int result;
   	     result = ( ca.getWidth() * ca.getHeight() + ca.getHeight() * volumn + ca.getWidth() * volumn ) * 2 ;
   		 print();
   		 System.out.println("�ѳ��� ��� ���� " + result );
   	 }
    };
    
    
}
