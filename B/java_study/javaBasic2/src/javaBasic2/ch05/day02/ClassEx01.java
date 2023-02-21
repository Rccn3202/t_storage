package javaBasic2.ch05.day02;

import java.util.Scanner;

public class ClassEx01 {
	public static void main(String[] args) {
		// 1. 클래스의 필드에 직접 값을 넣어준다.
        Product product = new Product();
        //입력 담당하는 메소드 
        inputM( product  );
        
        Product product1 = new Product();
        inputM( product1  );
        
        Product product2 = new Product();
        inputM( product2  );
       
        //판매금액 구하기
        int salePrice = product.salePriceMethod(product.proPrice, product.proCnt);
        
        //달성 구하기
        String attainMent = product.attainMentMethod(salePrice);
        
        System.out.println("출력하기");
        System.out.println(" 상품코드   상품명  가격   갯수 판매금액  달성");
        System.out.println(product.proId + " " + product.proName + " " + product.proPrice + " " + product.proCnt + " " + salePrice + " " + attainMent);
        
        //판매금액 구하기
        salePrice = product1.salePriceMethod(product1.proPrice, product1.proCnt);
        
        //달성 구하기
        attainMent = product1.attainMentMethod(salePrice);
       
        System.out.println(product1.proId + " " + product1.proName + " " + product1.proPrice + " " + product1.proCnt + " " + salePrice + " " + attainMent);
        
        //판매금액 구하기
        salePrice = product2.salePriceMethod(product2.proPrice, product2.proCnt);
        
        //달성 구하기
        attainMent = product2.attainMentMethod(salePrice);
        
        System.out.println(product2.proId + " " + product2.proName + " " + product2.proPrice + " " + product2.proCnt + " " + salePrice + " " + attainMent);
     
	}//메인 메소드
   
	static void inputM(Product product) {
		//입력 담당 
	   System.out.println("---------");	
	   System.out.println("선물세트 판매");
	   System.out.println("----------");
	   System.out.println();
	   
	   System.out.println("입력화면");
	   // 입력 언제까지? 3개 받기
 
	   Scanner sc = new Scanner(System.in);
	   System.out.println();
	   System.out.print( "상품코드> ");
	   product.proId = sc.next();
	   System.out.print( "상품명> ");
	   product.proName = sc.next();
	   System.out.print( "가격> ");
	   product.proPrice = sc.nextInt();
	   System.out.print( "갯수> ");
	   product.proCnt = sc.nextInt();

	}
}// end ClassEx01


//조별로 클래스 만든 것 실습해 보기
class Product{
	 String proId;
	 String proName;
	 int proPrice;
	 int proCnt;
	 int salePrice;//판매금액
	 
	 int salePriceMethod( int proPrice, int proCnt  ) {
		return proPrice * proCnt;
	 } //판매금액구하기 
	 
	 String attainMentMethod(int salePrice ) {
		if (salePrice >= 100000) return "잘함";
		else return "노력";
	 }//달성구하기
}