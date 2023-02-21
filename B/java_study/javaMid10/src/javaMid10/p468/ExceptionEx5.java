package javaMid10.p468;

public class ExceptionEx5 {

	public static void main(String[] args) {
		try {
		      A a = new A();
		      a.a1();
		    } catch (ArithmeticException | ArrayIndexOutOfBoundsException  | ClassNotFoundException  e) {
		    	if( e instanceof ArithmeticException ) {
		    	    System.out.println("수학적으로 틀림" + e.getMessage() );
		    	} else if (e instanceof ArrayIndexOutOfBoundsException) {
		    		System.out.println("배열의 인덱스 범위가 틀림" + e.getMessage() );
		    	} else if ( e instanceof ClassNotFoundException) {
		    		System.out.println("클래스명의 패키지명과 클래스명이 틀림" + e.getMessage());
		    	}
		    } catch( Exception e) {
		    	System.out.println(" 모든 예외 처리함 / 예기치 못한 예외발샘");
		    } finally {
		    	System.out.println( " 예외와 상관없이 처리해야 하는 코드 ");
		    }
         
	}

}
