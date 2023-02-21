package javaMid1.ch07.p284;

public class ExtendsEx01 {

	public static void main(String[] args) {
		// 상속
          A a = new A();
          a.setName("홍길동");
          a.setPhone("010-123-1234");
          System.out.println( a.getName() );
          System.out.println( a.getPhone() );
          a.printM();
        //B P클래스 상속 나이 30 전화번호 "010-789-7890" 출력하기
          B b = new B();
          b.setAge(30);
          b.setPhone("010-789-7890");
          System.out.println( b.getAge() );
          System.out.println( b.getPhone() );
          b.printMM();
        // C 필드 school 서울대학교  출력 홍길동, 010-123-1234, 30, 서울대학교
          C c = new C();
          c.setName("이순신");
          c.setPhone("010-123-1234");
          c.setAge(30);
          c.setSchool("서울대학교");
          
          c.printAll();
          
             
          
          
	}
}

