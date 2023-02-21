package javaBasic5.ex13;

public class MemeberMain {

	public static void main(String[] args) {
		
		Member user1 = new Member("ȫ�浿", "hong");

		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�");
		}

		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		
		Printer.println(10); //Ŭ������.�޼ҵ��(�Ű�������)
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("ȫ�浿");
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü�Դϴ� " + obj1 + " " + obj2 );
		}else {
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
		}
		
		Account account = new Account();
		account.setBalance(10000);
		System.out.println("���� �ܰ� : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("���� �ܰ� : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("���� �ܰ� : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("���� �ܰ� : " + account.getBalance());
	}
}
