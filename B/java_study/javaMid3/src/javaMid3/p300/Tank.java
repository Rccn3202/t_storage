package javaMid3.p300;

public class Tank extends Unit{
   void changeMode() {
	   //���ݸ�带 ��ȯ�Ѵ�.
	   System.out.println( "���ݸ�带 ��ȯ�Ѵ�. ");
   }
   @Override
	void move(int x, int y) {
		 super.x = x - 50;
		 super.y = y + 50;
		 System.out.println( "��ũ�� ��ġ : " + super.x + ", " + super.y);
	}
   @Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("��ũ�� ���� ��ġ���� ����");
	}
   
   void end() {
	   System.out.println("��ũ�� ���� ��ġ���� ����"); 
   }
}
