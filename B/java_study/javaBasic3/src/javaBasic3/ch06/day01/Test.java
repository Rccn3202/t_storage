package javaBasic3.ch06.day01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Student1 st1 = new Student1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Name " );
		st1.setName( sc.next() );
		System.out.print("School " );
		st1.setSchool( sc.next() );
		System.out.print("Grade " );
		st1.setGrade( sc.next() );
        
		System.out.println( st1.getName() );
		System.out.println( st1.getSchool() );
		System.out.println( st1.getGrade() );
	}

}
class Student1{
	String name;
	String school;
	String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	} 
	
}
