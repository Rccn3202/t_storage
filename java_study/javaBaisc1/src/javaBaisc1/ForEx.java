package javaBaisc1;

import java.util.Scanner;

public class ForEx {
  /*  ����
   *  for( �����ʱⰪ  ;  ���ǽ� ;  ������ ){
   *      �ݺ��� ����
   *   }
   */
	public static void main(String[] args) {
		for( int i=1; i<=10; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=10; i >= 0 ; i-- ) {
			System.out.print(i + " ");
		}
		int a=5;
		for( ; a<10 ; a++ ) {
			System.out.print( a );
		}
		// ��1) 10 20 30 40 .. 100�� ����ϱ�
		System.out.println();
		for(int i=10; i<=100; i+=10 ) {
			System.out.print(i + " ");
		}
		// ��2) 1~100���� �� ���ϱ� �� 5050
		System.out.println();
		int sum = 0;
		for(int i=1; i<=100 ; i++) {
			sum = sum + i;
		}
		System.out.println("1~100������ ���� " + sum);
		
		// ��3) 0~100���� Ȧ���� �� ���ϱ�, Ȧ���� ���� ���ϱ� 1 3 5 sum = sum + odd  cnt = cnt + 1
		int oddSum=0;//Ȧ���� ��
		int oddCnt=0;//Ȧ���� ����
		for( int odd = 1; odd < 100; odd=odd+2 ) {
			oddSum = oddSum + odd;
			oddCnt = oddCnt + 1;
		}
		System.out.println("1~100���� Ȧ���� ���� " + oddSum);
		System.out.println("1~100���� Ȧ���� ������ " + oddCnt);
		// ��4) 1~100���� ����ϵ� 1�ٿ� 10���� ����ϱ�
		// 
		int cnt =0;
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			cnt++;
// ���1	 ��� ������ 10���� ��� 10�� �ٹٲ��ϱ�		
//			if(cnt == 10) {
//				System.out.println();
//				cnt = 0;
//			}
// ���2  10�� ����� �� �ٹٲ��� �ض�
			if( i % 10 == 0 ) {
				System.out.println();
			}
		}
		System.out.println();
		int k=32;
		System.out.println( k % 10 == 0 );  //
		
		/* ��5) while �Ʒ��� ���� ����� ������.(12345)�� �Է� �� ����
   		���ȭ��
		���ڸ� �Է��ϼ���. (��:12345) ==> 12345
		sum = 5 number = 12345
		sum = 9 number = 1234
		sum = 12 number = 123
		sum = 14 number = 12
		sum = 15 number = 1
 		�� �ڸ����� �� : 15
		*/
		System.out.println("���ȭ��");
		Scanner sc = new Scanner(System.in);
		System.out.print(" ���ڸ� �Է��ϼ���. (��:12345) ==> ");
		int number = sc.nextInt(); 
		int number1=0;//�� ���ڸ� ���ڸ� ��� ���ؼ�  1234�� �����
		int temp=0;
		int s=0;
		while(number >= 1) {
			number1 = number / 10; //1234
			temp = number1 * 10; //12340
			s = s + number - temp; // 12345 - 12340 = 5
			System.out.println("sum = " + s + " number = " + number);
			number = number1; // 1234
		}
		
		// sum������ 5�� �־� �ֱ�   12345 - 12340   = 5   12340������? 1234 * 10  1234������? 12345 / 10 = 1234
		// System.out.println(number);
		
		// int number1 = number / 10;
		// System.out.println(number1);
		// int temp = number1 * 10;
		// System.out.println(temp);
		// int s = number - temp;
		// System.out.println("sum = " + s + " number = " + number);
		// number = number1; // 1234
		
		//number1 = number / 10; //123
		// System.out.println(number1); //123
		// temp = number1 * 10;//1230
		// System.out.println(temp); //1230
		// s = s + ( number - temp) ;//1234 - 1230 =4
		// System.out.println("sum = " + s + " number = " + number); // sum = 9 number = 1234
		
		
		/*��6) do~while ���ڸ� ��� �Է¹޴´� 0�� �Է��ϸ� ���ݱ��� �Է��� ���ڸ� ��� ���� ���� ����Ѵ�. �ݺ����� �̿��� ����ϱ�
          �հ踦 ���� ���ڸ� �Է��ϼ���(�������� 0�� �Է�)
          100 //(�Է¼�)
          200 //(�Է¼�)
          300 //(�Է¼�)
          400 //(�Է¼�)
          0 //(�Է¼�)
          �հ�:1000 //(���)
		 * 
		 * */
		
		 int n6;
		 int sum6=0;
		 do {
			 System.out.println("����6�� ���ڸ� �Է��ϼ���"); 
			 n6=sc.nextInt();
			 sum6 = sum6 + n6;
		 }while(n6 !=  0);
		 System.out.println("�հ�:" + sum6);
		
  }//end main
}//end class
