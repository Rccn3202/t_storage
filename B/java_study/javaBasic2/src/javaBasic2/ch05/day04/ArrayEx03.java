package javaBasic2.ch05.day04;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 2. �迭�� ���� ����� �ΰ� ���߿� ���� �ֱ�
		int[] a1 = new int[5];
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		a1[3]=40;
		a1[4]=50;
		for(int a : a1) {
			System.out.print( a + " ");
		}
		System.out.println();
        //Ű����� ���� 5���� �Է� �޽��ϴ�. ���� ���ϰ� �հ� ����մϴ�
		// �迭�� a2 
		Scanner sc = new Scanner(System.in);
		int[] a2 = new int[5];
		int sum=0;
		for(int i=0; i< a2.length ; i++) {
			System.out.println( (i+1 )+ "��° ���� �Է� >" );
			a2[i] = sc.nextInt();
			sum = sum + a2[i];
		}
		System.out.println(sum );
		//�Է� ���� �����߿��� ���� ū ���ڴ�? 
		//�Է� ���� �����߿��� ���� ���� ���ڴ�?
		int max=0;
		int min=9999;
		
		for(int i=0; i<a2.length; i++) { //i=0,1,2,3,4
			if( max < a2[i]) max = a2[i];
			if( min > a2[i]) min = a2[i];
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		//������������ �����ϼ���.
		int temp;
		for(int i=0; i < a2.length - 1; i++) { //i=0 1 2 3 ���ؿ� �ش�Ǵ� �ݺ� 
			for(int j = i ; j < a2.length ; j++) {  //�񱳴��  j=0,1,2,3,4 / j=1,2,3,4/
				if( a2[i] > a2[j]) {
					temp = a2[i];
					a2[i] = a2[j];
					a2[j] = temp;
				}
			}
			
			System.out.println( (i + 1) + "ȸ ����==>");
			for( int a: a2) {
				System.out.print( a + "  ");
			}
			System.out.println();
		}
		
		
		//������������ �����ϼ���.
		
	}
}
