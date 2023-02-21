package javaBasic5.day01;

import dao.BookDao;

public class ClassEx01 {

	public static void main(String[] args) {
		Ex01.a(); //정적 메소드 호출은 클래스명.메소드명()
		
		//인스턴스 메소드를 호출하는 방법
        Ex01 ex01 = new Ex01(); //1. 객체생성한다
        ex01.b(); //2. 참조변수명.메소드명()
        
        //패키지 만들기 - 폴더 
        //다른 패키지 안에 있는 클래스 사용한다 ~is a : ~은 ~이다. 강아지는 동물이다.-상속관계 extends, implements
        // ~has a ~은 ~을 가지고 있다. 자동차는 핸들을 가지고 있다.  - 집합관계 가지고 있다 import
        BookDao bookdao = new BookDao();
        bookdao.setName("홍길동") ; //감춘것 - 정보은닉 / 감출 것인 감추고 노출할 것은 노출하기 - 캡슐화
        //접근 제한자 - public, protected, default(package)-아무것 안쓴 것, private
        //싱글톤 - 
        
	}

}

class Ex01{
	
	static int k=100;
	int s=200;
	
	static void a() {
		k=k+200;
		// s = s+ k; 사용 못함 
	}
	
	void b() {
		s = s + 100; 
		k = k + 300;
	}
	
	
	
	
	
}