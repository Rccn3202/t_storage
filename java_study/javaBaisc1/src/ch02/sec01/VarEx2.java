package ch02.sec01;

import java.util.Scanner;

public class VarEx2 {

	public static void main(String[] args) {
		//���� 43
		//���� �ѱ��� 'a' ��ǻ�ͻ���ϴ� �� ���蹮�ڴ� �����ڵ�� ����ص� 
		char aWord='a';//97 - ?  = 65
		System.out.println( (char) (aWord - 32));

		//���� �빮�� K�� ���� �ֱ� --> �ҹ��� s�� ����ϱ� 
        char kWord='K';
        System.out.println( (char) (kWord + 40 ));
		//���� ���� �̸��� �����ڵ� ���� �˾ƺ���
		char name1='��';
		char name2='��';
		char name3='��';
		System.out.println((int) (name1) + "  " + (int) name2 + "  " + (int) name3 );
	
		//�������� ���ڿ� " " ���ڿ� ��ü�� String�� ����Ѵ�.
		String name = "������";  //1 3����Ʈ 2 6����Ʈ 3 9����Ʈ 
		
		String hakbun = "221208"; //���ڿ� --> ���������� �ٲٱ� 
		System.out.println(Integer.valueOf( hakbun ) + 1 ); //1byte = 8bit
		
		String avgS = "52.3"; // 52.2 + 100 = 152.2
		// ���ڿ��� ��� �ȵǴϱ� ���ڿ��� �Ǽ������� �ٲ�� �Ѵ�.
		float convAvg=Float.parseFloat(avgS); //"52.3" --> 52.3
		convAvg = convAvg + 100;
		System.out.println(convAvg);
		
		double convAvg1 = Double.parseDouble(avgS);
		convAvg1 = convAvg1 + 100;
		System.out.println(convAvg1+"~~");
		
		String ����="false"; // "true"-->true
		//���ڿ� "true"�� �Ҹ���(��)���� ��ȯ�ϼ���
		boolean ��ȯ�Ѽ��� = Boolean.parseBoolean(����);
		System.out.println(��ȯ�Ѽ���);
		if (��ȯ�Ѽ���)
			System.out.println("����");
		else 
			System.out.println("����");
		
		
		
		// �׸��� 100�� ���ؼ� ��� �Ѵ�.
		// 10�� ���� 10�ñ��� 
		
		
		//���� �й��� ��������� �й��� ���Ͻÿ� �� 221209
		int hakbun1 = 221208;
		// System.out.println("���� ����� �й��� " + (hakbun1 + 1)  );
		
		
		//�ڵ�Ÿ�Ժ�ȯ
		byte v1=10; //1byte
		int v2=20; //4byte
		
		v2 = v1;  //v2 = 10  byte���� ���� int������ ���� ū ������ �̵��ϴϱ� ������ ����
		
		//������ ��ȯ
		v1 =( byte ) v2; //v2�� ���� v1�� �ִ´� �� int���� byte������ ����. ū���� ���� ������ ��
		
		int v3=50; //������
		double v4 = 10.0; //8����Ʈ �Ǽ���
		float v5=20.5f; //4����Ʈ �Ǽ���
		
		v4 = v3;
		v4 = v5;
		v3 = (int)v4;//������ �Ǽ���
		v3 = (int) v5;
		v5 = (float)v4;
		
		
		//���� ����2���� �Է¹޾Ƽ� ��Ģ������ ������
		Scanner sc = new Scanner(System.in); //Ű���� �Է��� ����ϴ� Scanner Ŭ������ ����Ѵ�
		
//		int x = sc.nextInt();//Ű���忡�� ������ �Է� �޴´� 
//		System.out.println("�Է°� " + x);
//		
//		int y = sc.nextInt();
//		System.out.println("�Է°� " + y);
//		
//		//double������ �Ǽ� 2���� �Է� ��������
//		double z = sc.nextDouble();
//		System.out.println("�Ǽ��Է°�1 " + z);
//		
//		double z1 = sc.nextDouble();
//		System.out.println("�Ǽ��Է°�2 " + z1);
		
		//boolean�� 2���� �Է¹������� �Է��� true false�� ���ݴϴ�
/*       boolean b1 = sc.nextBoolean();
         System.out.println("����1 ==>" + b1);
         
         boolean b2 = sc.nextBoolean();
         System.out.println("����2 ==>" + b2);
*/		
		//���ڿ��� 2���� �Է¹������� �Է��� "�ڹ�" "����ִ�"�� ���ݴϴ�.
		//nextLine()-�Է¹ް� ������ ������. �Ǵ� next()�� ����ϼ���
		String s1 = sc.next();
		System.out.println("������1==>" + s1);
		
		String s2 = sc.next();
		System.out.println("������2==>" + s2);
		
		
		
		
		
	}
}
