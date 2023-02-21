package javaBasic5.ex13;
//싱글톤 모습 1. 필드 private 초기값 객체생성한 참조변수를 넣어라  2. 객체생성 private 3. getInstance() public return 참조변수 
public class ShopService {
	//1. 필드 private 초기값 객체생성한 참조변수를 넣어라 
	private static ShopService s = new ShopService();
	
	//2. 객체생성 private
	private ShopService() { }
	
	//3. getInstance() public return 참조변수 
	public static ShopService getInstance() {
		return s;
	}
	
	
}
