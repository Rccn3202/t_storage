package javaBaisc1;

import java.util.Scanner;

public class Ch04Ex {

	public static void main(String[] args) {
		// 4장 확인문제
		//문4) 
		while( true ) {
		   int a1 = ( (int) (Math.random() * 6 ) ) + 1;
		   int a2 = ( (int) (Math.random() * 6 ) ) + 1;
		
 		   if( (a1 + a2) == 5 ) {
 			   System.out.println("(" + a1 + ", " + a2 + ")" );
 			   break;
 		   }
		}
		
		//문5)
		for(int  x=1; x<=10 ; x++) {
			for(int y=1; y<=10; y++) {
				if( 4 * x  + 5 * y == 60 ) System.out.println( "(" + x + "," + y + ")" );
			}
		}
		
		//문6)
		// *
		// **
		// ***
		// ****
		// *****
		
		//힌트 System.out.print("*"); 반복한다 
		for(int i=1;i<=5; i++) {
			for(int j=1; j<= i ; j++) {  // 1째줄 : 1번반복 2째줄 : 2번반복 3째줄 : 3번반복
				System.out.print("*");
			}
			System.out.println();
		}
	
		//교재 연습문제
		// while문과 Scanner의 next()를 이용하여 다음과 같이 만들어 보세요.
		// --------------------------------
		// 1. 예금 | 2. 출금 | 3. 잔고 | 4 종료
		// ---------------------------------
		// 1을 치면 예금 2를 치면 출금 3을 치면 잔고 4를 치면 종료 

		Scanner sc = new Scanner(System.in);
		System.out.println("---------------");
		System.out.println(" 은행 거래 프로그램");
		System.out.println("---------------");
		System.out.println();
		
		String choice = null;
		int money=0;//입력 받는 돈
		int balance=0;//잔액 
		String bankNumber=null;//계좌번호
		
		while( true ) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 이체 | 0. 종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			choice = sc.nextLine();
			
			switch( choice ) {
			   case "1":{ System.out.print("예금액>");
				          money = sc.nextInt();
				          sc.nextLine();
				          balance = balance + money;
				          break;
			             }
			   case "2": { System.out.print("출금액>");
			               money = sc.nextInt();
			               sc.nextLine();
			               //잔액보다 출금액이 크면 잔액부족입니다 라고 출력하시오.
			               if( balance < money) {
			            	   System.out.println("잔액 부족입니다");
			               } else {
			            	   balance = balance - money;
			               }
          
			               break;
			              }
			   case "3": { System.out.print("잔고>");
				           System.out.print(balance);
				           System.out.println();
				           break;
			             }
			   case "4" : { //이체할 계좌번호> 이체할금액> 이체를 해주고  00계좌로 00금액이 이체됐습니다 잔액은 00입니다.
				            System.out.print("이체할 계좌번호>");
				            bankNumber=sc.nextLine();
				            System.out.print("이체할 금액>");
				            money=sc.nextInt();
				            sc.nextLine();
				            if(balance < money) {
				            	System.out.println("잔액 부족으로 이체할 수 없습니다");
				            }else {
				            	balance = balance - money;
				            	System.out.println( bankNumber +"계좌로 " + money + "금액이 이체되었습니다. 잔액은 " + balance + "입니다.");
				                
				            }
				            break;
			              }
			   case "0": System.out.println("프로그램 종료"); break; 
			   default : System.out.println("숫자를 잘못치셨어요. 다시 입력하세요.");
			}
		  // System.out.println("이곳은 while속이야 ~~");	
		  if(  choice.equals("0")  )  break;
		}
	}
}
