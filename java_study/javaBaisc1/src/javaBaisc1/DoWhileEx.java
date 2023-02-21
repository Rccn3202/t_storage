package javaBaisc1;

import java.util.Scanner;

public class DoWhileEx {
	
	public static void main(String[] args) {
		/*
		do {
			//반복할 내용쓰기
		}while(조건문);*/
		
		//문1) 1 2 3 4 .. 10
		int a=1;
		do{
			System.out.print(a+" ");
			a++;
		}while(a<=10);
		
		//문2) 100 95 90 ... 0
		System.out.println();
		int a2 = 100;
		do {
			System.out.print(a2+" ");
			a2=a2-5;
		}while(a2>=0);
		
		//문3) 1~100까지의 합 5050을 출력하기
		System.out.println();
		int a3=0;
		int sum=0;//합계 구하는 변수
		do {
			a3++;
			sum = sum + a3; 
		}while(a3 < 100);
		System.out.println(sum);
		//문4) 1~100까지 짝수의 합을 구하기 2 4 6 8 10 
		System.out.println();
		int a4=0;
		int evenSum=0;
		do {
			a4=a4 + 2;
			evenSum = evenSum + a4;
		}while(a4<100);
		System.out.println(evenSum);
		//문5) 1 1 2 3 5 8 13 21 34 
		int a5=1;
		int b=1;
		int s = a5 + b;
		System.out.print(a5 + " " + b + " " +s+ " ");
		
		do {
			a5 = b; 
			b = s; 
			s = a5 + b;
			System.out.print(s+ " ");
		}while(s<34);
		
		//문6) 이름을 입력을 계속 받아서 출력하는데 이름이 y이면 종료하기
		Scanner sc = new Scanner(System.in);
		String name = null;
		do {
		    System.out.println("이름을 입력하세요==>");
		    name = sc.next();
		    System.out.println(name);
		}while( !name.equals("y") );
		
	}//end main
}//end class
