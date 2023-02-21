package javaCh12.ex02;

public class BaseEx02 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long startMiTime = System.currentTimeMillis();
		// 1676943031450 =>   초  1676943031450 / 1000 => 분 (1676943031450 / 1000) / 60 ==> 시 ( (1676943031450 / 1000) / 60 ) / 60
		
		System.out.println( startTime + " " + startMiTime);
		
		int sum=0;
		for( long i=1; i<=1000000000L; i++) {
			sum += i;
		}
		long endTime = System.nanoTime();
		long endMiTime = System.currentTimeMillis();
		System.out.println( endTime + " - " + endMiTime );
		System.out.println( "1~100000000까지의 합을 구하는데 걸린 시간은? " + ( ( endTime - startTime ) ) + "초" );
		System.out.println( "1~100000000까지의 합을 구하는데 걸린 시간은? " + ( ( endMiTime - startMiTime ) ) + "초" );
	}

}
