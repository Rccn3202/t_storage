package javaBasic2.ch05.day04;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 165 
		int a1[];
		int[] a2;
		
        //�迭�ȿ� ���� �ֱ�
		// 1. �ʱⰪ���� �ֱ�  2. �迭 ����� ���� �ʿ��ϸ� �־� �ش�.
		int[] a3 = { 1,2,3,4,5,6 };
		System.out.println( a3[0] );
		for(int i=0; i < a3.length ; i++) {  //i=0,1,2,3,4,5
			System.out.print( a3[i] + " ");
		}
		System.out.println();
		System.out.println( "�迭�� ����(ũ��) "+ a3.length  );
		//���� for( �ڷ��� ���� : �迭�� ) �迭�� �ִ� ���ҵ� �Ѱ��� ������ �տ� ���� �ִ´�.
		// ���������� ������ �����־��ָ� �� �̻� �ݺ����� �ʴ´�
		for( int a :  a3) {
			System.out.print( a + " ");
		}
		System.out.println();
		
        //��) 1.1, 3.3, 5.4, 10.3, 8.9, 11.23  �迭�� �ֱ� 10.3 - 3.3
		double[] a4 = { 1.1, 3.3, 5.4, 10.3, 8.9, 11.23 };
		System.out.println( a4[3] - a4[1] );
		//��ü ����ϱ�
		for( int i=0; i< a4.length ; i++) {
			System.out.print( a4[i] + " ");
		}
		System.out.println();
		for( double a : a4) {
			System.out.print( a + " ");
		}
		System.out.println();
				
		//��) true, false, false, true, true, false, false, true
		//    ���� �������� �ִ� true�� ��� ������
		boolean[] a5= { true, false, false, true, true, false, false, true};
		System.out.println( a5[7]);
		for( int i=0; i< a5.length ; i++) {
			System.out.print( a5[i] + " ");
		}
		System.out.println();
		for( boolean a : a5) {
			System.out.print( a + " ");
		}
		System.out.println();

		//��) "���", "���", "������", "����" ����� ���, �����̸� ����ϼ���
		String[] a6= { "���", "���", "������", "����"  };
		System.out.println( a6[1] + " " + a6[2]);
		for( int i=0; i< a6.length ; i++) {
			System.out.print( a6[i] + " ");
		}
		System.out.println();
		for( String a : a6) {
			System.out.print( a + " ");
		}
		System.out.println();
				
	}

}
