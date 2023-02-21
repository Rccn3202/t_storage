package javaBaisc1;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// 제어문
		//while문 
	/*	int n=5;
		while( n <= 10) {
			//위의 조건이 참이면 이곳을 수행
			System.out.println(n); //5 6 7 8 9 10
			n++; //n=n+1;  6 7 8 9 10 11
		}//end while */
		
		int a=10;
		while( a >= 5) { //참
		   System.out.print(a + " ");  //10	
		   //조건이 끝나야 되니깐 언제가는 거짓이 되게 만들어야 한다
		   a--;
		}	
        //문제 1 2 3 4 5 6 7 8 9 10
		//생각 숫자변수를 만든다. 숫자변수에 1을 초기값으로 넣고 반복문을 만든다.
		//    반복문에서 조건이 10보다 작거나 같을 때까지 반복하고 1개씩 증가하는 코드를 작성한다.
		System.out.println("\n 문제1");
		int a1 = 1;
		while( a1 <= 10) {
			System.out.print(a1 + "\t");
			a1++;
		}
		
		//문제 0 5 10 15 20 ... 100
		System.out.println("\n 문제2");
		int a2 = 0;
		while( a2 <= 100) {
			System.out.print(a2 + "\t");
			a2 = a2 + 5;
		}
		
		//문제 -100 -50 0 50 100
		System.out.println("\n 문제3");
		int a3 = -100;
		while( a3 <= 100) {
			System.out.print(a3 + "\t");
			a3 = a3 + 50;
		}
		
		//문제 ABCDEF...Z까지 출력하기
		//생각 A는 유니코드로 65입니다
		System.out.println("\n 문제4");
		char alph = 'A'; //1글자 저장 유니코드 65
		while( alph <= 'Z') {
			System.out.print(alph + " ");
			alph++;
		}
		
		//학생이름을 3번 반복해서 입력 받고 출력하세요
		Scanner sc = new Scanner(System.in);
	/*	
		System.out.print("학생 이름은 ==>");
		String name = sc.next();
		System.out.println(name);
		
		System.out.print("학생 이름은 ==>");
		name = sc.next(); 
		System.out.println(name);
		
		System.out.print("학생 이름은 ==>");
		name = sc.next(); 
		System.out.println(name);
	*/
		//이것을 반복문으로 고치면 1회 처리한 것을 세어주는 변수(cnt)가 필요함
		// 조건문을 무엇을 할까? 조건식을 생각 cnt변수가 3이면 끝, 처리할 내용?  
		
		int cnt=1; //갯수세기
		int banCnt=3;//반 인원수
		String name = null;
		while(cnt <= banCnt) {
			System.out.print("학생 이름은 ==>");
			name = sc.next(); 
			System.out.println(name);
			cnt++;
		}
	}//end main()
}//end class 
