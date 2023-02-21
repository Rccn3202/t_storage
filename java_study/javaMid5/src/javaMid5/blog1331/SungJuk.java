package javaMid5.blog1331;

public class SungJuk {
	
   private String subject;//과목명
   private int score;//점수
   private int midtermExam;//중간고사
   private int finals;//기말고사
   private int performanceEvalution;//수행평가
   
   void printAll() {
	   //성적 출력 
   }
   
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getMidtermExam() {
		return midtermExam;
	}
	public void setMidtermExam(int midtermExam) {
		this.midtermExam = midtermExam;
	}
	public int getFinals() {
		return finals;
	}
	public void setFinals(int finals) {
		this.finals = finals;
	}
	public int getPerformanceEvalution() {
		return performanceEvalution;
	}
	public void setPerformanceEvalution(int performanceEvalution) {
		this.performanceEvalution = performanceEvalution;
	}
   
   
}
