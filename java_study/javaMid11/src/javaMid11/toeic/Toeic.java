package javaMid11.toeic;

import java.util.Scanner;

public class Toeic {
    int toeicScore; //��������
    Scanner sc = new Scanner(System.in);
    boolean flag=true;
    String continueVal;
    
    void input() throws ScoreMinException, ScoreMaxException {
        while( flag ) {
        	System.out.print("����� ����������?");
        	toeicScore = sc.nextInt();
        	if( toeicScore < 0) {
        		throw new ScoreMinException( "0�� �̸� ���������� ���� �� �����ϴ�. �ٽ� �Է��ϼ���");
        	}else if( toeicScore > 990) {
        		throw new ScoreMaxException( "990�� �ʰ� ���������� ���� �� �����ϴ�. �ٽ� �Է��ϼ���");
        	}else {
        		System.out.println("����� ���������� " + toeicScore + "���Դϴ�");
        	}
        	sc.nextLine();
        	System.out.print("��� �Ͻðڽ��ϱ�?(y/n)");
        	continueVal = sc.next();
        	if(continueVal.equalsIgnoreCase("n")) flag = false;
        }
    }
    
    
}