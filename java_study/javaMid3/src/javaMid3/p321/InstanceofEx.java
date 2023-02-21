package javaMid3.p321;

public class InstanceofEx {
   public static void personInfo(Person person) {
	   System.out.println("name :" + person.name);
	   person.walk();
	   //다형성에서 부모객체 받으면 자식 객체로 접근을 못함
	  // System.out.println( person.studentNo );
	   //방법 (Student) person 이렇게 다운 캐스팅하기
	   
	  // Animal animal = new Cat();    
	   // (Cat) animal
	   
	   if(person instanceof Student ) {
		 //person객체의 주소가 Student클래스를 가르킬 수 있으면 참  
		   Student s = (Student) person;
		   System.out.println( s.studentNo );
		   s.study();
	   }
   }
   public static void main(String[] args) {
	  Person p1 = new Person("홍길동");
	  personInfo(p1);
	  System.out.println();
	  
	  Person p2 = new Student("김길동", 10);
	  personInfo(p2);
  }
}
