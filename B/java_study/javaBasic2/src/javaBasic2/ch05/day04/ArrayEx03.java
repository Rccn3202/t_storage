package javaBasic2.ch05.day04;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 2. 배열을 먼저 만들어 두고 나중에 값을 넣기
		int[] a1 = new int[5];
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		a1[3]=40;
		a1[4]=50;
		for(int a : a1) {
			System.out.print( a + " ");
		}
		System.out.println();
        //키보드로 정수 5개를 입력 받습니다. 합을 구하고 합계 출력합니다
		// 배열명 a2 
		Scanner sc = new Scanner(System.in);
		int[] a2 = new int[5];
		int sum=0;
		for(int i=0; i< a2.length ; i++) {
			System.out.println( (i+1 )+ "번째 숫자 입력 >" );
			a2[i] = sc.nextInt();
			sum = sum + a2[i];
		}
		System.out.println(sum );
		//입력 받은 숫자중에서 가장 큰 숫자는? 
		//입력 받은 숫자중에서 가장 작은 숫자는?
		int max=0;
		int min=9999;
		
		for(int i=0; i<a2.length; i++) { //i=0,1,2,3,4
			if( max < a2[i]) max = a2[i];
			if( min > a2[i]) min = a2[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		//오름차순으로 정렬하세요.
		int temp;
		for(int i=0; i < a2.length - 1; i++) { //i=0 1 2 3 기준에 해당되는 반복 
			for(int j = i ; j < a2.length ; j++) {  //비교대상  j=0,1,2,3,4 / j=1,2,3,4/
				if( a2[i] > a2[j]) {
					temp = a2[i];
					a2[i] = a2[j];
					a2[j] = temp;
				}
			}
			
			System.out.println( (i + 1) + "회 정렬==>");
			for( int a: a2) {
				System.out.print( a + "  ");
			}
			System.out.println();
		}
		
		
		//내림차순으로 정렬하세요.
		
	}
}
