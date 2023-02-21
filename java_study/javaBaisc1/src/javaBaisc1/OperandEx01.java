package javaBaisc1;

import java.util.Scanner;

public class OperandEx01 {

	public static void main(String[] args) {
		// 연산자1 ++a 전위 단항 연산자 a-- 후위 단항 연산자 12시 10분 쉬기
        // 연산자2 (a=a+1 a+=1) (a=a+2 a+=2)   (a=a+b  a+=b) (a=a-10  a-=10) (a = a* b a*=b) 
		//        
		int a=10;
		
        //11을 출력해보세요
        // a = a+1;
        // a++;
        // ++a;
        // System.out.println(a);

        //9을 출력하기
        // a=a-1;
        //a--;
        //--a;
        //System.out.println(a);
        
        int b,c;
        //b변수에 11을 넣어서 출력해 주세요
        
        // b= ++a; //a=a+1 b=a  // 11 11
        b = a++; //b=a a=a+1  // 10 11
        System.out.println(a+ " " + b); 
        
        int d=20;
       // System.out.println(++d);//d=d+1 출력 21
        System.out.println(d++); //출력하고 d=d+1
        System.out.println(d);
      
        // 연산자2 (a=a+1 a+=1) (a=a+2 a+=2)   (a=a+b  a+=b) (a=a-10  a-=10) (a = a* b a*=b) 
        int e=10;
       // e = e - 8;
        e-=8;
        System.out.println(e);
        
        //연산자3
        //나누기  25/5=5 25/4 = 6.25
        int v1=25;
        int v2=4;
        System.out.println(v1/v2); //6이 나온다 왜? 정수/정수=정수 
        //생각하기 1. 자료형을 실수로 만들기 
        System.out.println(v1/(double) v2);
        //생각하기 2. 자료형은 정수로 그대로 하고 2500 / 500 = 625를 구하고 625 / 100을 출력한다.
        //v1 = v1 * 100;
        v1 *= 100;
        //v2 = v2 * 100;
        System.out.println( v1 /(double) v2 / 100  );
        // >> 우측 쉬프트연산자 << 좌측 쉬프트연산자 >>> 	우측 쉬프트연산자 2의배수로 곱하거나 더할 때 사용하는 연산자
        int v3 = 0b1011; //10진수 11이다 
        v3 = v3 >> 2; //원래숫자 / 2^2  11 / 4 
        
       // v3 = v3 << 3; //원래숫자 * 2^3
        System.out.println(v3 ); // 1011
        
        //관계연산자 > 초과, >= 이상, < 미만, <= 이하, == 같다, != 같지 않다 
        int v4=100;
        System.out.println(v4 != 200);
        
        //비트 연산자 이용 - 과학분야 전자분야 주로 사용합니다
        int v5 = 0b01011; //1 true 0 false
        int v6 = 0b10111;
        System.out.println( Integer.toBinaryString(v5 & v6) ) ;  // 00011
        System.out.println( Integer.toBinaryString(v5 | v6) ) ; //11111
        System.out.println( Integer.toBinaryString(v5 ^ v6) ) ;
        
        //대입연산자 = 우변에 있는 값을 좌변(변수만 나와야 함)에 넣으세요 
        int v7 = 200;
        
       // int 200 = v7; X
        int v8 = v2+200;
       // int v2 + 200 = v8; X
        
        //삼항연산자    (조건)  ?  참:거짓
        int v9=15;
        System.out.println(  (v9==10) ?  "합격" : "불합격");
        
        String type="B";
        String result;
        result = (type.equals("A"))  ? "VIP고객입니다" : "일반고객입니다";
        System.out.println(result);
        
        //문제 숫자 변수에 50을 입력하고 25이상이면 "포인트대상" 아니면 "포인트 대상이 아닙니다"라고 출력하기
        int n=50;
    /*    if(n>=25)
        	System.out.println("포인트대상");
        else
        	System.out.println("포인트대상이 아닙니다"); */
        
        System.out.println( (n>=25) ? "포인트대상":"포인트대상이 아닙니다" );
        
        //문제 문자형 변수에 "자바"라고 입력하고 자바가 아니면 "B교실,C교실입니다." 자바이면 "A교실입니다"라고 출력하기
        String word="자바";
        if( word.equals("자바") )
        	System.out.println("A교실");
        else 
        	System.out.println("B,C교실입니다");
        String result1 = (word.equals("자바"))? "A교실":"B,C교실입니다";
        System.out.println(result1);
        
        //문제 숫자 2개를 입력 받아서 큰 숫자를 출력하기 삼항연산자 사용하기
  /*      Scanner sc = new Scanner(System.in);
        System.out.print("숫자1를 입력==>");
        int number1 =  sc.nextInt();
        System.out.print("숫자2를 입력==>");
        int number2 =  sc.nextInt();
        int maxNumber = (number1 >= number2 )   ? number1 : number2;
        System.out.println(maxNumber); */
        
        
        
        //문제 숫자3개를 입력받아서 작은 숫자를 출력하기 삼항연산자 사용하기
 /*       System.out.print("숫자1를 입력==>");
        number1 =  sc.nextInt(); //10   300
        System.out.print("숫자2를 입력==>");
        number2 =  sc.nextInt(); //20    150
        System.out.print("숫자3를 입력==>");
        int number3 =  sc.nextInt(); //30  250
        
        maxNumber = ( number1 >= number2 ) ? number1: number2; //20  300 
        maxNumber = (maxNumber >= number3 ) ? maxNumber:number3;//30  300
        System.out.println(maxNumber); */
        
        //문제 숫자3개를 입력받아서 중간 숫자를 출력하기 
        //maxNumber minNumber 것이 아니면 중간 숫자
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1를 입력==>");
        int number1 =  sc.nextInt(); //10   300
        System.out.print("숫자2를 입력==>");
        int number2 =  sc.nextInt(); //20    150
        System.out.print("숫자3를 입력==>");
        int number3 =  sc.nextInt(); //30  250
        
        int maxNumber = ( number1 >= number2 ) ? number1: number2; //20  300 
        maxNumber = (maxNumber >= number3 ) ? maxNumber:number3;//30  300
        
        int minNumber = ( number1 <= number2 ) ? number1: number2; //20  300 
        minNumber = (minNumber <= number3 ) ? minNumber:number3;//30  300
        
        //경우의수 10 5 20, 5 10 20, 5 20 10 
        int midNumber=0;//중간값을 넣을 변수 
        if( number1 != maxNumber && number1 != minNumber ) 
        	midNumber = number1;
        if( number2 != maxNumber && number2 != minNumber) 
        	midNumber = number2;
        if( number3 != maxNumber && number3 != minNumber) 
        	midNumber = number3;
        
        System.out.println("최대값은 " + maxNumber);
        System.out.println("중간값은 " + midNumber);
        System.out.println("최소값은 " + minNumber);
  /*      
        System.out.println("숫자1 입력:");
        int e6 = sc.nextInt();
        System.out.println("숫자2 입력:");
        int e7 = sc.nextInt();
        System.out.println("숫자3 입력:");
        int e8 = sc.nextInt();	
        System.out.println((e6>=e7)?((e6>=e8)?((e7>=e8)?e7:e8):e6):((e6>=e8)?e6:((e7>=e8)?e8:e7)));

        System.out.print("첫번째 숫자를 입력하세요 : ");
		int number11 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int number22 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		int number33 = sc.nextInt();

		int result11 = (number11 <= number22) ? number11 : number22;
		int min = (result11 <= number33) ? result11 : number33;
		
		int result22 = (number11>= number22) ? number11 : number22;
		int max = (result22 >= number33) ? result22 : number33;
		int mid = (number11!= min && number11 != max) ? number11: ((number22 != min && number22 != max) ? number22 : number33);
		
		System.out.println(mid);
*/
	}

}
