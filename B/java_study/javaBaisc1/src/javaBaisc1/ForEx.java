package javaBaisc1;

import java.util.Scanner;

public class ForEx {
  /*  형식
   *  for( 변수초기값  ;  조건식 ;  증감값 ){
   *      반복할 내용
   *   }
   */
	public static void main(String[] args) {
		for( int i=1; i<=10; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=10; i >= 0 ; i-- ) {
			System.out.print(i + " ");
		}
		int a=5;
		for( ; a<10 ; a++ ) {
			System.out.print( a );
		}
		// 문1) 10 20 30 40 .. 100을 출력하기
		System.out.println();
		for(int i=10; i<=100; i+=10 ) {
			System.out.print(i + " ");
		}
		// 문2) 1~100까지 합 구하기 답 5050
		System.out.println();
		int sum = 0;
		for(int i=1; i<=100 ; i++) {
			sum = sum + i;
		}
		System.out.println("1~100까지의 합은 " + sum);
		
		// 문3) 0~100까지 홀수의 합 구하기, 홀수의 갯수 구하기 1 3 5 sum = sum + odd  cnt = cnt + 1
		int oddSum=0;//홀수의 합
		int oddCnt=0;//홀수의 갯수
		for( int odd = 1; odd < 100; odd=odd+2 ) {
			oddSum = oddSum + odd;
			oddCnt = oddCnt + 1;
		}
		System.out.println("1~100까지 홀수의 합은 " + oddSum);
		System.out.println("1~100까지 홀수의 갯수는 " + oddCnt);
		// 문4) 1~100까지 출력하되 1줄에 10개씩 출력하기
		// 
		int cnt =0;
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			cnt++;
// 방법1	 방법 갯수를 10개씩 세어서 10개 줄바꿈하기		
//			if(cnt == 10) {
//				System.out.println();
//				cnt = 0;
//			}
// 방법2  10의 배수일 때 줄바꿈을 해라
			if( i % 10 == 0 ) {
				System.out.println();
			}
		}
		System.out.println();
		int k=32;
		System.out.println( k % 10 == 0 );  //
		
		/* 문5) while 아래와 같이 출력해 보세요.(12345)를 입력 한 것임
   		결과화면
		숫자를 입력하세요. (예:12345) ==> 12345
		sum = 5 number = 12345
		sum = 9 number = 1234
		sum = 12 number = 123
		sum = 14 number = 12
		sum = 15 number = 1
 		각 자리수의 합 : 15
		*/
		System.out.println("결과화면");
		Scanner sc = new Scanner(System.in);
		System.out.print(" 숫자를 입력하세요. (예:12345) ==> ");
		int number = sc.nextInt(); 
		int number1=0;//맨 뒷자리 숫자를 얻기 위해서  1234를 만든다
		int temp=0;
		int s=0;
		while(number >= 1) {
			number1 = number / 10; //1234
			temp = number1 * 10; //12340
			s = s + number - temp; // 12345 - 12340 = 5
			System.out.println("sum = " + s + " number = " + number);
			number = number1; // 1234
		}
		
		// sum변수에 5를 넣어 주기   12345 - 12340   = 5   12340나오게? 1234 * 10  1234나오게? 12345 / 10 = 1234
		// System.out.println(number);
		
		// int number1 = number / 10;
		// System.out.println(number1);
		// int temp = number1 * 10;
		// System.out.println(temp);
		// int s = number - temp;
		// System.out.println("sum = " + s + " number = " + number);
		// number = number1; // 1234
		
		//number1 = number / 10; //123
		// System.out.println(number1); //123
		// temp = number1 * 10;//1230
		// System.out.println(temp); //1230
		// s = s + ( number - temp) ;//1234 - 1230 =4
		// System.out.println("sum = " + s + " number = " + number); // sum = 9 number = 1234
		
		
		/*문6) do~while 숫자를 계속 입력받는다 0을 입력하면 지금까지 입력한 숫자를 모두 더한 것을 출력한다. 반복문을 이용한 계산하기
          합계를 구할 숫자를 입력하세요(끝내려면 0을 입력)
          100 //(입력수)
          200 //(입력수)
          300 //(입력수)
          400 //(입력수)
          0 //(입력수)
          합계:1000 //(출력)
		 * 
		 * */
		
		 int n6;
		 int sum6=0;
		 do {
			 System.out.println("문제6번 숫자를 입력하세요"); 
			 n6=sc.nextInt();
			 sum6 = sum6 + n6;
		 }while(n6 !=  0);
		 System.out.println("합계:" + sum6);
		
  }//end main
}//end class
