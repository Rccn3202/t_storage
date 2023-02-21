package javaCh12.ex04;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasePage519 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data="������";
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
	    
	    //������ �޸� ���� ����.
	    //������ �߰��� �߰��ϰų� ������ �� �ð� �ҿ�� �� �ִ�.
	    StringBuilder data2 = new StringBuilder("abc");
	    
	    data2.append("def");
	    System.out.println( data2 );
	    
	    data2.insert(5, "kk");
	    System.out.println( data2 );
	    
	    
	    // StringTokenizerŬ���� ���ڿ��� �����ڿ� ���ؼ� �߶� ���� �̿��� 
	    
	    String data3 = "ȫ�浿,�̼�ȫ&�ڿ��� �̼���-������";
	    //&�� �����ڷ� ����ؼ� ���� �̸��� �и����ּ���
	    //���1  StringŬ���� �̿��ϱ�
	    String[] arr3  = data3.split(",|&| |-");
	    for(String a3  : arr3) {
	    	System.out.println( a3 );
	    }
	    
	    System.out.println( "=====================");
	    //���2 StringTokenizerŬ���� �̿��ϱ�
	    String data4 = "ȫ�浿@�̼�ȫ,�ڿ���@�̼���,������@�̼���,�ڿ���-�̼���*������ �̼���";
	    StringTokenizer st4 = new StringTokenizer(data4, "@|,|-|*| ");
	    System.out.println( "��ū�� ������ "+ st4.countTokens() );
	      
	    while( st4.hasMoreTokens()) {
	    	String token4 = st4.nextToken();
	    	System.out.println( token4);
	    }
	    
	    //����Ŭ���� Wrapper - �⺻���� Ŭ������ ������ Ŭ������ ��Ī�ؼ� �θ��� ��
	    //�ڷ��� �� �⺻�� int byte-Byte char-Character long-Long float-Float double-Double  boolean-Boolean 
	    //�⺻���� �޼ҵ尡 ���� �����ϴ� �׷��� int �⺻���� Ŭ���� ����� �ذ� �޼ҵ� ����� �ذ��� �ִ�. Integer 
	    
	    // int --> Integer �ڽ�
	    // Integer --> int ��ڽ�
	    
	    Integer i=100;
	    int iv = i.intValue();
	    
	    int ii=200;
	    Integer iiv = Integer.valueOf(ii);
	    
	    //��ڽ��ϼ���  double���·� ���弼�� 
	    Double d=3.4;
	    double dv = d.doubleValue();
	    
	    //�ڽ� �ϼ���  Float ���弼��
	    float f=1.2f;
	    Float fv =Float.valueOf(f);
	    
	    
	    
	    
	}

}
