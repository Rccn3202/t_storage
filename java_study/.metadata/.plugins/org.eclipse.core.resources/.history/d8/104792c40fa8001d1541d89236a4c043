package javaMid10.p480;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("잔금은 " + account.getBalance() );
		
		try {
			int money=15000;
			account.withdraw( money );
			System.out.println("현재 출금된 금액은 " + money + "원 입니다.");
		} catch (InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
	}

}
