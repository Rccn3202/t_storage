package javaBasic2.ch05.day05;

import java.util.Calendar;

public class WeekEx197 {

	public static void main(String[] args) {
		// �������� ����ϱ�
        Week today=null;
        Calendar cal = Calendar.getInstance(); //�޷°��õ� Ŭ���� ����� �� �ִ�
        int week = cal.get(Calendar.DAY_OF_WEEK); //���ó�¥�� ������ ���ڷ� ��ȯ�Ѵ�.
        System.out.println(week); //��-1, ��-2 ������ - 4
        
        today = Week.SUNDAY;
        System.out.println(today);
        
        today = Week.WEDNESDAY;
        System.out.println(today);
        
        if( week == 4 ) {
        	 today = Week.WEDNESDAY;
             System.out.println(today);
        }
        //����� ����Ļ�
        if( week == 7 )
        	System.out.println("���� ���� �Ա�");
        today = Week.SATURDAY;
        if( today  ==  Week.SATURDAY)
        	System.out.println("���� ���� �Ա�");
        
        LoginResult loginR = null;
        
        loginR = LoginResult.LOGIN_SUCCESS ;
        
        loginR = LoginResult.LOGIN_FAILED;
        
       // loginR = LoginResult.LOGGING; ����� �� ���� ��? �������� �ʾұ� ������ 
        
        //6�� 7 8 
        
        
	}

}
