package javaBaisc1;

import java.util.Scanner;

public class VarEx6 {

	public static void main(String[] args) {
		// �̸�, �⵵ �Է� �޴´�. ���� ����ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("���� ����ϴ� ���α׷�");
        System.out.println("----------------");
        System.out.print("�̸���==> ");
        String name = sc.next();
        System.out.print("����� �¾ �⵵��==>");
        int birthYear = sc.nextInt();
        int age = 2023 - birthYear;
        
        System.out.println(" ���� " + name + "�� ���̴� " + age + "�� �̽ʴϴ�.");
        //���� ���� 0~7�� ���� 8��~13�� ��� 14~19�� û�ҳ� 20~60�� � 61~ ���� { } ���)��
 /*       if( 0<=age && age <=7) {
        	System.out.println("����");
            System.out.println("������ 100���� ��������");
        } else if( 8<=age && age <=13) {
        	System.out.println("���");
            System.out.println("������ 50���� ��������");
        } else if( 14<=age && age <=19) {
        	System.out.println("û�ҳ�");
            System.out.println("������ 20���� ��������");
        } else if( 20<=age && age <=60) {
        	System.out.println("�");
            System.out.println("������ 20���� ������");
        } else {
        	System.out.println("����");
            System.out.println("������ 30���� ��������");
        } */
        
        // ageType : ���̺� Ÿ��(����, ���, ...)  subsidy=100 -20 //������ �޴� �� + ���� �� - 
        
        String ageType=null; //���̺� Ÿ��  null ��ü�ȿ� ���� ���� ���� �ʾҴ�. ���߿� ���� �ž�  
        int subsidy=0; //������ 
        
        if( 0<=age && age <=7) {
        	ageType="����";
            subsidy=100;
        } else if( 8<=age && age <=13) {
        	ageType="���";
        	subsidy=50;
        } else if( 14<=age && age <=19) {
        	ageType="û�ҳ�";
        	subsidy=20;
        } else if( 20<=age && age <=60) {
        	ageType="�";
        	subsidy=-20;
        } else if( age >= 61){
        	ageType="����";
        	subsidy=30;
        }
      
        
        
        
        //���� ������ ���� ������ 100������ �������� ��� ��� ������ 50������ �������� 
        //    û�ҳ��� ��� 20������ �������� ������ ��� ������ 30������ ��������
        //    ��� ��� ������ 20������ ������ �̷��� ����� �ּ���.
        
        //��� ���θ� ��� ���� �ֽ��ϱ�?
        //���� ������ true ������ fasle
        //��� ���� �ִ� ����� 10%�� �� ����, ���� ���� ������ 10% �� �ޱ�
        boolean  houseOx = false; //����������
        if( ageType.equals("�") || ageType.equals("����")) {
        	System.out.println("���� ������ true, ������ false �Է��� �ּ��� ");
        	houseOx = sc.nextBoolean();
        	if( ageType.equals("�")  && houseOx) {
        		//��̰� ���� ������ 
        		subsidy = subsidy + (int) (subsidy * 0.1);
        	}else if( ageType.equals("����") && houseOx ) {
        		//�����̰� ���� ������ 
        		subsidy = subsidy - (int) (subsidy * 0.1);
        	}
        }
        
        if (subsidy >= 0)
            System.out.println("111 ����� " + ageType + "�Դϴ�. ���� ������ " + subsidy + " ������ ��������");
        else
            System.out.println("111 ����� " + ageType + "�Դϴ�. ���� ������ " + Math.abs(subsidy) + " ������ ������");	
          
          // ageType "�"�̸� ������ ��� ����ϰ� ����� ���ڿ��� ���ٴ� ������.equals("���ڿ�") ageType.equals("�") 
          
        if ( ageType.equals("�") )
          	System.out.println("222����� " + ageType + "�Դϴ�. ���� ������ " + Math.abs(subsidy) + " ������ ������");	
        else
            System.out.println("222����� " + ageType + "�Դϴ�. ���� ������ " + subsidy + " ������ ��������");
       
	}
}
