package javaBasic2.ch05.day05;

import java.util.Calendar;

public class WeekEx197 {

	public static void main(String[] args) {
		// 열거형을 사용하기
        Week today=null;
        Calendar cal = Calendar.getInstance(); //달력관련된 클래스 사용할 수 있다
        int week = cal.get(Calendar.DAY_OF_WEEK); //오늘날짜의 요일을 숫자로 반환한다.
        System.out.println(week); //일-1, 월-2 수요일 - 4
        
        today = Week.SUNDAY;
        System.out.println(today);
        
        today = Week.WEDNESDAY;
        System.out.println(today);
        
        if( week == 4 ) {
        	 today = Week.WEDNESDAY;
             System.out.println(today);
        }
        //토요일 저녁식사
        if( week == 7 )
        	System.out.println("저녁 같이 먹기");
        today = Week.SATURDAY;
        if( today  ==  Week.SATURDAY)
        	System.out.println("저녁 같이 먹기");
        
        LoginResult loginR = null;
        
        loginR = LoginResult.LOGIN_SUCCESS ;
        
        loginR = LoginResult.LOGIN_FAILED;
        
       // loginR = LoginResult.LOGGING; 사용할 수 없음 왜? 열거하지 않았기 때문에 
        
        //6번 7 8 
        
        
	}

}
