package javaBasic2.ch05.day05;

public class ArrayEx05 {

	public static void main(String[] args) {
		// ������ �迭
       int[][] a = new int[2][3];
       a[0][0] = 5;
       a[1][1] = 10;
       
       int[][] b = { { 1,2,3 }, {4,5,6} };
       int[][] c = { {4,3 }, {5,7 } };
       int[][] d = { {1,2,3,4}, {5,6,7,8} };
       
       String[][] e = {  {"a","b" }, {"c", "d"}, {"f","g" } };
       int[][][] f = {  { {1},{2}  }, { {3},{4} }, { {5},{6} }   };
       
       //b�� �迭�� ����� new
       int[][] bb = new int[2][3];
       int[][] cc = new int[2][2];
       int[][] dd = new int[2][4];
       String[][] ee = new String[3][2];
       int[][][] ff = new int[3][2][1];
       
       //����ϱ�
       //b�迭�� ����ϼ���
       System.out.println(b[0][0] + " " + b[0][1] + " " + b[0][2]);
       System.out.println(b[1][0] + " " + b[1][1] + " " + b[1][2]);
       //e�迭�� ����ϼ���
       System.out.println( e[0][0] + " " + e[0][1]);
       System.out.println( e[1][0] + " " + e[1][1]);
       System.out.println( e[2][0] + " " + e[2][1]);
       //f�迭�� ����ϼ���
       System.out.println( f[0][0][0] ); //1
       System.out.println( f[0][1][0] ); // 11�� 5�б��� ���� 3������ �� ���� �����ƿ� ���� ������� �ʾƿ�
       
       
       
	}

}
