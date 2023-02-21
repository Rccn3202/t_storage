package ch02.sec01;

import java.util.Scanner;

public class VarEx3 {

	public static void main(String[] args) {
		/* 아래와 같이 입력합니다
		이름은==> 홍길동
		국어점수==> 100
		영어점수==> 80
		수학점수==> 90

		출력화면
		------------------------
		 이젠 학교 성적표
		------------------------
		홍길동 100 80 90 270 90 1등
		------------------------ */
		//키보드 입력하는 스캐너 객체를 사용합니다
		Scanner sc = new Scanner(System.in);
		//입력하기
		System.out.print("이름은==>");
		String name = sc.next();
		
	    System.out.print("국어점수==>");
	    int kor = sc.nextInt();
	    
	    System.out.print("영어점수==>");
	    int eng = sc.nextInt();
	    
	    System.out.print("수학점수==>");
	    int mat = sc.nextInt();
		
		//합계를 계산하기
	    int total = kor + eng + mat;
	 //   System.out.println(total);
	    	 
	    //평균 계산하기 (소숫점 2째자리까지 표시)
	    double avg = total / 3.0; // 74.6
	 //   System.out.printf("%.2f", avg );
	    
	    //출력하기
	    
	    System.out.println("-----------------------------");
	    System.out.println("        이젠 학교   개발자:정현희  ");
	    System.out.println("-----------------------------");
	    System.out.println(name + " " + kor +" " + eng + " " + mat +" " + total + " " + avg + " " + "1등");
	    
		
		
	}
}
