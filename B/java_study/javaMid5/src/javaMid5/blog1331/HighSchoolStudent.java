package javaMid5.blog1331;

public class HighSchoolStudent extends MiddleSchooler{
	
    private double standardDeviation;//ǥ������

    @Override
    public String toString() {
     	return "����л�";
    }
    
    @Override
  	void printAll() {
  		System.out.println("------------");
  		System.out.println("����б� �����Դϴ�" );
  		System.out.println("--------------");
  		System.out.println("����� :"  + getSubject() );
  		System.out.println("��米�� : " + getTeacher() );
  		System.out.println("���� : �߰���� " + getMidtermExam() + ", �⸻��� : " + getFinals() + ", ������ :" + getPerformanceEvalution() + ", �⼮���� " + getAttendance() + ", �������� :" + getServie() );
  	    System.out.println("���� : " + getScore() );
  	    System.out.println("ǥ������ " + getStandardDeviation());
     }
    
	public double getStandardDeviation() {
		return standardDeviation; 
		
	}
	
	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
}
