package javaMid1.ch07.p284;

public class A extends P {
   private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
   
	public void printM() {
		System.out.println("이름은 " + name);
		System.out.println("전화번호는 " + getPhone() );
		// System.out.println("나이는 " + getAge() );
	}
	
}
