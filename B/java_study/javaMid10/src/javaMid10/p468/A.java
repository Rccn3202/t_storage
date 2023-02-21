package javaMid10.p468;

public class A {
  public void a1() throws ArithmeticException, ArrayIndexOutOfBoundsException, ClassNotFoundException {
	     a2();
	     Class.forName("java.util.String");
   }
   void a2() throws ArithmeticException, ArrayIndexOutOfBoundsException {
	   a3();
	   int[] number = {1,2,3};
	   System.out.println( number[6] );
   }
   int a3() throws ArithmeticException {
		 
	        int a=10/0;
	        return 100;
	  
   }
}
