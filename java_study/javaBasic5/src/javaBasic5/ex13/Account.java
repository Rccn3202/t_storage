package javaBasic5.ex13;

public class Account {
    private int balance; //정책 0<= balance <= 1000000

    // 제한자 자료형 상수명 = 초기값
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(  balance >= Account.MIN_BALANCE && balance <= Account.MAX_BALANCE  )  
		    this.balance = balance;
	}
	
   //20번 집에 숙제 풀기
	
	// 프로젝트 발표 조별 -  모든 조원 코드 이해하기  12시 10분까지 조별 모임하겠습니다
	// 내일 조별 발표 끝나고 조원들에게 코드에 대하여 개별 질문하겠습니다. 코드를 완벽하게 이해하셔야 합니다
	// 모든 조원들이 코드를 실행해서 결과를 설명할 수 있어야 합니다.
	
	//내일 조별 발표 순서 1조-> 2조 -> 3조 -> 4조
	//발표 내용 : 프로젝트 개요- ( 카페에 올려 논 것(주제발표)을 바탕으로 한번 더 읽어 주기 )
	//          프로젝트 시현(실행해보기)
	//          조원 인터뷰 - 전체 다함. 코드 이해도 테스트, 어려웠던 점, 좋았던 점, 이 부분은 잘한 것 같다등
	// 이렇게 진행할 예정입니다. 
	
	
	
	
   
}
