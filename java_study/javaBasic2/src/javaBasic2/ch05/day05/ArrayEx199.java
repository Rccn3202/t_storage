package javaBasic2.ch05.day05;

public class ArrayEx199 {

	public static void main(String[] args) {
		//����6
		
		//���� 7
		int[] array1 = { 1,5,3,8,2 };
		int max = 0;
		for(int i=0; i<array1.length; i++) { //i=0,1,2,3,4
			if(max < array1[i]) max = array1[i];
		}
		System.out.println("�ִ밪�� " + max);

		
		//���� 8
		int[][] array2 = {
				           {95, 86},
				           {83, 92, 96},
				           {78,83,93,87,88}
		                                     };
		//�հ� ���� ���ϱ�
		int sum=0;
		int cnt=0;
		for( int i=0; i< array2.length ; i++ )  { //�� �ݺ�   i=0,1,2
		     for(int j=0; j < array2[i].length ; j++ ) {  //�� �ݺ�  i=0�϶� 0��, 1�� / i=1�� �� 0�� 1�� 2�� / i=2�� �� 0,1,2,3,4
		    	 sum = sum + array2[i][j];
		    	 cnt++;
		     }
		}
		System.out.println("�հ�� " + sum);
		System.out.println("����� " + ( sum / cnt ) );
		
		cnt = array2[0].length + array2[1].length + array2[2].length;
		System.out.println("������ " + cnt);
		
		//��� �հ�/10
		

	}

}
