package javaMid3.p300;

public class Dropship extends Unit{
   void load( Marine marine) {
	   //선택된 대상을 태운다
	   System.out.println( "수송선 보병 위치 (" + marine.getX() +", " + marine.getY() +")에서 태운다.");
   }
   void unload(Tank tank) {
	   //선택된 대상을 내린다.
	   System.out.println("수송선 탱크 위치 ( " + tank.getX() + ", " + tank.getY() +")에서 탱크병을 내린다.");
   }
   @Override
	void move(int x, int y) {
		super.x = x - 100;
		super.y = y - 500;
	}
   @Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println( "수송선의 현재 위치에서 정지");
	}
   void end() {
	   System.out.println( "수송선의 현재 위치에서 정지");
   }
   
}
