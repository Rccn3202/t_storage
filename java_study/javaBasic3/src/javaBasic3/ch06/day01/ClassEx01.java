package javaBasic3.ch06.day01;

public class ClassEx01 {

	public static void main(String[] args) {
		// ������
        Car car = new Car(); //�⺻�����ڸ� ȣ���Ѵ�.
        //�����ڴ� ��ü�� �����ɶ��� �����
        //�����ڴ� �뵵�� ��ü�� �����ɶ� ó������ ���� ���� �����Ѵ�
        
        Car car1 = new Car( "�׷���" );
        Car car2 = new Car("K5", 4000);
        Car car3 = new Car("Model Y", 10000, "�׽���" );
        
        System.out.println( car.getCarName() );
        System.out.println( car.getCarPrice() );
        System.out.println( car.getCarMan() );
        
        System.out.println( car1.getCarName() );
        System.out.println( car1.getCarPrice() );
        System.out.println( car1.getCarMan() );
        
        System.out.println( car2.getCarName() );
        System.out.println( car2.getCarPrice() );
        System.out.println( car2.getCarMan() );
        
        System.out.println( car3.getCarName() );
        System.out.println( car3.getCarPrice() );
        System.out.println( car3.getCarMan() );
	}
}
