package javaMid2.p293;

public  class Dog extends Animal{
    private String characteristic; //Ư¡
    
    public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
    
    public String getCharacteristic() {
		return characteristic;
	}
    
    //�θ𿡰� �ִ� �޼ҵ��� ����Ÿ���� ���������� ������ �ٸ� ��
    //@Override(������) ���� �Ʒ��� �ִ� �޼ҵ�� �θ𿡰Ե� �ִ� �޼ҵ��Դϴٶ�� �ǹ�
    
    @Override
    public void printAll() {
    	System.out.println( "������? " + getFood() );
    	System.out.println( "�Ҹ���? " + getSound() );
    	System.out.println( "Ư¡��? " + getCharacteristic() );
    }
	
   }
