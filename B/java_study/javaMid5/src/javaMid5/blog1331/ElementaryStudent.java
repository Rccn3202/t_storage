package javaMid5.blog1331;

public class ElementaryStudent  extends SungJuk{
   @Override
	public String toString() {
		return "�ʵ��л�";
	}
   
   @Override
	void printAll() {
		System.out.println("------------");
		System.out.println("�ʵ��б� �����Դϴ�" );
		System.out.println("--------------");
		System.out.println("����� :"  + getSubject() );
		System.out.println("���� : �߰���� " + getMidtermExam() + ", �⸻��� : " + getFinals() + ", ������ :" + getPerformanceEvalution()  );
	    System.out.println("���� : " + getScore() );
   }
}
