package javaBasic2.ch05.day02;

import java.util.Scanner;

public class ClassEx01 {
	public static void main(String[] args) {
		// 1. Ŭ������ �ʵ忡 ���� ���� �־��ش�.
        Product product = new Product();
        //�Է� ����ϴ� �޼ҵ� 
        inputM( product  );
        
        Product product1 = new Product();
        inputM( product1  );
        
        Product product2 = new Product();
        inputM( product2  );
       
        //�Ǹűݾ� ���ϱ�
        int salePrice = product.salePriceMethod(product.proPrice, product.proCnt);
        
        //�޼� ���ϱ�
        String attainMent = product.attainMentMethod(salePrice);
        
        System.out.println("����ϱ�");
        System.out.println(" ��ǰ�ڵ�   ��ǰ��  ����   ���� �Ǹűݾ�  �޼�");
        System.out.println(product.proId + " " + product.proName + " " + product.proPrice + " " + product.proCnt + " " + salePrice + " " + attainMent);
        
        //�Ǹűݾ� ���ϱ�
        salePrice = product1.salePriceMethod(product1.proPrice, product1.proCnt);
        
        //�޼� ���ϱ�
        attainMent = product1.attainMentMethod(salePrice);
       
        System.out.println(product1.proId + " " + product1.proName + " " + product1.proPrice + " " + product1.proCnt + " " + salePrice + " " + attainMent);
        
        //�Ǹűݾ� ���ϱ�
        salePrice = product2.salePriceMethod(product2.proPrice, product2.proCnt);
        
        //�޼� ���ϱ�
        attainMent = product2.attainMentMethod(salePrice);
        
        System.out.println(product2.proId + " " + product2.proName + " " + product2.proPrice + " " + product2.proCnt + " " + salePrice + " " + attainMent);
     
	}//���� �޼ҵ�
   
	static void inputM(Product product) {
		//�Է� ��� 
	   System.out.println("---------");	
	   System.out.println("������Ʈ �Ǹ�");
	   System.out.println("----------");
	   System.out.println();
	   
	   System.out.println("�Է�ȭ��");
	   // �Է� ��������? 3�� �ޱ�
 
	   Scanner sc = new Scanner(System.in);
	   System.out.println();
	   System.out.print( "��ǰ�ڵ�> ");
	   product.proId = sc.next();
	   System.out.print( "��ǰ��> ");
	   product.proName = sc.next();
	   System.out.print( "����> ");
	   product.proPrice = sc.nextInt();
	   System.out.print( "����> ");
	   product.proCnt = sc.nextInt();

	}
}// end ClassEx01


//������ Ŭ���� ���� �� �ǽ��� ����
class Product{
	 String proId;
	 String proName;
	 int proPrice;
	 int proCnt;
	 int salePrice;//�Ǹűݾ�
	 
	 int salePriceMethod( int proPrice, int proCnt  ) {
		return proPrice * proCnt;
	 } //�Ǹűݾױ��ϱ� 
	 
	 String attainMentMethod(int salePrice ) {
		if (salePrice >= 100000) return "����";
		else return "���";
	 }//�޼����ϱ�
}