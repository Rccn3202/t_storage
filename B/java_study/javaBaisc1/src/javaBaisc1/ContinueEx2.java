package javaBaisc1;

import java.util.Scanner;

public class ContinueEx2 {

	public static void main(String[] args) {
		// 1~100까지 for문으로 출력해 보기
	/*	for(int i=1; i<=100; i++) {
			System.out.print( i + " ");
		}
         System.out.println();
		//1~100을 10번 찍고 싶다
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=100; j++) {
				System.out.print( j + " ");
			}
			System.out.println();
		}
		
		// 홍길동 20번 출력
		for( int i=1; i<=20; i++) {
			System.out.print("홍길동" + " ");
		}
		System.out.println("\n------------");
		//홍길동 20번 출력한 줄을 5번 반복 하세요
		for(int i=1; i<=5; i++) {
			for( int j=1; j<=20; j++) {
				System.out.print("홍길동" + " ");
			}
			System.out.println();
		} */
		//1~50 출력하기 1~50까지의 합을 구하기 합이 500이상이 되는 순간 i값은 얼마인가요?
		System.out.println("------");
		int sum=0;
		int i=1;
		for( ;  i<=50; i++) {
			System.out.print(i+" ");
		    sum = sum + i;
		    if(sum>=500) break;
		}
		System.out.println("\n sum= " + sum + " i= " + i);
		
		//문 1~100까지 반복하여 출력하고 55일 때 break 반복 탈출하기
		System.out.println("------");
		for(int j=1; j<=100; j++) {
			System.out.print(j + " ");
			if(j == 55) break;
		}
		System.out.println("======");
		//문 10, 20, 30, ... 1000까지 반복하면서 갯수가 20번째 일 때 탈출하여 해당항목 출력하기
		System.out.println("------");
		int cnt=0;
		int j=10;
		for(; j<=1000; j+=10) {
			System.out.print(j + " ");
			cnt++;
			if(cnt==20) break;
		}
		System.out.println( j + " 20번째 숫자" );
		System.out.println("======");
		
		//문 while문 이용
		//정수로 입력을 계속 받다가 0 이 입력되면 반복문 끝나기
		Scanner sc = new Scanner(System.in);
		while( true ) {
			int number = sc.nextInt();
			if(number==0) break;
		}
	
		//문 do~while문 이용
		//문자로 단어를 계속 입력 받다가 no 또는 NO  No nO 가 입력 되면 반복문 끝나기
		// no문자을 모두 대문자로 바꿔라 모두 소문자 
        do {
        	String word = sc.next();
        	if( word.toLowerCase().equals( "no"  )  ) break;
        }while( true );
		
		
		
		
		
		
	}
}
