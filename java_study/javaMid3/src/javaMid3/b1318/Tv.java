package javaMid3.b1318;

public class Tv {
   boolean power;//전원 필드
   int channel; //채널
   void power() {
	   power = !power;
   }
   void channelUp() { ++channel; }
   void channelDown() { --channel; }
   
}
