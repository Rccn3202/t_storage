package javaMid3.b1318;

public class Tv {
   boolean power;//���� �ʵ�
   int channel; //ä��
   void power() {
	   power = !power;
   }
   void channelUp() { ++channel; }
   void channelDown() { --channel; }
   
}
