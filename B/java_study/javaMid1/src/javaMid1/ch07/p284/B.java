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
	   System.out.println( getAge() ); //�ڽ� �޼ҵ�
	   System.out.println( getPhone() ); // ���θ� �޼ҵ� 
	   System.out.println( getName() ); //�θ� �޼ҵ� 
   }
   
}
