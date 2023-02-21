package javaMid3.p297;

public class BBB {
   int s=0;	
   
   public int sum(int number) {
	   for(int i=1; i<=number; i++) {
		   s = s + i;
	   }
	   return s;
   }
   
   public int dif(int number) {
	   return s-number;
   }
   
}
