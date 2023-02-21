package dao;

public class BookDao {
	
   private String name;
   private int age;
   private int score;
   
   public BookDao() {
	// TODO Auto-generated constructor stub
}
   
   
   
public BookDao(String name, int age, int score) {
	super();
	this.name = name;
	this.age = age;
	this.score = score;
}



public BookDao(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}



public BookDao(int age) {
	super();
	this.age = age;
}


public BookDao(String name) {
	super();
	this.name = name;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
   
   
}
