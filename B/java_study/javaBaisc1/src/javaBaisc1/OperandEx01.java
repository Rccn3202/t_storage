package javaBaisc1;

import java.util.Scanner;

public class OperandEx01 {

	public static void main(String[] args) {
		// ������1 ++a ���� ���� ������ a-- ���� ���� ������ 12�� 10�� ����
        // ������2 (a=a+1 a+=1) (a=a+2 a+=2)   (a=a+b  a+=b) (a=a-10  a-=10) (a = a* b a*=b) 
		//        
		int a=10;
		
        //11�� ����غ�����
        // a = a+1;
        // a++;
        // ++a;
        // System.out.println(a);

        //9�� ����ϱ�
        // a=a-1;
        //a--;
        //--a;
        //System.out.println(a);
        
        int b,c;
        //b������ 11�� �־ ����� �ּ���
        
        // b= ++a; //a=a+1 b=a  // 11 11
        b = a++; //b=a a=a+1  // 10 11
        System.out.println(a+ " " + b); 
        
        int d=20;
       // System.out.println(++d);//d=d+1 ��� 21
        System.out.println(d++); //����ϰ� d=d+1
        System.out.println(d);
      
        // ������2 (a=a+1 a+=1) (a=a+2 a+=2)   (a=a+b  a+=b) (a=a-10  a-=10) (a = a* b a*=b) 
        int e=10;
       // e = e - 8;
        e-=8;
        System.out.println(e);
        
        //������3
        //������  25/5=5 25/4 = 6.25
        int v1=25;
        int v2=4;
        System.out.println(v1/v2); //6�� ���´� ��? ����/����=���� 
        //�����ϱ� 1. �ڷ����� �Ǽ��� ����� 
        System.out.println(v1/(double) v2);
        //�����ϱ� 2. �ڷ����� ������ �״�� �ϰ� 2500 / 500 = 625�� ���ϰ� 625 / 100�� ����Ѵ�.
        //v1 = v1 * 100;
        v1 *= 100;
        //v2 = v2 * 100;
        System.out.println( v1 /(double) v2 / 100  );
        // >> ���� ����Ʈ������ << ���� ����Ʈ������ >>> 	���� ����Ʈ������ 2�ǹ���� ���ϰų� ���� �� ����ϴ� ������
        int v3 = 0b1011; //10���� 11�̴� 
        v3 = v3 >> 2; //�������� / 2^2  11 / 4 
        
       // v3 = v3 << 3; //�������� * 2^3
        System.out.println(v3 ); // 1011
        
        //���迬���� > �ʰ�, >= �̻�, < �̸�, <= ����, == ����, != ���� �ʴ� 
        int v4=100;
        System.out.println(v4 != 200);
        
        //��Ʈ ������ �̿� - ���ко� ���ںо� �ַ� ����մϴ�
        int v5 = 0b01011; //1 true 0 false
        int v6 = 0b10111;
        System.out.println( Integer.toBinaryString(v5 & v6) ) ;  // 00011
        System.out.println( Integer.toBinaryString(v5 | v6) ) ; //11111
        System.out.println( Integer.toBinaryString(v5 ^ v6) ) ;
        
        //���Կ����� = �캯�� �ִ� ���� �º�(������ ���;� ��)�� �������� 
        int v7 = 200;
        
       // int 200 = v7; X
        int v8 = v2+200;
       // int v2 + 200 = v8; X
        
        //���׿�����    (����)  ?  ��:����
        int v9=15;
        System.out.println(  (v9==10) ?  "�հ�" : "���հ�");
        
        String type="B";
        String result;
        result = (type.equals("A"))  ? "VIP���Դϴ�" : "�Ϲݰ��Դϴ�";
        System.out.println(result);
        
        //���� ���� ������ 50�� �Է��ϰ� 25�̻��̸� "����Ʈ���" �ƴϸ� "����Ʈ ����� �ƴմϴ�"��� ����ϱ�
        int n=50;
    /*    if(n>=25)
        	System.out.println("����Ʈ���");
        else
        	System.out.println("����Ʈ����� �ƴմϴ�"); */
        
        System.out.println( (n>=25) ? "����Ʈ���":"����Ʈ����� �ƴմϴ�" );
        
        //���� ������ ������ "�ڹ�"��� �Է��ϰ� �ڹٰ� �ƴϸ� "B����,C�����Դϴ�." �ڹ��̸� "A�����Դϴ�"��� ����ϱ�
        String word="�ڹ�";
        if( word.equals("�ڹ�") )
        	System.out.println("A����");
        else 
        	System.out.println("B,C�����Դϴ�");
        String result1 = (word.equals("�ڹ�"))? "A����":"B,C�����Դϴ�";
        System.out.println(result1);
        
        //���� ���� 2���� �Է� �޾Ƽ� ū ���ڸ� ����ϱ� ���׿����� ����ϱ�
  /*      Scanner sc = new Scanner(System.in);
        System.out.print("����1�� �Է�==>");
        int number1 =  sc.nextInt();
        System.out.print("����2�� �Է�==>");
        int number2 =  sc.nextInt();
        int maxNumber = (number1 >= number2 )   ? number1 : number2;
        System.out.println(maxNumber); */
        
        
        
        //���� ����3���� �Է¹޾Ƽ� ���� ���ڸ� ����ϱ� ���׿����� ����ϱ�
 /*       System.out.print("����1�� �Է�==>");
        number1 =  sc.nextInt(); //10   300
        System.out.print("����2�� �Է�==>");
        number2 =  sc.nextInt(); //20    150
        System.out.print("����3�� �Է�==>");
        int number3 =  sc.nextInt(); //30  250
        
        maxNumber = ( number1 >= number2 ) ? number1: number2; //20  300 
        maxNumber = (maxNumber >= number3 ) ? maxNumber:number3;//30  300
        System.out.println(maxNumber); */
        
        //���� ����3���� �Է¹޾Ƽ� �߰� ���ڸ� ����ϱ� 
        //maxNumber minNumber ���� �ƴϸ� �߰� ����
        Scanner sc = new Scanner(System.in);
        System.out.print("����1�� �Է�==>");
        int number1 =  sc.nextInt(); //10   300
        System.out.print("����2�� �Է�==>");
        int number2 =  sc.nextInt(); //20    150
        System.out.print("����3�� �Է�==>");
        int number3 =  sc.nextInt(); //30  250
        
        int maxNumber = ( number1 >= number2 ) ? number1: number2; //20  300 
        maxNumber = (maxNumber >= number3 ) ? maxNumber:number3;//30  300
        
        int minNumber = ( number1 <= number2 ) ? number1: number2; //20  300 
        minNumber = (minNumber <= number3 ) ? minNumber:number3;//30  300
        
        //����Ǽ� 10 5 20, 5 10 20, 5 20 10 
        int midNumber=0;//�߰����� ���� ���� 
        if( number1 != maxNumber && number1 != minNumber ) 
        	midNumber = number1;
        if( number2 != maxNumber && number2 != minNumber) 
        	midNumber = number2;
        if( number3 != maxNumber && number3 != minNumber) 
        	midNumber = number3;
        
        System.out.println("�ִ밪�� " + maxNumber);
        System.out.println("�߰����� " + midNumber);
        System.out.println("�ּҰ��� " + minNumber);
  /*      
        System.out.println("����1 �Է�:");
        int e6 = sc.nextInt();
        System.out.println("����2 �Է�:");
        int e7 = sc.nextInt();
        System.out.println("����3 �Է�:");
        int e8 = sc.nextInt();	
        System.out.println((e6>=e7)?((e6>=e8)?((e7>=e8)?e7:e8):e6):((e6>=e8)?e6:((e7>=e8)?e8:e7)));

        System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int number11 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int number22 = sc.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ��� : ");
		int number33 = sc.nextInt();

		int result11 = (number11 <= number22) ? number11 : number22;
		int min = (result11 <= number33) ? result11 : number33;
		
		int result22 = (number11>= number22) ? number11 : number22;
		int max = (result22 >= number33) ? result22 : number33;
		int mid = (number11!= min && number11 != max) ? number11: ((number22 != min && number22 != max) ? number22 : number33);
		
		System.out.println(mid);
*/
	}

}
