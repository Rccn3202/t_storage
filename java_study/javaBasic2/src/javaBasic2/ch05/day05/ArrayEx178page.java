package javaBasic2.ch05.day05;

public class ArrayEx178page {

	public static void main(String[] args) {
		// 178
       int[][] scores = {  {80,90,96}, {76,88} };
       
       System.out.println("�迭�� ���� ���� ���� " + scores.length);
       System.out.println("�迭�� ���� 0���� ���� ���� " + scores[0].length);
       System.out.println("�迭�� ���� 1���� ���� ���� " + scores[1].length);
       
       System.out.println(" 96���� ��� " + scores[0][1]);
       System.out.println(" 88���� ��� " + scores[1][1]);
       //ù��° ���� ��� ����  80+90+96  /3
       int avg =(scores[0][0] + scores[0][1] + scores[0][2]) / 3;
       System.out.println("ù°�� ���==>" + avg);
       int sum=0;
       for(int i=0; i<scores[0].length; i++) {
    	     sum = sum + scores[0][i];
       }
       avg = sum/scores[0].length;
       System.out.println("ù°�� ���==>" + avg);
       
       //�ι�° ���� ����� ���ϱ�
       avg =(scores[1][0] + scores[1][1] ) / 2;
       System.out.println("�ι�°�� ���==>" + avg);
       sum = 0;
       for( int s : scores[1]) {
    	   sum = sum + s;
       }
       avg = sum / scores[1].length; 
       System.out.println("�ι�°�� ���==>" + avg);
       
       //187 �迭 ����
       int[] oldIntArray = {1,2,3};
       
       int[] newIntArray = new int[5];
       
       for( int i=0; i<oldIntArray.length ; i++) {
    	   newIntArray[i] = oldIntArray[i];
       }
       for(int n : newIntArray) {
    	   System.out.print(n + "  " );
       }
       int[] old = {4,5};
       newIntArray[3]=old[0];
       newIntArray[4]=old[1];
       for(int n : newIntArray) {
     	  System.out.print(n + "  " );
       }
       //�迭�� ũ�⸦ ���߿� ������ �� ���� �׷��� ū �迭�� ���� ����� �� �Ű� �־�� �Ѵ�.
       //�̷��� ������ �����ִ� �ڷᱸ���� �ִ�. �̰��� �÷���(List) �̶�� �Ѵ�. - ���߿��� �迭 ��ſ� ����Ʈ��� ���� �̿��� 
       //�迭 ���縦 ���ִ� System Ŭ������ �ִ�.
       
       int[] newArr1 = new int[10];
       System.arraycopy(oldIntArray, 0, newArr1, 0, oldIntArray.length );
       
       System.out.println();
       for(int i=0; i<newArr1.length ; i++) {
    	   System.out.print( newArr1[i] + " ");
       }
       
       System.out.println();
       int[] ss= {10,25,30,35};
       int[] newSS = new int[7];
       System.arraycopy(ss, 0, newSS, 2, ss.length );
       for( int i=0; i< newSS.length ; i++) {
    	   System.out.print( newSS[i] +   "   ");
       }
       
       
	}

}
