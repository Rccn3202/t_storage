package javaMid3.p300;

public class Marine  extends Unit{
	
  void stimPack() {
	  //�������� ����Ѵ�.
	  System.out.println("�������� ����Ѵ�.");
  }
  
  @Override
  void move(int x, int y) {
		super.x = x + 10; //�Ǵ� 	this.x = x + 10; ������. this�� �ڱ��ڽ��̶� ���ε� ������ �θ� Ŭ���� ������
	    super.y = y - 10;
	    System.out.println( "���� ��ġ : " + super.x + ", " + super.y);
  }
  @Override
  void stop() {
		System.out.println("���� ���� ��ġ���� ����");
  }
  
}
