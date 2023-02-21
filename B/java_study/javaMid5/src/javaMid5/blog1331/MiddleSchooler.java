package javaMid5.blog1331;

public class MiddleSchooler extends SungJuk{
   private String teacher;//담당교사명
   private int attendance;//출석점수
   private int servie;//봉사 점수
   
   @Override
	public String toString() {
		return "중학생";
	}
   
   @Override
  	void printAll() {
  		System.out.println("------------");
  		System.out.println("중학교 성적입니다" );
  		System.out.println("--------------");
  		System.out.println("과목명 :"  + getSubject() );
  		System.out.println("담당교사 : " + getTeacher() );
  		System.out.println("시험 : 중간고사 " + getMidtermExam() + ", 기말고사 : " + getFinals() + ", 수행평가 :" + getPerformanceEvalution() + ", 출석점수 " + getAttendance() + ", 봉사점수 :" + getServie() );
  	    System.out.println("점수 : " + getScore() );
     }
   
   
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public int getServie() {
		return servie;
	}
	public void setServie(int servie) {
		this.servie = servie;
	}
   
   
}
