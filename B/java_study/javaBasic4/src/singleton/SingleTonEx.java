package singleton;

import java.util.Calendar;

public class SingleTonEx {

	public static void main(String[] args) {
		Single  ss  = Single.getInstance();
		Single  ss2  = Single.getInstance();
		
        System.out.println( ss );
        System.out.println( ss2 );
	}

}

