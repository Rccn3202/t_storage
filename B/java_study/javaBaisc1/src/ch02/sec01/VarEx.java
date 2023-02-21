package ch02.sec01;

public class VarEx {

	public static void main(String[] args) {
		// 37, 38 3개 프로그램 해 보기
      int value=5; //4 바이트
      int result = value + 10;
      
      int hour=3;
      int minute=5;
      int totalMinute = hour * 60 + 5;
      System.out.println("총 몇분 =>" + (hour * 60 + 5) );
      System.out.println("총 몇분 =>" + totalMinute);
      int x=3, y=5;
      swap(x, y);
      System.out.println("x=" + x + " y= " + y + "이곳은 메인메소드쪽");
       
      int bkor = 0b1111; //2진수 41페이지에 있는 것 입력하기
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
	      System.out.println("x=" + x + " y= " + y + " 이곳은 swap메소드쪽");
	}
	
	//자료형 15 숫자 -128~127사이의 숫자 1byte 
	byte kor = 10;
	short eng = 85;
	int mat=90;
	long sci = 86;
	byte kor1=89;
		
	byte total = (byte) (kor * kor1); //1byte +  1byte =1byte 사칙연산의 부호는 4바이트 차지함
	
	
	
}//end class


