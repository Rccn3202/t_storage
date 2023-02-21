package javaMid3.p297;

public class CC extends BBB{
	
   public long mul(int number) {
	   long m=1;
	   for(int i=1;i<=number; i++) {
		   m = m * i;
	   }
	   return m;
   }
	
}
