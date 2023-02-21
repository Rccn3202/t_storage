package javaBaisc1;

import java.util.Scanner;

public class VarEx5 {
	public static void main(String[] args) {
		System.out.println("---------------------");
	    System.out.println("체질량지수를 구하는 프로그램");
	    System.out.println("---------------------");
	    
	    //키보드 입력 받는 객체 Scanner를 사용하기
	    Scanner sc = new Scanner(System.in);
	    System.out.print("당신의 몸무게는? " );
	    double weight =sc.nextDouble();
	    System.out.print("당신의 키는? " );
	    double height = sc.nextDouble();
//	    System.out.print("당신의 성별 (남자면 true, 여자면 false) 입력하세요? ");
//	    boolean gender =sc.nextBoolean();
	    
	    System.out.println(weight+ " " + height +" " );
	    //체질량지수는	    자신의 몸무게(kg)를	키의 제곱(m)으로 나눈 값입니다.
	    double  bmi = weight / (height * height)  ;
	    System.out.println(bmi);
	/*    
	    if( bmi < 18.5) 
	    	System.out.println("저체중");
	    if( 18.5<= bmi && bmi < 23 )
	    	System.out.println("정상");
	    //과체중 23 <= bmi <25 
	    if( 23 <= bmi && bmi < 25)
	    	System.out.println("과체중");
	    //비만 bmi >= 25 
	    if( bmi >= 25 )
	    	System.out.println("비만");
	  */  
	    if( bmi < 18.5) 
	    	System.out.println("저체중");
	    else if( 18.5<= bmi && bmi < 23 )
	    	System.out.println("정상");
	    //과체중 23 <= bmi <25 
	    else if( 23 <= bmi && bmi < 25)
	    	System.out.println("과체중");
	    //비만 bmi >= 25 
	    else if( bmi >= 25 )
	    	System.out.println("비만");
	    
	    
	}

}
