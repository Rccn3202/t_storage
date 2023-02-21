package javaMid3.p300;

public class Tank extends Unit{
   void changeMode() {
	   //공격모드를 변환한다.
	   System.out.println( "공격모드를 변환한다. ");
   }
   @Override
	void move(int x, int y) {
		 super.x = x - 50;
		 super.y = y + 50;
		 System.out.println( "탱크의 위치 : " + super.x + ", " + super.y);
	}
   @Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("탱크의 현재 위치에서 정지");
	}
   
   void end() {
	   System.out.println("탱크의 현재 위치에서 정지"); 
   }
}
