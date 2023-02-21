package javaMid10.p480;

public class Account {
    private long balance;//잔고 필드
    public Account() {
		
	}
    
    public long getBalance() {
		return balance;
	}
    
    public void deposit( int money ) {
    	balance += money; //balance = balance + money
    }
    
    public void withdraw( int money) throws InsufficientException {
    	if( balance < money) {
    		throw new InsufficientException( "잔고 부족 " + (money - balance) + "모자람"  );
    	}
    	balance -= money;
    }
}
