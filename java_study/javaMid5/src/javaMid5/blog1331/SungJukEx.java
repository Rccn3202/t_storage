package javaMid5.blog1331;

import java.util.Scanner;

public class SungJukEx {
	
	static Scanner sc=null; //전역변수 모든 메소드에서 이용할 수 있음
    
	static SungJukBusiness sb;
	public static void main(String[] args) {
		SungJuk e1 = new ElementaryStudent();
		SungJuk m1 = new MiddleSchooler();
		SungJuk h1 = new HighSchoolStudent();
		sb = new SungJukBusiness();
		boolean end=false;
		sc = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("----------------------------------");
			System.out.println("1. 초등학교 2. 중학교 3. 고등학교 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			menu = sc.nextInt();
			switch(menu) {
				case 1: elementaryStudent( e1 ); break;
				case 2: middleSchooler( m1 ); break;
				case 3: heighSchoolerStudent( h1 ); break;
				case 4: end = true; break;
				default : System.out.println("메뉴가 잘못됨(1~3)");
			}
		}while( !end );
     }

	private static void heighSchoolerStudent(  SungJuk h1 ) {
		// TODO Auto-generated method stub
		int menu=0;
		boolean end=false;
		do {
			System.out.println("------------------------");
			System.out.println("고등학교 성적관리 프로그램 ");
			System.out.println("------------------------");
			System.out.println("1. 입력 2. 출력 3. 메인돌아가기");
			System.out.println();
			System.out.print("선택>");
			menu = sc.nextInt();
			switch(menu) {
				case 1: sb.input( h1 );break;
				case 2: sb.print( h1 ); break;
				case 3: end=true; break;
			}
		}while( !end ); 
	}

	private static void middleSchooler( SungJuk m1 ) {
		// TODO Auto-generated method stub
		int menu=0;
		boolean end=false;
		do {
			System.out.println("------------------------");
			System.out.println("중학교 성적관리 프로그램 ");
			System.out.println("------------------------");
			System.out.println("1. 입력 2. 출력 3. 메인돌아가기");
			System.out.println();
			System.out.print("선택>");
			menu = sc.nextInt();
			switch(menu) {
				case 1: sb.input( m1 );break;
				case 2: sb.print( m1 ); break;
				case 3: end=true; break;
			}
		}while( !end ); 
	}

	private static void elementaryStudent( SungJuk e1 ) {
		// TODO Auto-generated method stub
		// 메뉴을 띄우고 입력 받기 
		int menu=0;
		boolean end=false;
		do {
			System.out.println("------------------------");
			System.out.println("초등학교 성적관리 프로그램 ");
			System.out.println("------------------------");
			System.out.println("1. 입력 2. 출력 3. 메인돌아가기");
			System.out.println();
			System.out.print("선택>");
			menu = sc.nextInt();
			switch(menu) {
			case 1: sb.input( e1 );break;
			case 2: sb.print( e1 ); break;
			case 3: end=true; break;
			}
		}while( !end ); 		
	}

}

/*
1. 기본설계
  부모클래스 : 과목명, 점수, 중간고사, 기말고사, 수행평가
  자식클래스 : 초등학생 - 부모클래스 그대로 상속
            중학생 - 부모클래스 상속, 담당교사, 출석점수, 봉사점수
            고등학생 - 부모클래스 중학생 상속, 표준편차
  비즈니스 클래스 : 입력받기, 점수 합산하기, 출력하기
  메인 클래스 : 비즈니스 클래스 호출하기, 시작 메뉴 화면 만들기, 비즈니스 클래스 메소드 호출하기

2. 상세설계
   SungJuk.java : subject,score, midtermExam, finals, performanceEvalution
   ElementaryStudent.java - 초등학생
   MiddleSchooler - 중학생 teacher 담당교사, attendance - 출석, service-봉사 
   HighSchoolStudent - 고등학생 standardDeviation - 표준편차
*/



