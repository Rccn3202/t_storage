package javaMid11.q6;

public class ExceptionEx06 {

	public static void main(String[] args) {
		String[] strArray= {"10", "2a"};
		int value=0;
		for(int i=0; i<=2; i++) {
		  try {	
			value = Integer.parseInt(strArray[i]);
		  } catch( ArrayIndexOutOfBoundsException e) {
			  System.out.println( "�ε��� ������ �ʰ��߽��ϴ�.");
		  } catch (NumberFormatException e) {
			  System.out.println("���ڷ� ��ȯ�� �� ����");
		  } finally {
			System.out.println(value + 100);
		  }
		}

	}

}
