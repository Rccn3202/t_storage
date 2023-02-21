package javaHeight03.ex01;

public class 관리비 {
    private String 호수;
    private int 가족수;
    private int 전기사용량;
    private int 공동요금;
	public String get호수() {
		return 호수;
	}
	public void set호수(String 호수) {
		this.호수 = 호수;
	}
	public int get가족수() {
		return 가족수;
	}
	public void set가족수(int 가족수) {
		this.가족수 = 가족수;
	}
	public int get전기사용량() {
		return 전기사용량;
	}
	public void set전기사용량(int 전기사용량) {
		this.전기사용량 = 전기사용량;
	}
	public int get공동요금() {
		return 공동요금;
	}
	public void set공동요금(int 공동요금) {
		this.공동요금 = 공동요금;
	}
	public 관리비(String 호수, int 가족수, int 전기사용량, int 공동요금) {
		super();
		this.호수 = 호수;
		this.가족수 = 가족수;
		this.전기사용량 = 전기사용량;
		this.공동요금 = 공동요금;
	}
	@Override
	public int hashCode() {
		return 호수.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof 관리비) {
			관리비 m = (관리비) obj;
			return m.호수.equals(this.호수);
		}
		return false;
	}
    
	@Override
	public String toString() {
		return 호수 + " " + 가족수 + " " + 전기사용량 + " " + 공동요금;
	}
    
}
