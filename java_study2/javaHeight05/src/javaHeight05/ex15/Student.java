package javaHeight05.ex15;

public class Student  implements Comparable<Student>{
   private String id;
   private int score;
   
   @Override
	public int compareTo(Student o) {
	/*	if( score < o.score) return -1; //음수
		else if( score == o.score) return 0;
		else return 1; //양수 또는 return score - o.score */
		return score - o.score; //score = 90 o.score = 96
	}
   
	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
   
	
   
}
