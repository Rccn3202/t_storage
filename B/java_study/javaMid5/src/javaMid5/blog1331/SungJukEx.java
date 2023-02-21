package javaMid5.blog1331;

import java.util.Scanner;

public class SungJukEx {
	
	static Scanner sc=null; //�������� ��� �޼ҵ忡�� �̿��� �� ����
    
	static SungJukBusiness sb;
	public static void main(String[] args) {
		SungJuk e1 = new ElementaryStudent();
		SungJuk m1 = new MiddleSchooler();
		SungJuk h1 = new HighSchoolStudent();
		sb = new SungJukBusiness();
		boolean end=false;
		sc = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("----------------------------------");
			System.out.println("1. �ʵ��б� 2. ���б� 3. ����б� 4. ����");
			System.out.println("----------------------------------");
			System.out.print("����>");
			menu = sc.nextInt();
			switch(menu) {
				case 1: elementaryStudent( e1 ); break;
				case 2: middleSchooler( m1 ); break;
				case 3: heighSchoolerStudent( h1 ); break;
				case 4: end = true; break;
				default : System.out.println("�޴��� �߸���(1~3)");
			}
		}while( !end );
     }

	private static void heighSchoolerStudent(  SungJuk h1 ) {
		// TODO Auto-generated method stub
		int menu=0;
		boolean end=false;
		do {
			System.out.println("------------------------");
			System.out.println("����б� �������� ���α׷� ");
			System.out.println("------------------------");
			System.out.println("1. �Է� 2. ��� 3. ���ε��ư���");
			System.out.println();
			System.out.print("����>");
			menu = sc.nextInt();
			switch(menu) {
				case 1: sb.input( h1 );break;
				case 2: sb.print( h1 ); break;
				case 3: end=true; break;
			}
		}while( !end ); 
	}

	private static void middleSchooler( SungJuk m1 ) {
		// TODO Auto-generated method stub
		int menu=0;
		boolean end=false;
		do {
			System.out.println("------------------------");
			System.out.println("���б� �������� ���α׷� ");
			System.out.println("------------------------");
			System.out.println("1. �Է� 2. ��� 3. ���ε��ư���");
			System.out.println();
			System.out.print("����>");
			menu = sc.nextInt();
			switch(menu) {
				case 1: sb.input( m1 );break;
				case 2: sb.print( m1 ); break;
				case 3: end=true; break;
			}
		}while( !end ); 
	}

	private static void elementaryStudent( SungJuk e1 ) {
		// TODO Auto-generated method stub
		// �޴��� ���� �Է� �ޱ� 
		int menu=0;
		boolean end=false;
		do {
			System.out.println("------------------------");
			System.out.println("�ʵ��б� �������� ���α׷� ");
			System.out.println("------------------------");
			System.out.println("1. �Է� 2. ��� 3. ���ε��ư���");
			System.out.println();
			System.out.print("����>");
			menu = sc.nextInt();
			switch(menu) {
			case 1: sb.input( e1 );break;
			case 2: sb.print( e1 ); break;
			case 3: end=true; break;
			}
		}while( !end ); 		
	}

}

/*
1. �⺻����
  �θ�Ŭ���� : �����, ����, �߰����, �⸻���, ������
  �ڽ�Ŭ���� : �ʵ��л� - �θ�Ŭ���� �״�� ���
            ���л� - �θ�Ŭ���� ���, ��米��, �⼮����, ��������
            ����л� - �θ�Ŭ���� ���л� ���, ǥ������
  ����Ͻ� Ŭ���� : �Է¹ޱ�, ���� �ջ��ϱ�, ����ϱ�
  ���� Ŭ���� : ����Ͻ� Ŭ���� ȣ���ϱ�, ���� �޴� ȭ�� �����, ����Ͻ� Ŭ���� �޼ҵ� ȣ���ϱ�

2. �󼼼���
   SungJuk.java : subject,score, midtermExam, finals, performanceEvalution
   ElementaryStudent.java - �ʵ��л�
   MiddleSchooler - ���л� teacher ��米��, attendance - �⼮, service-���� 
   HighSchoolStudent - ����л� standardDeviation - ǥ������
*/



