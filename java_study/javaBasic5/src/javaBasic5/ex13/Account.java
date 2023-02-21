package javaBasic5.ex13;

public class Account {
    private int balance; //��å 0<= balance <= 1000000

    // ������ �ڷ��� ����� = �ʱⰪ
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(  balance >= Account.MIN_BALANCE && balance <= Account.MAX_BALANCE  )  
		    this.balance = balance;
	}
	
   //20�� ���� ���� Ǯ��
	
	// ������Ʈ ��ǥ ���� -  ��� ���� �ڵ� �����ϱ�  12�� 10�б��� ���� �����ϰڽ��ϴ�
	// ���� ���� ��ǥ ������ �����鿡�� �ڵ忡 ���Ͽ� ���� �����ϰڽ��ϴ�. �ڵ带 �Ϻ��ϰ� �����ϼž� �մϴ�
	// ��� �������� �ڵ带 �����ؼ� ����� ������ �� �־�� �մϴ�.
	
	//���� ���� ��ǥ ���� 1��-> 2�� -> 3�� -> 4��
	//��ǥ ���� : ������Ʈ ����- ( ī�信 �÷� �� ��(������ǥ)�� �������� �ѹ� �� �о� �ֱ� )
	//          ������Ʈ ����(�����غ���)
	//          ���� ���ͺ� - ��ü ����. �ڵ� ���ص� �׽�Ʈ, ������� ��, ���Ҵ� ��, �� �κ��� ���� �� ���ٵ�
	// �̷��� ������ �����Դϴ�. 
	
	
	
	
   
}
