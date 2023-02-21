package javaBasic5.ex13;

public class MemeberMain {

	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong");

		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다");
		}

		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		Printer.println(10); //클래스명.메소드명(매개변수값)
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다 " + obj1 + " " + obj2 );
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
		
		Account account = new Account();
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());
	}
}
