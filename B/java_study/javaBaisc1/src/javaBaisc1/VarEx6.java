package javaBaisc1;

import java.util.Scanner;

public class VarEx6 {

	public static void main(String[] args) {
		// 이름, 년도 입력 받는다. 나이 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("나이 계산하는 프로그램");
        System.out.println("----------------");
        System.out.print("이름은==> ");
        String name = sc.next();
        System.out.print("당신의 태어난 년도는==>");
        int birthYear = sc.nextInt();
        int age = 2023 - birthYear;
        
        System.out.println(" 귀하 " + name + "의 나이는 " + age + "세 이십니다.");
        //조건 나이 0~7살 유아 8살~13살 어린이 14~19살 청소년 20~60살 어른 61~ 노인 { } 블록)럭
 /*       if( 0<=age && age <=7) {
        	System.out.println("유아");
            System.out.println("지원금 100만원 받으세요");
        } else if( 8<=age && age <=13) {
        	System.out.println("어린이");
            System.out.println("지원금 50만원 받으세요");
        } else if( 14<=age && age <=19) {
        	System.out.println("청소년");
            System.out.println("지원금 20만원 받으세요");
        } else if( 20<=age && age <=60) {
        	System.out.println("어른");
            System.out.println("지원금 20만원 내세요");
        } else {
        	System.out.println("노인");
            System.out.println("지원금 30만원 받으세요");
        } */
        
        // ageType : 나이별 타입(유아, 어린이, ...)  subsidy=100 -20 //지원금 받는 것 + 내는 것 - 
        
        String ageType=null; //나이별 타입  null 객체안에 아직 값을 넣지 않았다. 나중에 넣을 거야  
        int subsidy=0; //지원금 
        
        if( 0<=age && age <=7) {
        	ageType="유아";
            subsidy=100;
        } else if( 8<=age && age <=13) {
        	ageType="어린이";
        	subsidy=50;
        } else if( 14<=age && age <=19) {
        	ageType="청소년";
        	subsidy=20;
        } else if( 20<=age && age <=60) {
        	ageType="어른";
        	subsidy=-20;
        } else if( age >= 61){
        	ageType="노인";
        	subsidy=30;
        }
      
        
        
        
        //조건 유아인 경우는 지원금 100만원을 받으세요 어린인 경우 지원금 50만원을 받으세요 
        //    청소년인 경우 20만원을 받으세요 노인인 경우 지원금 30만원을 받으세요
        //    어른인 경우 지원금 20만원을 내세요 이렇게 출력해 주세요.
        
        //어른과 노인만 대상 집이 있습니까?
        //집이 있으면 true 없으면 fasle
        //어른이 집이 있는 사람은 10%로 더 내기, 노인 집이 있으면 10% 덜 받기
        boolean  houseOx = false; //집유무변수
        if( ageType.equals("어른") || ageType.equals("노인")) {
        	System.out.println("집이 있으면 true, 없으면 false 입력해 주세요 ");
        	houseOx = sc.nextBoolean();
        	if( ageType.equals("어른")  && houseOx) {
        		//어른이고 집이 있으면 
        		subsidy = subsidy + (int) (subsidy * 0.1);
        	}else if( ageType.equals("노인") && houseOx ) {
        		//노인이고 집이 있으면 
        		subsidy = subsidy - (int) (subsidy * 0.1);
        	}
        }
        
        if (subsidy >= 0)
            System.out.println("111 당신은 " + ageType + "입니다. 정부 지원금 " + subsidy + " 만원을 받으세요");
        else
            System.out.println("111 당신은 " + ageType + "입니다. 정부 지원금 " + Math.abs(subsidy) + " 만원을 내세요");	
          
          // ageType "어른"이면 내세요 라고 출력하게 만들기 문자열의 같다는 변수명.equals("문자열") ageType.equals("어른") 
          
        if ( ageType.equals("어른") )
          	System.out.println("222당신은 " + ageType + "입니다. 정부 지원금 " + Math.abs(subsidy) + " 만원을 내세요");	
        else
            System.out.println("222당신은 " + ageType + "입니다. 정부 지원금 " + subsidy + " 만원을 받으세요");
       
	}
}
