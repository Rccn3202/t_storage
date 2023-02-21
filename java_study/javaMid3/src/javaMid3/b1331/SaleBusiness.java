package javaMid3.b1331;

import java.util.Scanner;

public class SaleBusiness {
	Scanner	sc;
	SeoulJisa sj;
	KyoinJisa kij;
	KawonJisa kaj;
	Jeju je;
	
	public SaleBusiness() {
	  sc = new Scanner(System.in);
	  sj = new SeoulJisa();
	  kij = new KyoinJisa();
	  kaj = new KawonJisa();
	  je = new Jeju();
	}
   
	public void input() {
		//입력역할
		String yn="n";
		do {
			System.out.println("지사는?");
			System.out.println("1. 서울지사  2. 경인지사 3. 강원지사 4. 제주지사");
			System.out.print("선택은?");
			int jisaSelect=0;
			jisaSelect = sc.nextInt();
			switch(jisaSelect) {
			   case 1: jisaInput(sj);break;
			   case 2: jisaInput(kij); break;
			   case 3: jisaInput(kaj); break;
			   case 4: jisaInput(je); break;
			}
			
			System.out.print("계속 하시겠습니까?(y/n)");
			yn = sc.next();
			sc.nextLine();
		}while( yn.equalsIgnoreCase("y") );
	}

	private void jisaInput(Jisa js) {
		
		System.out.print("제품은?");

		if(js instanceof SeoulJisa) {
			sj= (SeoulJisa) js ;
			sj.setProName(sc.next());
			sc.nextLine();
			System.out.print( sj +"지사 " + sj.getProName() + " 판매량은? ");
			sj.setSaleAmount( sc.nextInt() );
			sj.setSaleSatus( saleStatusMethod( sj.getProName(), sj.getSaleAmount() ) );
			sj.setProPrice(   proPriceInput( sj.getProName() ) );
			//System.out.println( sj.getProName() + "  " + sj.getSaleAmount()  + " " +  sj.getSaleSatus());
		}
		
		if(js instanceof KyoinJisa) {
			kij= (KyoinJisa) js ;
			kij.setProName(sc.next());
			sc.nextLine();
			System.out.print( kij +"지사 " + kij.getProName() + " 판매량은? ");
			kij.setSaleAmount( sc.nextInt() );
			kij.setSaleSatus( saleStatusMethod( kij.getProName(), kij.getSaleAmount() ) );
			kij.setProPrice(   proPriceInput( kij.getProName() ) );
		}
		
		if(js instanceof KawonJisa) {
			kaj= (KawonJisa) js ;
			kaj.setProName(sc.next());
			sc.nextLine();
			System.out.print( kaj +"지사 " + kaj.getProName() + " 판매량은? ");
			kaj.setSaleAmount( sc.nextInt() );
			kaj.setSaleSatus( saleStatusMethod( kaj.getProName(), kaj.getSaleAmount() ) );
			kaj.setProPrice(   proPriceInput( kaj.getProName() ) );
		}
		
		if(js instanceof Jeju) {
			je= (Jeju) js ;
			je.setProName(sc.next());
			sc.nextLine();
			System.out.print( je +"지사 " + je.getProName() + " 판매량은? ");
			je.setSaleAmount( sc.nextInt() );
			je.setSaleSatus( saleStatusMethod( je.getProName(), je.getSaleAmount() ) );
			je.setProPrice(   proPriceInput( je.getProName() ) );
		}
	}

	public void output() {
		//출력역할
		System.out.println("---------------------------------------");
		System.out.println("----------- 각 지사별 판매 현황 ------------");
		System.out.println("----------------------------------------");
		System.out.printf("%12s %10s %10s %10s %10s\n", "지사명", "제품명", "제품가격","판매량", "매출현황");
		System.out.printf("%12s %10s %10s %10s %10s\n", sj+"지사", sj.getProName(), sj.getProPrice(), sj.getSaleAmount(), sj.getSaleSatus() );
		System.out.printf("%12s %10s %10s %10s %10s\n", kij+"지사", kij.getProName(), kij.getProPrice(), kij.getSaleAmount(), kij.getSaleSatus() );
		System.out.printf("%12s %10s %10s %10s %10s\n", kaj+"지사", kaj.getProName(), kaj.getProPrice(), kaj.getSaleAmount(), kaj.getSaleSatus() );
		System.out.printf("%12s %10s %10s %10s %10s\n", je+"지사", je.getProName(), je.getProPrice(), je.getSaleAmount(), je.getSaleSatus() );		

	}
	
	private int saleStatusMethod(String proName, int amount) {
		//매출현황담당
		int saleStatus=0; //매출현황 
		if(proName.equals("컴퓨터")) {
			saleStatus = 2000000 * amount;
		}else if(proName.equals("프린터")) {
			saleStatus = 500000 * amount;
		}else {
			System.out.println( "제품을 잘못 입력했습니다.");
		}
		return saleStatus;
	}
	
	//제품가격 판단하는 메소드
	private int proPriceInput(String proName) {
		if(proName.equals("컴퓨터")) return 2000000;
		else if(proName.equals("프린터")) return 500000;
		return 0;
	}

}
