package javaBasic5.ex13;

public class MemberService {

	boolean login( String id, String password) {
	     //id�� hong�̰� password�� 12345�̸� true����
		if( id.equals("hong") && password.equals("12345")) return true;
		else return false;
	}
	
	void logout(String id) {
		// hong�� �α׾ƿ� �Ǿ����ϴ�. ���
		System.out.println( id + "�� �α׾ƿ� �Ǿ����ϴ�.");
	}
	
}
