package singleton;

public class Single {

	private static Single s = new Single();
	
	private Single() {
		
	}  //private는 다른 클래스에서 못 씀, 자기클래스에서만 씀
	
	String now() {
		return "2023-01-25";
	}
	//public으로 된 메소드 1개만 만들어 준다. 그곳은 static으로 참조변수를 리턴한다. 
	public static Single getInstance() {
		return s;
	}
	
}
