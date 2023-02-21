package javaMid1.ch07.p284;

public class B extends A{
	
   private int age;
   
   public void setAge(int age) {
	this.age = age;
   }
   
   public int getAge() {
	return age;
   }
   
   public void printMM() {
	   System.out.println( getAge() ); //자신 메소드
	   System.out.println( getPhone() ); // 조부모 메소드 
	   System.out.println( getName() ); //부모 메소드 
   }
   
}
