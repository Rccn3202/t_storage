package javaBasic2.ch05.day02;

import java.util.Scanner;

public class ProjectEx01 {

	public static void main(String[] args) {
		// ������ Ŭ���� ������ �� �ڵ��ϱ� 
       Banchan ban1  = new Banchan();
       inputM(ban1);
       Banchan ban2  = new Banchan();
       inputM(ban2);
       Banchan ban3  = new Banchan();
       inputM(ban3);
       
       ban1.remainFoodM();
       ban2.remainFoodM();
       ban3.remainFoodM();
       
       printM(ban1, ban2, ban3);
       saleBestWestM(ban1, ban2, ban3);
	}
	
	public static void inputM(Banchan ban ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� >");
		ban.kind = sc.next();
		System.out.println("���� ���� >");
		ban.makeFood = sc.nextInt();
		System.out.println("�Ǹ� ���� >");
		ban.saleFood = sc.nextInt();
	}
	// Banchan b1 = ban1;
	public static void printM(Banchan b1,  Banchan b2, Banchan b3 ) {
	   	System.out.println(" ===  ���� �������� ������Ȳ ==== "); 
        System.out.println("����   ���簹��   �ǸŰ���   ��������");
        System.out.println(b1.kind + "    " + b1.makeFood + "     " + b1.saleFood + "     " + b1.remainFood );
        System.out.println(b2.kind + "    " + b2.makeFood + "     " + b2.saleFood + "     " + b2.remainFood );
        System.out.println(b3.kind + "    " + b3.makeFood + "     " + b3.saleFood + "     " + b3.remainFood );
	}
	//���� �� �ȸ��� ��, ���� �� �ȸ��� �� �Ǵ��ϴ� �޼ҵ�
	public static void saleBestWestM(Banchan b1,  Banchan b2, Banchan b3) {
		if(b1.perCalc >= b2.perCalc && b1.perCalc >= b3.perCalc) {
			System.out.println("���� �� �ȸ� ������ >" + b1.kind + " ���� >" + b1.perCalc);
		}else if(b2.perCalc >= b1.perCalc && b2.perCalc >= b3.perCalc) {
			System.out.println("���� �� �ȸ� ������ >" + b2.kind + " ���� >" + b2.perCalc);
		}else if(b3.perCalc >= b1.perCalc && b3.perCalc >= b1.perCalc) {
			System.out.println("���� �� �ȸ� ������ >" + b3.kind + " ���� >" + b3.perCalc);	
		}
		
		if(b1.perCalc <= b2.perCalc && b1.perCalc <= b3.perCalc) {
			System.out.println("���� �� �ȸ� ������ >" + b1.kind + " ���� >" + b1.perCalc);
		}else if(b2.perCalc <= b1.perCalc && b2.perCalc <= b3.perCalc) {
			System.out.println("���� �� �ȸ� ������ >" + b2.kind + " ���� >" + b2.perCalc);
		}else if(b3.perCalc <= b1.perCalc && b3.perCalc <= b1.perCalc) {
			System.out.println("���� �� �ȸ� ������ >" + b3.kind + " ���� >" + b3.perCalc);	
		}
		
	}	
}

class Banchan{
	String kind;//����
	int makeFood;//���� ����
	int saleFood;//�Ǹ� ����
    int remainFood;//���� ����
    double perCalc;//���� ������ ���� �����
    
    void remainFoodM() {
    	remainFood = makeFood - saleFood;
    	perCalc = saleFood / (double) makeFood * 100;
    }
    
    
  /*  ������ 
    �������� ���� 
    ����      ���簹��   �ǸŰ���  ��������
    ������    10         5               5 
    ����       5           3              2
    ������    15        11              4

    ���� �� �ȸ� ����  ����
    ���� �� �ȸ� ����  ������

    ���ȸ� ���� �� ����� 5/10 * 100 */ 
	
}
