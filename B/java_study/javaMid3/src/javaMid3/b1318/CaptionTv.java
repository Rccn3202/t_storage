package javaMid3.b1318;

public class CaptionTv extends Tv{
   String text;
   void caption() { System.out.println( "3D��ü TV"); }
   
   @Override
	void channelUp() {
		System.out.println("�ڽ� ��");
		channel += 5;
	}
}