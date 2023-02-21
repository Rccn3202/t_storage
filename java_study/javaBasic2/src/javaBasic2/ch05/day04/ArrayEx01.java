package javaBasic2.ch05.day04;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 165 
		int a1[];
		int[] a2;
		
        //배열안에 값을 넣기
		// 1. 초기값으로 넣기  2. 배열 만들어 놓고 필요하면 넣어 준다.
		int[] a3 = { 1,2,3,4,5,6 };
		System.out.println( a3[0] );
		for(int i=0; i < a3.length ; i++) {  //i=0,1,2,3,4,5
			System.out.print( a3[i] + " ");
		}
		System.out.println();
		System.out.println( "배열의 길이(크기) "+ a3.length  );
		//향상된 for( 자료형 변수 : 배열명 ) 배열에 있는 원소들 한개씩 꺼내서 앞에 변수 넣는다.
		// 마지막까지 꺼내서 변수넣어주면 더 이상 반복하지 않는다
		for( int a :  a3) {
			System.out.print( a + " ");
		}
		System.out.println();
		
        //문) 1.1, 3.3, 5.4, 10.3, 8.9, 11.23  배열에 넣기 10.3 - 3.3
		double[] a4 = { 1.1, 3.3, 5.4, 10.3, 8.9, 11.23 };
		System.out.println( a4[3] - a4[1] );
		//전체 출력하기
		for( int i=0; i< a4.length ; i++) {
			System.out.print( a4[i] + " ");
		}
		System.out.println();
		for( double a : a4) {
			System.out.print( a + " ");
		}
		System.out.println();
				
		//문) true, false, false, true, true, false, false, true
		//    제일 마지막에 있는 true를 찍어 보세요
		boolean[] a5= { true, false, false, true, true, false, false, true};
		System.out.println( a5[7]);
		for( int i=0; i< a5.length ; i++) {
			System.out.print( a5[i] + " ");
		}
		System.out.println();
		for( boolean a : a5) {
			System.out.print( a + " ");
		}
		System.out.println();

		//문) "돈까스", "김밥", "떡뽁이", "피자" 출력은 김밥, 떡뽁이를 출력하세요
		String[] a6= { "돈까스", "김밥", "떡뽁이", "피자"  };
		System.out.println( a6[1] + " " + a6[2]);
		for( int i=0; i< a6.length ; i++) {
			System.out.print( a6[i] + " ");
		}
		System.out.println();
		for( String a : a6) {
			System.out.print( a + " ");
		}
		System.out.println();
				
	}

}
