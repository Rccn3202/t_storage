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
		//�Է¿���
		String yn="n";
		do {
			System.out.println("�����?");
			System.out.println("1. ��������  2. �������� 3. �������� 4. ��������");
			System.out.print("������?");
			int jisaSelect=0;
			jisaSelect = sc.nextInt();
			switch(jisaSelect) {
			   case 1: jisaInput(sj);break;
			   case 2: jisaInput(kij); break;
			   case 3: jisaInput(kaj); break;
			   case 4: jisaInput(je); break;
			}
			
			System.out.print("��� �Ͻðڽ��ϱ�?(y/n)");
			yn = sc.next();
			sc.nextLine();
		}while( yn.equalsIgnoreCase("y") );
	}

	private void jisaInput(Jisa js) {
		
		System.out.print("��ǰ��?");

		if(js instanceof SeoulJisa) {
			sj= (SeoulJisa) js ;
			sj.setProName(sc.next());
			sc.nextLine();
			System.out.print( sj +"���� " + sj.getProName() + " �Ǹŷ���? ");
			sj.setSaleAmount( sc.nextInt() );
			sj.setSaleSatus( saleStatusMethod( sj.getProName(), sj.getSaleAmount() ) );
			sj.setProPrice(   proPriceInput( sj.getProName() ) );
			//System.out.println( sj.getProName() + "  " + sj.getSaleAmount()  + " " +  sj.getSaleSatus());
		}
		
		if(js instanceof KyoinJisa) {
			kij= (KyoinJisa) js ;
			kij.setProName(sc.next());
			sc.nextLine();
			System.out.print( kij +"���� " + kij.getProName() + " �Ǹŷ���? ");
			kij.setSaleAmount( sc.nextInt() );
			kij.setSaleSatus( saleStatusMethod( kij.getProName(), kij.getSaleAmount() ) );
			kij.setProPrice(   proPriceInput( kij.getProName() ) );
		}
		
		if(js instanceof KawonJisa) {
			kaj= (KawonJisa) js ;
			kaj.setProName(sc.next());
			sc.nextLine();
			System.out.print( kaj +"���� " + kaj.getProName() + " �Ǹŷ���? ");
			kaj.setSaleAmount( sc.nextInt() );
			kaj.setSaleSatus( saleStatusMethod( kaj.getProName(), kaj.getSaleAmount() ) );
			kaj.setProPrice(   proPriceInput( kaj.getProName() ) );
		}
		
		if(js instanceof Jeju) {
			je= (Jeju) js ;
			je.setProName(sc.next());
			sc.nextLine();
			System.out.print( je +"���� " + je.getProName() + " �Ǹŷ���? ");
			je.setSaleAmount( sc.nextInt() );
			je.setSaleSatus( saleStatusMethod( je.getProName(), je.getSaleAmount() ) );
			je.setProPrice(   proPriceInput( je.getProName() ) );
		}
	}

	public void output() {
		//��¿���
		System.out.println("---------------------------------------");
		System.out.println("----------- �� ���纰 �Ǹ� ��Ȳ ------------");
		System.out.println("----------------------------------------");
		System.out.printf("%12s %10s %10s %10s %10s\n", "�����", "��ǰ��", "��ǰ����","�Ǹŷ�", "������Ȳ");
		System.out.printf("%12s %10s %10s %10s %10s\n", sj+"����", sj.getProName(), sj.getProPrice(), sj.getSaleAmount(), sj.getSaleSatus() );
		System.out.printf("%12s %10s %10s %10s %10s\n", kij+"����", kij.getProName(), kij.getProPrice(), kij.getSaleAmount(), kij.getSaleSatus() );
		System.out.printf("%12s %10s %10s %10s %10s\n", kaj+"����", kaj.getProName(), kaj.getProPrice(), kaj.getSaleAmount(), kaj.getSaleSatus() );
		System.out.printf("%12s %10s %10s %10s %10s\n", je+"����", je.getProName(), je.getProPrice(), je.getSaleAmount(), je.getSaleSatus() );		

	}
	
	private int saleStatusMethod(String proName, int amount) {
		//������Ȳ���
		int saleStatus=0; //������Ȳ 
		if(proName.equals("��ǻ��")) {
			saleStatus = 2000000 * amount;
		}else if(proName.equals("������")) {
			saleStatus = 500000 * amount;
		}else {
			System.out.println( "��ǰ�� �߸� �Է��߽��ϴ�.");
		}
		return saleStatus;
	}
	
	//��ǰ���� �Ǵ��ϴ� �޼ҵ�
	private int proPriceInput(String proName) {
		if(proName.equals("��ǻ��")) return 2000000;
		else if(proName.equals("������")) return 500000;
		return 0;
	}

}
