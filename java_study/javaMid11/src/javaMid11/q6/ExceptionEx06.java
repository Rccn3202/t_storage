package javaMid11.q6;

public class ExceptionEx06 {

	public static void main(String[] args) {
		String[] strArray= {"10", "2a"};
		int value=0;
		for(int i=0; i<=2; i++) {
		  try {	
			value = Integer.parseInt(strArray[i]);
		  } catch( ArrayIndexOutOfBoundsException e) {
			  System.out.println( "인덱스 범위를 초과했습니다.");
		  } catch (NumberFormatException e) {
			  System.out.println("숫자로 변환할 수 업음");
		  } finally {
			System.out.println(value + 100);
		  }
		}

	}

}
