package ch02.sec01;

public class VarEx {

	public static void main(String[] args) {
		// 37, 38 3�� ���α׷� �� ����
      int value=5; //4 ����Ʈ
      int result = value + 10;
      
      int hour=3;
      int minute=5;
      int totalMinute = hour * 60 + 5;
      System.out.println("�� ��� =>" + (hour * 60 + 5) );
      System.out.println("�� ��� =>" + totalMinute);
      int x=3, y=5;
      swap(x, y);
      System.out.println("x=" + x + " y= " + y + "�̰��� ���θ޼ҵ���");
       
      int bkor = 0b1111; //2���� 41�������� �ִ� �� �Է��ϱ�
      System.out.println(bkor);
      
      int var1 = 0b1011;
      int var2 = 0206;
      int var3 = 356; 
      int var4 = 0xB3;
      
      
      
	}//end main()

	static void swap(int x, int y) {
		 int temp = y; // temp = 5
	      y = x;  //y=3
	      x = temp; //x = 5
	      System.out.println("x=" + x + " y= " + y + " �̰��� swap�޼ҵ���");
	}
	
	//�ڷ��� 15 ���� -128~127������ ���� 1byte 
	byte kor = 10;
	short eng = 85;
	int mat=90;
	long sci = 86;
	byte kor1=89;
		
	byte total = (byte) (kor * kor1); //1byte +  1byte =1byte ��Ģ������ ��ȣ�� 4����Ʈ ������
	
	
	
}//end class


