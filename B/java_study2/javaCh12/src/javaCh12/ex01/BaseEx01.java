package javaCh12.ex01;

import java.io.IOException;

public class BaseEx01 {

	public static void main(String[] args) {
		
		try {
		   System.out.println("����� ����");
		   System.err.println("�������� ���������� ����ϴ� ��");
           int val = Integer.parseInt("100");
         
         while( true ) { 
           int readData = System.in.read();
           System.out.println( readData );
           if( readData == 78 || readData == 110 ) {
        	   System.out.println("���μ�������");
        	   System.exit(0);
           }
           System.out.println("����� ����");
          } //end while
		}catch( NumberFormatException | IOException e  ) {
			System.err.println( e.getMessage() );
		}
           
	}

}
