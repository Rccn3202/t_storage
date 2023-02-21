package javaBaisc1;

public class ForForEx {

	public static void main(String[] args) {
//		for(int i=1; i<3; i++) {
//			for(int j=1; j<2; j++) {
//				System.out.print(i + " " + j+" ");
//			}
//		}
   //아래와 같은 코드의 출력결과를 쓰시오
		for(int i=2; i<=4; i++) {
			for( int j=5; j>=2 ; j--) {
				System.out.print( i + " " + j + " ");
			}
			System.out.println();
		}
	 //아래와 같은 코드의 출력결과를 쓰시오
		System.out.println(" ------- ");
		for(int i=2; i<=4; i++) {  // 2 3
			for( int j=5; j >= i ; j--) { //5  5>=2  4 >= 2 3 > 2  2 >=2 1>=2 5>=3 4>=3
				System.out.print( i + " " + j + " "); // 2 5 2 4 2 3 2 2
				                                      // 3 5 3 4 
			}
			System.out.println();
		}
	 //아래와 같은 코드의 출력결과를 쓰시오
			System.out.println(" ------- ");
			for(int i=1; i<=5; i++) { // 1 2
				for( int j=1; j <= 9 ; j++) { // 1 2
					System.out.print( i + " " + j + " ");
				}
				System.out.println();
			}	
		//문1) 이렇게 출력해 보기	
		// [1,1][1,2][1,3]  System.out.print("[" + i + ", " + j + "]") 
		// [2,1][2,2][2,3]
			
		//문2) 이렇게 출력해 보기 	
		// [1,1,1][1,1,2]   [i,j,k]
		// [1,2,1][1,2,2]
		// [2,1,1][2,1,2]
		// [2,2,1][2,2,2]
	    for(int i= 1; i<=2;i++) {
	    	for(int j=1; j<=2; j++) {
	    		for(int k=1; k <= 2 ; k++) {
	    			System.out.print("[ " + i + "," + j + "," + k + " ]");
	    		}
	    		System.out.println();
	    	}
	    }
			
			
		//문3) 
		/*	2 X 1= 2  2 X 2 = 4... 2 X 9 = 18 
		 * 
		 *  9 X 1  =9              9 X 9 = 81
		 */
		for(int i=2; i<=9; i++) {  //2 3 .. 9
			for(int j=1; j<=9; j++) { //1 2 3 .. 9
				//System.out.print(i +"x" + j +"=" + i*j + " " );
				System.out.printf("%2d x %2d = %2d", i, j,  i*j );
			}
			System.out.println();
		}
	    
	    
	    
		//문4) 
		/*	2 X 1 = 2  3 X 1 = 3... 9 X 1 = 9 
		 * 
		 *  2 X 9 = 18              9 X 9 = 81
		 */	
		System.out.println("------------");
		for(int i=1;i<=9;i++) {
			for( int j=2;j<=9 ;j++ ) {
				System.out.printf("%2d x %2d = %2d", j, i,  i*j );
			}
			System.out.println();
		}
		
	}//end main

}//end class
