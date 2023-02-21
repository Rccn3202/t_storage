package javaMid3.b1318;

public class CaptionTv extends Tv{
   String text;
   void caption() { System.out.println( "3D입체 TV"); }
   
   @Override
	void channelUp() {
		System.out.println("자식 것");
		channel += 5;
	}
}