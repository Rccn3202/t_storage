package javaMid3.p300;

public class Dropship extends Unit{
   void load( Marine marine) {
	   //���õ� ����� �¿��
	   System.out.println( "���ۼ� ���� ��ġ (" + marine.getX() +", " + marine.getY() +")���� �¿��.");
   }
   void unload(Tank tank) {
	   //���õ� ����� ������.
	   System.out.println("���ۼ� ��ũ ��ġ ( " + tank.getX() + ", " + tank.getY() +")���� ��ũ���� ������.");
   }
   @Override
	void move(int x, int y) {
		super.x = x - 100;
		super.y = y - 500;
	}
   @Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println( "���ۼ��� ���� ��ġ���� ����");
	}
   void end() {
	   System.out.println( "���ۼ��� ���� ��ġ���� ����");
   }
   
}
