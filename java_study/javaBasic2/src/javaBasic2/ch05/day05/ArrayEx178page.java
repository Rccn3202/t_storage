package javaBasic2.ch05.day05;

public class ArrayEx178page {

	public static void main(String[] args) {
		// 178
       int[][] scores = {  {80,90,96}, {76,88} };
       
       System.out.println("배열의 길이 행의 갯수 " + scores.length);
       System.out.println("배열의 길이 0행의 열의 갯수 " + scores[0].length);
       System.out.println("배열의 길이 1행의 열의 갯수 " + scores[1].length);
       
       System.out.println(" 96점을 출력 " + scores[0][1]);
       System.out.println(" 88점을 출력 " + scores[1][1]);
       //첫번째 반의 평균 점수  80+90+96  /3
       int avg =(scores[0][0] + scores[0][1] + scores[0][2]) / 3;
       System.out.println("첫째반 평균==>" + avg);
       int sum=0;
       for(int i=0; i<scores[0].length; i++) {
    	     sum = sum + scores[0][i];
       }
       avg = sum/scores[0].length;
       System.out.println("첫째반 평균==>" + avg);
       
       //두번째 반의 평균을 구하기
       avg =(scores[1][0] + scores[1][1] ) / 2;
       System.out.println("두번째반 평균==>" + avg);
       sum = 0;
       for( int s : scores[1]) {
    	   sum = sum + s;
       }
       avg = sum / scores[1].length; 
       System.out.println("두번째반 평균==>" + avg);
       
       //187 배열 복사
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
       //배열은 크기를 나중에 변경할 수 없다 그래서 큰 배열을 새로 만들고 다 옮겨 주어야 한다.
       //이러한 단점을 없애주는 자료구조가 있다. 이것을 컬렉션(List) 이라고 한다. - 나중에는 배열 대신에 리스트라는 것을 이용함 
       //배열 복사를 해주는 System 클래스가 있다.
       
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
