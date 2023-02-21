package javaBaisc1;

public class ContinueEx3 {

	public static void main(String[] args) {
		// 1~50까지 출력하기 10 20 30 40 50 빼고 출력하고 싶다. 10의 배수 20 % 10 == 0 
		System.out.println("\n ------");
		for(int i=1; i<=50 ; i++) { //i가 10일때
			if( i % 10 == 0) continue; // continue의 아래문장으로 가지 말고 반복문의 끝으로 가라. 그리고  다시 반복을 계속해라
			
	    	System.out.print( i + " ");
		}
		
		//100~1까지 출력하기 합계가 500이상인 순간의 항목을 출력하고 1000인 순간의 항목을 출력하고 1500 2000 
		// 출력은 585 95, 1045 90, 1564 84, 2047 78, 2565 71, 3034 64, 
		// 조건문 500이상 1000이상 1500이상 2000이상... 이것을 변수로 만들어 보세요
		System.out.println("\n ------");
		int sum=0;
		boolean p = false;//500이 넘는 순간 1번만 출력해야함. 프린트한 유무 체크하는 변수
		int basu=500;//배수 500 1000 1500 
		
		for(int i=100; i>=0; i--) { // 94
			sum = sum + i; // 679
			if(basu % 500 == 0) { 
				p = false; 
			}
			if( sum >= basu && !p) {  // 585 >= 500  그리고 !false true 674>=1000 &&  true
				System.out.print( " 합계 =" + sum + " 항목 =>" + i );
				p = true;
				basu = basu + 500; // 1000
	   		}
		}
		//문제4
		System.out.println("\n------------");
	//	System.out.println( Math.random() );
		// 난수를 구하는 함수 0.0 <= Math.random() < 1.0
		// 정수 0~9  0 * 6 <=   < 1 * 6
	//	System.out.println( (int) ( Math.random() * 10 ) );
		// 주사위 1~6   0 +1 <=  < 6+1     1<=    <7
		// 1단계 Math.random() -->  (int) ( Math.random() * 6 )   0~5까지 나옴
		// --> (int) ( Math.random() * 6 )  + 1  
		// 1~6까지의 랜덤한 수를 나오게 하려면 (int) ( Math.random() * 6 )  + 1
		// 마지막 숫자 6을 * 곱하고, 시작 숫자를 + 더한다
		
		System.out.println("주사위 ==> "  + ( (int) ( Math.random() * 6 ) + 1 )  ) ;
		
		//동전 앞1 뒤 2
		System.out.println("동전 ==> "  + ( (int) ( Math.random() * 2 ) + 1  ) ) ;
		
		//숫자 1~14까지만 랜덤하게 나오게 하기
		System.out.println("우리반 번호 ==> "  + ( (int) ( Math.random() * 14 ) + 1  ) ) ;
		
		//로또 번호 1~49까지 랜덤하게 나오게 하기
		System.out.println("로또 번호 ==> "  + ( (int) ( Math.random() * 49 ) + 1  ) ) ;
		
		// 1시 20분 쉬기
		
		// 교재 연습문제
		// *
		// **
		// ***
		// ****
		// *****
		  
		//교재 연습문제
		// while문과 Scanner의 next()를 이용하여 다음과 같이 만들어 보세요.
		// --------------------------------
		// 1. 예금 | 2. 출금 | 3. 잔고 | 4 종료
		// ---------------------------------
		// 1을 치면 예금 2를 치면 출금 3을 치면 잔고 4를 치면 종료 
		
		// 12시 30분까지 교재에 있는 확인 문제 풀어보기 
	    
		
		
		
		
		
		
		
		
		
		
		
	}
}
