package ch02.sec01;

import java.util.Scanner;

public class VarEx4 {

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
	    //1�� 10�� ���� �ð�
	}

}
