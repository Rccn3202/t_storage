package javaMid10.p468;

public class ExceptionEx5 {

	public static void main(String[] args) {
		try {
		      A a = new A();
		      a.a1();
		    } catch (ArithmeticException | ArrayIndexOutOfBoundsException  | ClassNotFoundException  e) {
		    	if( e instanceof ArithmeticException ) {
		    	    System.out.println("���������� Ʋ��" + e.getMessage() );
		    	} else if (e instanceof ArrayIndexOutOfBoundsException) {
		    		System.out.println("�迭�� �ε��� ������ Ʋ��" + e.getMessage() );
		    	} else if ( e instanceof ClassNotFoundException) {
		    		System.out.println("Ŭ�������� ��Ű����� Ŭ�������� Ʋ��" + e.getMessage());
		    	}
		    } catch( Exception e) {
		    	System.out.println(" ��� ���� ó���� / ����ġ ���� ���ܹ߻�");
		    } finally {
		    	System.out.println( " ���ܿ� ������� ó���ؾ� �ϴ� �ڵ� ");
		    }
         
	}

}
