package javaBasic2.ch05.day02;

import java.util.Scanner;

public class ProjectEx01 {

	public static void main(String[] args) {
		// 조별로 클래스 설계한 것 코딩하기 
       Banchan ban1  = new Banchan();
       inputM(ban1);
       Banchan ban2  = new Banchan();
       inputM(ban2);
       Banchan ban3  = new Banchan();
       inputM(ban3);
       
       ban1.remainFoodM();
       ban2.remainFoodM();
       ban3.remainFoodM();
       
       printM(ban1, ban2, ban3);
       saleBestWestM(ban1, ban2, ban3);
	}
	
	public static void inputM(Banchan ban ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("종류 >");
		ban.kind = sc.next();
		System.out.println("만든 갯수 >");
		ban.makeFood = sc.nextInt();
		System.out.println("판매 갯수 >");
		ban.saleFood = sc.nextInt();
	}
	// Banchan b1 = ban1;
	public static void printM(Banchan b1,  Banchan b2, Banchan b3 ) {
	   	System.out.println(" ===  이젠 반찬가게 매출현황 ==== "); 
        System.out.println("종류   만든갯수   판매갯수   남은갯수");
        System.out.println(b1.kind + "    " + b1.makeFood + "     " + b1.saleFood + "     " + b1.remainFood );
        System.out.println(b2.kind + "    " + b2.makeFood + "     " + b2.saleFood + "     " + b2.remainFood );
        System.out.println(b3.kind + "    " + b3.makeFood + "     " + b3.saleFood + "     " + b3.remainFood );
	}
	//제일 잘 팔리는 것, 제일 안 팔리는 것 판단하는 메소드
	public static void saleBestWestM(Banchan b1,  Banchan b2, Banchan b3) {
		if(b1.perCalc >= b2.perCalc && b1.perCalc >= b3.perCalc) {
			System.out.println("제일 잘 팔린 음식은 >" + b1.kind + " 단위 >" + b1.perCalc);
		}else if(b2.perCalc >= b1.perCalc && b2.perCalc >= b3.perCalc) {
			System.out.println("제일 잘 팔린 음식은 >" + b2.kind + " 단위 >" + b2.perCalc);
		}else if(b3.perCalc >= b1.perCalc && b3.perCalc >= b1.perCalc) {
			System.out.println("제일 잘 팔린 음식은 >" + b3.kind + " 단위 >" + b3.perCalc);	
		}
		
		if(b1.perCalc <= b2.perCalc && b1.perCalc <= b3.perCalc) {
			System.out.println("제일 안 팔린 음식은 >" + b1.kind + " 단위 >" + b1.perCalc);
		}else if(b2.perCalc <= b1.perCalc && b2.perCalc <= b3.perCalc) {
			System.out.println("제일 안 팔린 음식은 >" + b2.kind + " 단위 >" + b2.perCalc);
		}else if(b3.perCalc <= b1.perCalc && b3.perCalc <= b1.perCalc) {
			System.out.println("제일 안 팔린 음식은 >" + b3.kind + " 단위 >" + b3.perCalc);	
		}
		
	}	
}

class Banchan{
	String kind;//종류
	int makeFood;//만든 갯수
	int saleFood;//판매 갯수
    int remainFood;//남은 갯수
    double perCalc;//남은 갯수에 대한 백분율
    
    void remainFoodM() {
    	remainFood = makeFood - saleFood;
    	perCalc = saleFood / (double) makeFood * 100;
    }
    
    
  /*  조별로 
    반찬가게 사장 
    종류      만든갯수   판매갯수  남은갯수
    조림류    10         5               5 
    국류       5           3              2
    샐러드    15        11              4

    제일 잘 팔린 종류  국류
    제일 안 팔린 종류  조림류

    잘팔린 구할 때 백분율 5/10 * 100 */ 
	
}
