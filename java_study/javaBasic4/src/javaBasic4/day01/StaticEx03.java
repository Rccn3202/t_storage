package javaBasic4.day01;

public class StaticEx03 {

	static boolean a=true;
	static float b=2.56f;
	static double c=78.56;
	
	String city="seoul";
	int age=20;
    
	public static void main(String[] args) {
      //��� ����ϼ���		
        System.out.println(a + " " +  b + " "+ c);
        StaticEx03 se03 = new StaticEx03();
        System.out.println( se03.city + " " + se03.age ); 
        se03.printA();
	}
	//�ν��Ͻ� �޼ҵ�
	public void printA( ) {
		//�̰��� ���ؼ� ��� ����� ������
		System.out.println(a + " " +  b + " "+ c);
		System.out.println( city + "  " + age);
	}
}
