package javaBasic2.ch05.day05;

public class ArrayEx199 {

	public static void main(String[] args) {
		//문제6
		
		//문제 7
		int[] array1 = { 1,5,3,8,2 };
		int max = 0;
		for(int i=0; i<array1.length; i++) { //i=0,1,2,3,4
			if(max < array1[i]) max = array1[i];
		}
		System.out.println("최대값은 " + max);

		
		//문제 8
		int[][] array2 = {
				           {95, 86},
				           {83, 92, 96},
				           {78,83,93,87,88}
		                                     };
		//합계 전부 더하기
		int sum=0;
		int cnt=0;
		for( int i=0; i< array2.length ; i++ )  { //행 반복   i=0,1,2
		     for(int j=0; j < array2[i].length ; j++ ) {  //열 반복  i=0일때 0열, 1열 / i=1일 때 0열 1열 2열 / i=2일 때 0,1,2,3,4
		    	 sum = sum + array2[i][j];
		    	 cnt++;
		     }
		}
		System.out.println("합계는 " + sum);
		System.out.println("평균은 " + ( sum / cnt ) );
		
		cnt = array2[0].length + array2[1].length + array2[2].length;
		System.out.println("갯수는 " + cnt);
		
		//평균 합계/10
		

	}

}
