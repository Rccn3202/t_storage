package javaBasic3.ch06.day01;

public class ClassEx02 {

	public static void main(String[] args) {
		// ������ �����ε� ����
          Student st = new Student();
          Student st1 = new Student("ȫ�浿");
          Student st2 = new Student("010-1234-5678", 100);
          Student st3 = new Student("ȫ�浿", 90);
          Student st4 = new Student(85,"010-7894-5612");
          Student st5 = new Student("ȫ�浿", 100, "5214-8788");
          Student st6 = new Student("010-555-6666");
       //������ ��ġ�� ���� ����� ���� 
	}
}
class Student{
	String name;
	String phone;
	int scores;
	
	public Student() {
		System.out.println("StudentŬ������ �⺻�����κ�");
	}
	
	public Student(String name) {
		this.name = name;
	}
	public Student( String name, int scores) {
		this.scores = scores;
		this.name = name;
	}
	public Student(int scores, String phone) {
		this.scores = scores;
		this.phone = phone;
	}
	public Student(String name,  int scores, String phone) {
		this.name = name;
		this.phone = phone;
		this.scores = scores;
	}
	
	
	
}
