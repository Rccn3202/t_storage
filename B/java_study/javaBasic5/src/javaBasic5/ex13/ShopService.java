package javaBasic5.ex13;
//�̱��� ��� 1. �ʵ� private �ʱⰪ ��ü������ ���������� �־��  2. ��ü���� private 3. getInstance() public return �������� 
public class ShopService {
	//1. �ʵ� private �ʱⰪ ��ü������ ���������� �־�� 
	private static ShopService s = new ShopService();
	
	//2. ��ü���� private
	private ShopService() { }
	
	//3. getInstance() public return �������� 
	public static ShopService getInstance() {
		return s;
	}
	
	
}
