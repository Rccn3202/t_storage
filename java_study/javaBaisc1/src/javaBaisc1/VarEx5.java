package javaBaisc1;

import java.util.Scanner;

public class VarEx5 {
	public static void main(String[] args) {
		System.out.println("---------------------");
	    System.out.println("ü���������� ���ϴ� ���α׷�");
	    System.out.println("---------------------");
	    
	    //Ű���� �Է� �޴� ��ü Scanner�� ����ϱ�
	    Scanner sc = new Scanner(System.in);
	    System.out.print("����� �����Դ�? " );
	    double weight =sc.nextDouble();
	    System.out.print("����� Ű��? " );
	    double height = sc.nextDouble();
//	    System.out.print("����� ���� (���ڸ� true, ���ڸ� false) �Է��ϼ���? ");
//	    boolean gender =sc.nextBoolean();
	    
	    System.out.println(weight+ " " + height +" " );
	    //ü����������	    �ڽ��� ������(kg)��	Ű�� ����(m)���� ���� ���Դϴ�.
	    double  bmi = weight / (height * height)  ;
	    System.out.println(bmi);
	/*    
	    if( bmi < 18.5) 
	    	System.out.println("��ü��");
	    if( 18.5<= bmi && bmi < 23 )
	    	System.out.println("����");
	    //��ü�� 23 <= bmi <25 
	    if( 23 <= bmi && bmi < 25)
	    	System.out.println("��ü��");
	    //�� bmi >= 25 
	    if( bmi >= 25 )
	    	System.out.println("��");
	  */  
	    if( bmi < 18.5) 
	    	System.out.println("��ü��");
	    else if( 18.5<= bmi && bmi < 23 )
	    	System.out.println("����");
	    //��ü�� 23 <= bmi <25 
	    else if( 23 <= bmi && bmi < 25)
	    	System.out.println("��ü��");
	    //�� bmi >= 25 
	    else if( bmi >= 25 )
	    	System.out.println("��");
	    
	    
	}

}
