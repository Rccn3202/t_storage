package javaMid5.blog1331;

import java.util.Scanner;

public class SungJukBusiness {
   //�Է¹ޱ�
	 void input(SungJuk sj) {
	 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("�������?");
		 sj.setSubject(  sc.next() );
		 sc.nextLine();
		 System.out.println("�������� �Է��ϼ���");
		 System.out.print("�߰�����?");
		 sj.setMidtermExam( sc.nextInt() );
		 sc.nextLine(); //�Է��ϰ� ���� �κ� ó��
		 System.out.print("�⸻����?");
		 sj.setFinals( sc.nextInt() );
		 sc.nextLine(); //�Է��ϰ� ���� �κ� ó��
		 System.out.print("������?");
		 sj.setPerformanceEvalution( sc.nextInt() );
		 sc.nextLine(); //�Է��ϰ� ���� �κ� ó��
          
		 if(sj instanceof ElementaryStudent ) {
			 calc( sj );
		 } else if( sj instanceof MiddleSchooler) {
			 MiddleSchooler ms = (MiddleSchooler) sj;
			 System.out.print("��米��?");
			 ms.setTeacher( sc.next() );
			 sc.nextLine(); //�Է��ϰ� ���� �κ� ó�� 
			
			 System.out.print("�⼮����?");
			 ms.setAttendance( sc.nextInt() );
			 sc.nextLine(); //�Է��ϰ� ���� �κ� ó��
			 
			 System.out.print("��������?");
			 ms.setServie( sc.nextInt() );
			 sc.nextLine(); //�Է��ϰ� ���� �κ� ó��
			 
			 calc( ms );  
		 } else if(sj instanceof HighSchoolStudent) {
			 HighSchoolStudent hs = (HighSchoolStudent) sj;
			 System.out.print("��米��?");
			 hs.setTeacher( sc.next() );
			 sc.nextLine(); //�Է��ϰ� ���� �κ� ó�� 
			
			 System.out.print("�⼮����?");
			 hs.setAttendance( sc.nextInt() );
			 sc.nextLine(); //�Է��ϰ� ���� �κ� ó��
			 
			 System.out.print("��������?");
			 hs.setServie( sc.nextInt() );
			 sc.nextLine(); //�Է��ϰ� ���� �κ� ó��
			 
			 calc( hs );   
		 }
		 
    }
   //��¹ޱ�
	 void print(SungJuk e1) {
		 e1.printAll();
	 }
   //�������
	 void calc(SungJuk e1) {
		 if( e1 instanceof ElementaryStudent) {
		   e1.setScore( e1.getMidtermExam() + e1.getFinals() + e1.getPerformanceEvalution() );
		 } else if( e1 instanceof HighSchoolStudent ) {
			HighSchoolStudent hs = (HighSchoolStudent) e1; 
		    hs.setScore( hs.getMidtermExam() + hs.getFinals() + hs.getPerformanceEvalution()  + hs.getAttendance() + hs.getServie() );
		    hs.setStandardDeviation( hs.getScore() * 0.253 ); //����(0.253)�� ǥ������ ���ϱ� 
		 } else if( e1 instanceof MiddleSchooler ) {
			MiddleSchooler ms = (MiddleSchooler) e1; 
			ms.setScore( ms.getMidtermExam() + ms.getFinals() + ms.getPerformanceEvalution()  + ms.getAttendance() + ms.getServie() );
		 }    
	 }
}