package javaBaisc1;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// ���
		//while�� 
	/*	int n=5;
		while( n <= 10) {
			//���� ������ ���̸� �̰��� ����
			System.out.println(n); //5 6 7 8 9 10
			n++; //n=n+1;  6 7 8 9 10 11
		}//end while */
		
		int a=10;
		while( a >= 5) { //��
		   System.out.print(a + " ");  //10	
		   //������ ������ �Ǵϱ� �������� ������ �ǰ� ������ �Ѵ�
		   a--;
		}	
        //���� 1 2 3 4 5 6 7 8 9 10
		//���� ���ں����� �����. ���ں����� 1�� �ʱⰪ���� �ְ� �ݺ����� �����.
		//    �ݺ������� ������ 10���� �۰ų� ���� ������ �ݺ��ϰ� 1���� �����ϴ� �ڵ带 �ۼ��Ѵ�.
		System.out.println("\n ����1");
		int a1 = 1;
		while( a1 <= 10) {
			System.out.print(a1 + "\t");
			a1++;
		}
		
		//���� 0 5 10 15 20 ... 100
		System.out.println("\n ����2");
		int a2 = 0;
		while( a2 <= 100) {
			System.out.print(a2 + "\t");
			a2 = a2 + 5;
		}
		
		//���� -100 -50 0 50 100
		System.out.println("\n ����3");
		int a3 = -100;
		while( a3 <= 100) {
			System.out.print(a3 + "\t");
			a3 = a3 + 50;
		}
		
		//���� ABCDEF...Z���� ����ϱ�
		//���� A�� �����ڵ�� 65�Դϴ�
		System.out.println("\n ����4");
		char alph = 'A'; //1���� ���� �����ڵ� 65
		while( alph <= 'Z') {
			System.out.print(alph + " ");
			alph++;
		}
		
		//�л��̸��� 3�� �ݺ��ؼ� �Է� �ް� ����ϼ���
		Scanner sc = new Scanner(System.in);
	/*	
		System.out.print("�л� �̸��� ==>");
		String name = sc.next();
		System.out.println(name);
		
		System.out.print("�л� �̸��� ==>");
		name = sc.next(); 
		System.out.println(name);
		
		System.out.print("�л� �̸��� ==>");
		name = sc.next(); 
		System.out.println(name);
	*/
		//�̰��� �ݺ������� ��ġ�� 1ȸ ó���� ���� �����ִ� ����(cnt)�� �ʿ���
		// ���ǹ��� ������ �ұ�? ���ǽ��� ���� cnt������ 3�̸� ��, ó���� ����?  
		
		int cnt=1; //��������
		int banCnt=3;//�� �ο���
		String name = null;
		while(cnt <= banCnt) {
			System.out.print("�л� �̸��� ==>");
			name = sc.next(); 
			System.out.println(name);
			cnt++;
		}
	}//end main()
}//end class 
