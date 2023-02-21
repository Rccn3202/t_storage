package javaMid3.p300;

public class Marine  extends Unit{
	
  void stimPack() {
	  //스팀팩을 사용한다.
	  System.out.println("스팀팩을 사용한다.");
  }
  
  @Override
  void move(int x, int y) {
		super.x = x + 10; //또는 	this.x = x + 10; 동일함. this는 자기자신이란 뜻인데 없으면 부모 클래스 변수것
	    super.y = y - 10;
	    System.out.println( "보병 위치 : " + super.x + ", " + super.y);
  }
  @Override
  void stop() {
		System.out.println("보병 현재 위치에서 정지");
  }
  
}
