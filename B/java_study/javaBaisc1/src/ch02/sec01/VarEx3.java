package ch02.sec01;

import java.util.Scanner;

public class VarEx3 {

	public static void main(String[] args) {
		/* �Ʒ��� ���� �Է��մϴ�
		�̸���==> ȫ�浿
		��������==> 100
		��������==> 80
		��������==> 90

		���ȭ��
		------------------------
		 ���� �б� ����ǥ
		------------------------
		ȫ�浿 100 80 90 270 90 1��
		------------------------ */
		//Ű���� �Է��ϴ� ��ĳ�� ��ü�� ����մϴ�
		Scanner sc = new Scanner(System.in);
		//�Է��ϱ�
		System.out.print("�̸���==>");
		String name = sc.next();
		
	    System.out.print("��������==>");
	    int kor = sc.nextInt();
	    
	    System.out.print("��������==>");
	    int eng = sc.nextInt();
	    
	    System.out.print("��������==>");
	    int mat = sc.nextInt();
		
		//�հ踦 ����ϱ�
	    int total = kor + eng + mat;
	 //   System.out.println(total);
	    	 
	    //��� ����ϱ� (�Ҽ��� 2°�ڸ����� ǥ��)
	    double avg = total / 3.0; // 74.6
	 //   System.out.printf("%.2f", avg );
	    
	    //����ϱ�
	    
	    System.out.println("-----------------------------");
	    System.out.println("        ���� �б�   ������:������  ");
	    System.out.println("-----------------------------");
	    System.out.println(name + " " + kor +" " + eng + " " + mat +" " + total + " " + avg + " " + "1��");
	    
		
		
	}
}
