package singleton;

public class Single {

	private static Single s = new Single();
	
	private Single() {
		
	}  //private�� �ٸ� Ŭ�������� �� ��, �ڱ�Ŭ���������� ��
	
	String now() {
		return "2023-01-25";
	}
	//public���� �� �޼ҵ� 1���� ����� �ش�. �װ��� static���� ���������� �����Ѵ�. 
	public static Single getInstance() {
		return s;
	}
	
}
