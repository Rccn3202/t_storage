package javaMid10.p464;

public class ExceptionEx01 {

	public static void main(String[] args) {
		try {
		   System.out.println( 10/0 );
		   //���ܰ� �߻��� ���� �ڵ� �ۼ�
		}catch( ArithmeticException  e ) {
		 //���ܰ� �߻��ϸ� ó���� �ڵ� �ۼ�
			System.out.println( e.getMessage());
			System.out.println("���ܰ� �߻��ߴ�.");
		}finally {
			//���ܿ� ������� ������ ó���Ǵ� �ڵ��ۼ�
			System.out.println("�����ͺ��̽� �ݱ�/ �����ϱ�");
		}
	}
}