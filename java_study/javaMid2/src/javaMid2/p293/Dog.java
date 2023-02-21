package javaMid2.p293;

public  class Dog extends Animal{
    private String characteristic; //특징
    
    public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
    
    public String getCharacteristic() {
		return characteristic;
	}
    
    //부모에게 있는 메소드명과 리턴타입이 동일하지만 내용은 다른 것
    //@Override(재정의) 뜻은 아래에 있는 메소드는 부모에게도 있는 메소드입니다라는 의미
    
    @Override
    public void printAll() {
    	System.out.println( "음식은? " + getFood() );
    	System.out.println( "소리는? " + getSound() );
    	System.out.println( "특징은? " + getCharacteristic() );
    }
	
   }
