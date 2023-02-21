package javaMid1.ch07.p293;

public class AA extends A{
   int aa;
   public void setAa(int aa) {
	this.aa = aa;
   }
   public int getAa() {
	return aa;
   }
   public AA() {
	  //부모생성자 호출함
	// super(200); //생략됨 부모의 기본생성자를 호출해라  
	 super();  
	 System.out.println("AA클래스의 기본 생성자");
   }
   public AA(int aa) {
	  System.out.println("AA클래스의 명시적 생성자");
   }
   
}
