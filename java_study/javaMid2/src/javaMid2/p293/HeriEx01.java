package javaMid2.p293;

public class HeriEx01 {
   public static void main(String[] args) {
	   Animal animal = new Animal();
	   animal.setFood("먹는 것");
	   animal.setSound("동물의 소리");
	   animal.printAll();
	   
	   Dog dog = new Dog();
	   dog.setFood("강아지사료");
	   dog.setSound("멍멍멍");
	   dog.setCharacteristic("주인을 잘 따른다");
	   
	   System.out.println();
	   dog.printAll(); //자식 부모메소드 호출 사용
	   
	   
  }  
}
