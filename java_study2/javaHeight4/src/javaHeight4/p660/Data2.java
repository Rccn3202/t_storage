package javaHeight4.p660;

public class Data2 {
   private String gradeBan;//학년반
   private int cnt;//반인원수
	public String getGradeBan() {
		return gradeBan;
	}
	public void setGradeBan(String gradeBan) {
		this.gradeBan = gradeBan;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public Data2(String gradeBan, int cnt) {
		super();
		this.gradeBan = gradeBan;
		this.cnt = cnt;
	}
   
    
}
