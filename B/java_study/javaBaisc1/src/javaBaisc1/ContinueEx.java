package javaBaisc1;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		// �ݺ���(while, do~while, for)�̳� ���ǹ�(if��, switch~case��)�� ����̶�� �Ѵ�. 
        //break��-����� �� ĭ ������ ���� ������, conitnue��
		int a=10;
		
		switch( a ) {
		  case 1: System.out.println("���Դϴ�"); break;
		  case 5: System.out.println("���Դϴ�"); break;
		  case 10: System.out.println("���Դϴ�"); break;
		  default : System.out.println("�� �� ���� ������ �� �Դϴ�");
		}
		
		// �䳢 - �꿡 ��ϴ�. �ź��� - �ٴٿ� ��ϴ�. ��-������ ��ϴ�. �׿� ���� - ���� ��ϴ�
		String animal="�Ʊ�";
		switch( animal ) {
		  case "�䳢" : System.out.println("�꿡 ��ϴ�"); break;
		  case "�ź���" : System.out.println("�ٴٿ� ��ϴ�"); break;
		  case "��" : System.out.println("������ ��ϴ�"); break;
		  default : System.out.println("���� ��ϴ�"); break;
		}
		// ��) ���� 3���� �Է¹޾Ƽ� ����� ���� �� 90���̻��̸� A���� 80���̻��̸� B���� .. F�����̶�� ����ϱ� 
		// if��, switch~case��  
         Scanner sc = new Scanner(System.in);
         int cnt=0; //�Է� ���� ���� ���� ���� �ִ� ����
         int number1;
         int sum=0;
         while( cnt < 3) {
        	 System.out.print("������==>");
        	 number1 = sc.nextInt();
        	 sum = sum + number1;
        	 cnt++;
         }
         System.out.println("\n�հ�� ==>" + sum);
         int avg = sum / cnt;
         System.out.println("��մ� ==>" + avg);
         System.out.println("���� ������ ==>" + cnt);
         String hakjum=null;
         if(avg >= 90)
        	 hakjum = "A";
         else if(avg>=80)
        	 hakjum = "B";
         else if(avg>=70)
        	 hakjum="C";
         else if(avg>=60)
        	 hakjum="D";
         else 
        	 hakjum="F";
         System.out.println("������(if) ==>" + hakjum);
        	 
         switch( avg / 10) {
            case 10:
            case 9:  hakjum = "A"; break;
            case 8:  hakjum = "B"; break;
            case 7:  hakjum = "C"; break;
            case 6:  hakjum = "D"; break;
            default :	 hakjum = "F"; break;
      
         }
         System.out.println("������(switch) ==>" + hakjum);
	}
}
