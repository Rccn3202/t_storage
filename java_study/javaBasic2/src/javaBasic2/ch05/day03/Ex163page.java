package javaBasic2.ch05.day03;

public class Ex163page {

	public static void main(String[] args) {
		// ���ڿ� 
		String board="��ȣ0,����0,����0,�۾���0";
		String board1="��ȣ1 ����1 ����1 �۾���1";
		String board2="��ȣ2-����2-����2-�۾���2";
		String board3="��ȣ3:����3:����3:�۾���3";
		
		String[] b1 = board.split(",");
		System.out.println( b1[0] );
		System.out.println( b1[1] );
		System.out.println( b1[2] );
		System.out.println( b1[3] );
	//	System.out.println( b1[4] );
		
		String[] b2 = board1.split(" ");
		System.out.println( b2[0] );
		System.out.println( b2[1] );
		System.out.println( b2[2] );
		System.out.println( b2[3] );
		
		String[] b3 = board2.split("-");
		System.out.println( b3[0] );
		System.out.println( b3[1] );
		System.out.println( b3[2] );
		System.out.println( b3[3] );
		
		String[] b4 = board3.split(":");
		System.out.println( b4[0] );
		System.out.println( b4[1] );
		System.out.println( b4[2] );
		System.out.println( b4[3] );
		
		String spn = "ȫ�浿-20��,�̼���-25��,�ֿ�-30��";
		String[] spn1 = spn.split(",");
		String[] spn2 = spn1[0].split("-");
		System.out.println( spn2[0] );
		System.out.println( spn2[1] );
		
		String[] spn3 = spn1[1].split("-");
		System.out.println( spn3[0] );
		System.out.println( spn3[1] );
		
		String[] spn4 = spn1[2].split("-");
		System.out.println(spn4[0]);
		System.out.println(spn4[1]);
		
	}

}
