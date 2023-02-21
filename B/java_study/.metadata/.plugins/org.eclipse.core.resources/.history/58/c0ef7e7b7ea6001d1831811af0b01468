package javaMid7.p394;

public class OuterA {
     int oa=10;
     int sum=0;
     
     static int soa=20;//정적필드, 클래스 멤버
     void oaM() {  oa=oa - 5;
                   soa = soa +10;
                   soaM();
     }
     static void soaM() { 
    	 //oa = oa + 5; X
    	 soa=soa -1;
    	// oaM();
     }
     
     class InnerA {
    	 int ia=20;
    //	 static int sia=30;
    	 void iaM() { 
    		 for(int i=0; i<=100; i++) {
    			 sum += i;
    		 }
    	 }
    	 void ipM() {
    		 System.out.println("1~100까지 합은" + sum);
    	 }
    	 
   // 	 static void siaM() {
    		 
    	 }
      
}
