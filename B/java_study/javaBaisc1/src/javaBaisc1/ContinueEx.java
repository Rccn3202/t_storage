package javaBaisc1;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		// 반복문(while, do~while, for)이나 조건문(if문, switch~case문)을 제어문이라고 한다. 
        //break문-제어문의 한 칸 밖으로 빠져 나가라, conitnue문
		int a=10;
		
		switch( a ) {
		  case 1: System.out.println("일입니다"); break;
		  case 5: System.out.println("오입니다"); break;
		  case 10: System.out.println("십입니다"); break;
		  default : System.out.println("일 오 십을 제외한 다 입니다");
		}
		
		// 토끼 - 산에 삽니다. 거북이 - 바다에 삽니다. 개-평지에 삽니다. 그외 것은 - 집에 삽니다
		String animal="아기";
		switch( animal ) {
		  case "토끼" : System.out.println("산에 삽니다"); break;
		  case "거북이" : System.out.println("바다에 삽니다"); break;
		  case "개" : System.out.println("평지에 삽니다"); break;
		  default : System.out.println("집에 삽니다"); break;
		}
		// 문) 숫자 3개를 입력받아서 평균을 구한 후 90점이상이면 A학점 80점이상이면 B학점 .. F학점이라고 출력하기 
		// if문, switch~case문  
         Scanner sc = new Scanner(System.in);
         int cnt=0; //입력 받은 점수 갯수 세어 주는 변수
         int number1;
         int sum=0;
         while( cnt < 3) {
        	 System.out.print("점수는==>");
        	 number1 = sc.nextInt();
        	 sum = sum + number1;
        	 cnt++;
         }
         System.out.println("\n합계는 ==>" + sum);
         int avg = sum / cnt;
         System.out.println("평균는 ==>" + avg);
         System.out.println("과목 갯수는 ==>" + cnt);
         String hakjum=null;
         if(avg >= 90)
        	 hakjum = "A";
         else if(avg>=80)
        	 hakjum = "B";
         else if(avg>=70)
        	 hakjum="C";
         else if(avg>=60)
        	 hakjum="D";
         else 
        	 hakjum="F";
         System.out.println("학점는(if) ==>" + hakjum);
        	 
         switch( avg / 10) {
            case 10:
            case 9:  hakjum = "A"; break;
            case 8:  hakjum = "B"; break;
            case 7:  hakjum = "C"; break;
            case 6:  hakjum = "D"; break;
            default :	 hakjum = "F"; break;
      
         }
         System.out.println("학점는(switch) ==>" + hakjum);
	}
}
