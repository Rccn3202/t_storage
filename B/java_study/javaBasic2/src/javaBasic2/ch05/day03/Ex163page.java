package javaBasic2.ch05.day03;

public class Ex163page {

	public static void main(String[] args) {
		// 문자열 
		String board="번호0,제목0,내용0,글쓴이0";
		String board1="번호1 제목1 내용1 글쓴이1";
		String board2="번호2-제목2-내용2-글쓴이2";
		String board3="번호3:제목3:내용3:글쓴이3";
		
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
		
		String spn = "홍길동-20살,이순신-25살,최영-30살";
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
