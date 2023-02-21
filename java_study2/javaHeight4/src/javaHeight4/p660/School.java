package javaHeight4.p660;

public class School {
    
	private String teacherName;
    private Data2 data2;
    
    
	public School(String teacherName, Data2 data2) {
		super();
		this.teacherName = teacherName;
		this.data2 = data2;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Data2 getData2() {
		return data2;
	}
	public void setData2(Data2 data2) {
		this.data2 = data2;
	}
    
    
}
