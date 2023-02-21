package javaMid5.blog1331;

public class HighSchoolStudent extends MiddleSchooler{
	
    private double standardDeviation;//표준편차

    @Override
    public String toString() {
     	return "고등학생";
    }
    
    @Override
  	void printAll() {
  		System.out.println("------------");
  		System.out.println("고등학교 성적입니다" );
  		System.out.println("--------------");
  		System.out.println("과목명 :"  + getSubject() );
  		System.out.println("담당교사 : " + getTeacher() );
  		System.out.println("시험 : 중간고사 " + getMidtermExam() + ", 기말고사 : " + getFinals() + ", 수행평가 :" + getPerformanceEvalution() + ", 출석점수 " + getAttendance() + ", 봉사점수 :" + getServie() );
  	    System.out.println("점수 : " + getScore() );
  	    System.out.println("표준편차 " + getStandardDeviation());
     }
    
	public double getStandardDeviation() {
		return standardDeviation; 
		
	}
	
	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
}
