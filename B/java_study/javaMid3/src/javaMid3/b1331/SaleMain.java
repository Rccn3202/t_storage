package javaMid3.b1331;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int menuSelect = 0;
        SaleBusiness sa = new SaleBusiness();
        while(menuSelect != 3) {
        	System.out.println("----------------------");
        	System.out.println("1. �Է�  2. ���  3. ����");
        	System.out.println("----------------------");
        	System.out.print("���� > ");
        	menuSelect = sc.nextInt();
        	switch(menuSelect) {
        	    case 1: sa.input(); break; 
        	    case 2: sa.output(); break;	
        	    case 3: break;
        	}
        }
	}

}
