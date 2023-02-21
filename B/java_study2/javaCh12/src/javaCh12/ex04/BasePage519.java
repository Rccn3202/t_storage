package javaCh12.ex04;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasePage519 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data="정현희";
		byte[] arr1 = data.getBytes("UTF-8");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		
	    System.out.println( Arrays.toString(arr1) );
        
	    String str1 = new String( arr1, "utf-8" );
	    System.out.println( str1 );
	    
	    byte[] arr2 = data.getBytes("EUC-KR");
	    System.out.println( Arrays.toString(arr2));
	    
	    String str2 = new String(arr2, "euc-kr");
	    System.out.println( str2 );
	    
	    String data1 = "abc";
	    data1 += "def";
	    data1 += "ghi";
	    
	    //장점은 메모리 낭비가 없다.
	    //단점은 중간에 추가하거나 삭제할 때 시간 소요될 수 있다.
	    StringBuilder data2 = new StringBuilder("abc");
	    
	    data2.append("def");
	    System.out.println( data2 );
	    
	    data2.insert(5, "kk");
	    System.out.println( data2 );
	    
	    
	    // StringTokenizer클래스 문자열을 구분자에 의해서 잘라 낼때 이용함 
	    
	    String data3 = "홍길동,이수홍&박연수 이순신-강감찬";
	    //&을 구분자로 사용해서 각각 이름을 분리해주세요
	    //방법1  String클래스 이용하기
	    String[] arr3  = data3.split(",|&| |-");
	    for(String a3  : arr3) {
	    	System.out.println( a3 );
	    }
	    
	    System.out.println( "=====================");
	    //방법2 StringTokenizer클래스 이용하기
	    String data4 = "홍길동@이수홍,박연수@이순신,강감찬@이수민,박연수-이순신*강감찬 이수민";
	    StringTokenizer st4 = new StringTokenizer(data4, "@|,|-|*| ");
	    System.out.println( "토큰의 갯수는 "+ st4.countTokens() );
	      
	    while( st4.hasMoreTokens()) {
	    	String token4 = st4.nextToken();
	    	System.out.println( token4);
	    }
	    
	    //포장클래스 Wrapper - 기본형을 클래스로 만들어둔 클래스를 총칭해서 부르는 말
	    //자료형 중 기본형 int byte-Byte char-Character long-Long float-Float double-Double  boolean-Boolean 
	    //기본형은 메소드가 없다 불편하다 그래서 int 기본형을 클래스 만들어 준것 메소드 만들어 준것이 있다. Integer 
	    
	    // int --> Integer 박싱
	    // Integer --> int 언박싱
	    
	    Integer i=100;
	    int iv = i.intValue();
	    
	    int ii=200;
	    Integer iiv = Integer.valueOf(ii);
	    
	    //언박싱하세요  double형태로 만드세요 
	    Double d=3.4;
	    double dv = d.doubleValue();
	    
	    //박싱 하세요  Float 만드세요
	    float f=1.2f;
	    Float fv =Float.valueOf(f);
	    
	    
	    
	    
	}

}
