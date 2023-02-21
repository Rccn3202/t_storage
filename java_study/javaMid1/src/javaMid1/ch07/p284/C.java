package javaMid1.ch07.p284;

public class C extends B{
	private String school;
	
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool() {
		return school;
	}
	
	public void printAll() {
		System.out.println( getSchool() );
		System.out.println( getAge() );
		System.out.println( getName() );
		System.out.println( getPhone() );
	}

}
