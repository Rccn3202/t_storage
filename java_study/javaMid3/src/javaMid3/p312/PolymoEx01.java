package javaMid3.p312;

public class PolymoEx01 {

	public static void main(String[] args) {
		// 다형성 Animal animal = new Cat();
         Animal animal = new Cat();
         
         //작은 타입은 자식클래스, 큰타입은 부모클래스
         // 
         Cat cat = new Cat();
         
     //    Cat cat1 = new Animal();  부모클래스의 인스턴스한 것은 자식의 자료형 받을 수 없다
     // 왜 안되냐면 new Animal() 하면 부모 클래스만 메모리에 있으니깐  잘못된 문법임    
         
         int a=10;
         double b = a; //작은 타입의 정수형 자료가 큰타입의 실수형 자료 들어가니깐 에러 없음
         
	}
}
