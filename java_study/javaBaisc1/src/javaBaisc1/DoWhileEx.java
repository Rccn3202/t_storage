package javaBaisc1;

import java.util.Scanner;

public class DoWhileEx {
	
	public static void main(String[] args) {
		/*
		do {
			//�ݺ��� ���뾲��
		}while(���ǹ�);*/
		
		//��1) 1 2 3 4 .. 10
		int a=1;
		do{
			System.out.print(a+" ");
			a++;
		}while(a<=10);
		
		//��2) 100 95 90 ... 0
		System.out.println();
		int a2 = 100;
		do {
			System.out.print(a2+" ");
			a2=a2-5;
		}while(a2>=0);
		
		//��3) 1~100������ �� 5050�� ����ϱ�
		System.out.println();
		int a3=0;
		int sum=0;//�հ� ���ϴ� ����
		do {
			a3++;
			sum = sum + a3; 
		}while(a3 < 100);
		System.out.println(sum);
		//��4) 1~100���� ¦���� ���� ���ϱ� 2 4 6 8 10 
		System.out.println();
		int a4=0;
		int evenSum=0;
		do {
			a4=a4 + 2;
			evenSum = evenSum + a4;
		}while(a4<100);
		System.out.println(evenSum);
		//��5) 1 1 2 3 5 8 13 21 34 
		int a5=1;
		int b=1;
		int s = a5 + b;
		System.out.print(a5 + " " + b + " " +s+ " ");
		
		do {
			a5 = b; 
			b = s; 
			s = a5 + b;
			System.out.print(s+ " ");
		}while(s<34);
		
		//��6) �̸��� �Է��� ��� �޾Ƽ� ����ϴµ� �̸��� y�̸� �����ϱ�
		Scanner sc = new Scanner(System.in);
		String name = null;
		do {
		    System.out.println("�̸��� �Է��ϼ���==>");
		    name = sc.next();
		    System.out.println(name);
		}while( !name.equals("y") );
		
	}//end main
}//end class
