package javaBaisc1;

import java.util.Scanner;

public class ContinueEx2 {

	public static void main(String[] args) {
		// 1~100���� for������ ����� ����
	/*	for(int i=1; i<=100; i++) {
			System.out.print( i + " ");
		}
         System.out.println();
		//1~100�� 10�� ��� �ʹ�
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=100; j++) {
				System.out.print( j + " ");
			}
			System.out.println();
		}
		
		// ȫ�浿 20�� ���
		for( int i=1; i<=20; i++) {
			System.out.print("ȫ�浿" + " ");
		}
		System.out.println("\n------------");
		//ȫ�浿 20�� ����� ���� 5�� �ݺ� �ϼ���
		for(int i=1; i<=5; i++) {
			for( int j=1; j<=20; j++) {
				System.out.print("ȫ�浿" + " ");
			}
			System.out.println();
		} */
		//1~50 ����ϱ� 1~50������ ���� ���ϱ� ���� 500�̻��� �Ǵ� ���� i���� ���ΰ���?
		System.out.println("------");
		int sum=0;
		int i=1;
		for( ;  i<=50; i++) {
			System.out.print(i+" ");
		    sum = sum + i;
		    if(sum>=500) break;
		}
		System.out.println("\n sum= " + sum + " i= " + i);
		
		//�� 1~100���� �ݺ��Ͽ� ����ϰ� 55�� �� break �ݺ� Ż���ϱ�
		System.out.println("------");
		for(int j=1; j<=100; j++) {
			System.out.print(j + " ");
			if(j == 55) break;
		}
		System.out.println("======");
		//�� 10, 20, 30, ... 1000���� �ݺ��ϸ鼭 ������ 20��° �� �� Ż���Ͽ� �ش��׸� ����ϱ�
		System.out.println("------");
		int cnt=0;
		int j=10;
		for(; j<=1000; j+=10) {
			System.out.print(j + " ");
			cnt++;
			if(cnt==20) break;
		}
		System.out.println( j + " 20��° ����" );
		System.out.println("======");
		
		//�� while�� �̿�
		//������ �Է��� ��� �޴ٰ� 0 �� �ԷµǸ� �ݺ��� ������
		Scanner sc = new Scanner(System.in);
		while( true ) {
			int number = sc.nextInt();
			if(number==0) break;
		}
	
		//�� do~while�� �̿�
		//���ڷ� �ܾ ��� �Է� �޴ٰ� no �Ǵ� NO  No nO �� �Է� �Ǹ� �ݺ��� ������
		// no������ ��� �빮�ڷ� �ٲ�� ��� �ҹ��� 
        do {
        	String word = sc.next();
        	if( word.toLowerCase().equals( "no"  )  ) break;
        }while( true );
		
		
		
		
		
		
	}
}
