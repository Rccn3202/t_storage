package javaMid7.p394;

public class OutterB {
     int oa=10;
     static int soa=20;//�����ʵ�, Ŭ���� ���
     void oaM() {  oa=oa - 5;
                   soa = soa +10;
                   soaM();
     }
     static void soaM() { 
    	 //oa = oa + 5; X
    	 soa=soa -1;
    	// oaM();
     }
     
    static class InnerB {
    	 int ia=20;
    	 static int sia=30;
    	 void iaM() { 
    		 ia = ia + 10;
    		// oa = oa + 20; �ۿ� Ŭ������ �ν��Ͻ� ����� ����
    		 soa = soa + 10;
    		// oaM();
    		 soaM();
    	 }
    	 static void siaM() {
    		 for(int i=0; i<5; i++) {
    			 for(int j=0; j< 5-i ; j++) {
    				 System.out.print("*");
    			 }
    			 System.out.println();
    		 }
    	 }
    	 
    	 /*	������� Ŭ���� ��üȭ�ϱ�
 		*     *
 		**   **
 		*** ***
 		*******
 		          */
    	 void iaM2() {
    		for(int i=0; i<4;i++) { //i=0,1,2,3
    			for(int j=0; j< i+1; j++ ) { //j=0 j=0,1 j=0,1,2  j = ? 0,1,2,3
    				System.out.print("*");
    			}
    			for(int k=0; k < (5 - 2*i) ; k++) { //k=0,1,2,3,4  k=0,1,2  k=0, false ����ϱ� �ʱ�
    				System.out.print(" ");  // 5 3 1 -1
    			}
    			for(int l=0;l< i+1; l++) { //l=0 l=0,1  l=0,1,2   l=0,1,2,3 l=0,1,2 
    				if( i==3 && l==3 ) break;
    				System.out.print("*");
    			}
    			System.out.println();
    		}
    	 }
    	 
     }
}
