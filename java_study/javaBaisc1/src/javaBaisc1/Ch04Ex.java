package javaBaisc1;

import java.util.Scanner;

public class Ch04Ex {

	public static void main(String[] args) {
		// 4�� Ȯ�ι���
		//��4) 
		while( true ) {
		   int a1 = ( (int) (Math.random() * 6 ) ) + 1;
		   int a2 = ( (int) (Math.random() * 6 ) ) + 1;
		
 		   if( (a1 + a2) == 5 ) {
 			   System.out.println("(" + a1 + ", " + a2 + ")" );
 			   break;
 		   }
		}
		
		//��5)
		for(int  x=1; x<=10 ; x++) {
			for(int y=1; y<=10; y++) {
				if( 4 * x  + 5 * y == 60 ) System.out.println( "(" + x + "," + y + ")" );
			}
		}
		
		//��6)
		// *
		// **
		// ***
		// ****
		// *****
		
		//��Ʈ System.out.print("*"); �ݺ��Ѵ� 
		for(int i=1;i<=5; i++) {
			for(int j=1; j<= i ; j++) {  // 1°�� : 1���ݺ� 2°�� : 2���ݺ� 3°�� : 3���ݺ�
				System.out.print("*");
			}
			System.out.println();
		}
	
		//���� ��������
		// while���� Scanner�� next()�� �̿��Ͽ� ������ ���� ����� ������.
		// --------------------------------
		// 1. ���� | 2. ��� | 3. �ܰ� | 4 ����
		// ---------------------------------
		// 1�� ġ�� ���� 2�� ġ�� ��� 3�� ġ�� �ܰ� 4�� ġ�� ���� 

		Scanner sc = new Scanner(System.in);
		System.out.println("---------------");
		System.out.println(" ���� �ŷ� ���α׷�");
		System.out.println("---------------");
		System.out.println();
		
		String choice = null;
		int money=0;//�Է� �޴� ��
		int balance=0;//�ܾ� 
		String bankNumber=null;//���¹�ȣ
		
		while( true ) {
			System.out.println("-----------------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ��ü | 0. ����");
			System.out.println("-----------------------------------------");
			System.out.print("����> ");
			choice = sc.nextLine();
			
			switch( choice ) {
			   case "1":{ System.out.print("���ݾ�>");
				          money = sc.nextInt();
				          sc.nextLine();
				          balance = balance + money;
				          break;
			             }
			   case "2": { System.out.print("��ݾ�>");
			               money = sc.nextInt();
			               sc.nextLine();
			               //�ܾ׺��� ��ݾ��� ũ�� �ܾ׺����Դϴ� ��� ����Ͻÿ�.
			               if( balance < money) {
			            	   System.out.println("�ܾ� �����Դϴ�");
			               } else {
			            	   balance = balance - money;
			               }
          
			               break;
			              }
			   case "3": { System.out.print("�ܰ�>");
				           System.out.print(balance);
				           System.out.println();
				           break;
			             }
			   case "4" : { //��ü�� ���¹�ȣ> ��ü�ұݾ�> ��ü�� ���ְ�  00���·� 00�ݾ��� ��ü�ƽ��ϴ� �ܾ��� 00�Դϴ�.
				            System.out.print("��ü�� ���¹�ȣ>");
				            bankNumber=sc.nextLine();
				            System.out.print("��ü�� �ݾ�>");
				            money=sc.nextInt();
				            sc.nextLine();
				            if(balance < money) {
				            	System.out.println("�ܾ� �������� ��ü�� �� �����ϴ�");
				            }else {
				            	balance = balance - money;
				            	System.out.println( bankNumber +"���·� " + money + "�ݾ��� ��ü�Ǿ����ϴ�. �ܾ��� " + balance + "�Դϴ�.");
				                
				            }
				            break;
			              }
			   case "0": System.out.println("���α׷� ����"); break; 
			   default : System.out.println("���ڸ� �߸�ġ�̾��. �ٽ� �Է��ϼ���.");
			}
		  // System.out.println("�̰��� while���̾� ~~");	
		  if(  choice.equals("0")  )  break;
		}
	}
}
