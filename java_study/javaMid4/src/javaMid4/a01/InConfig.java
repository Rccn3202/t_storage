package javaMid4.a01;

public interface InConfig {
    void i1();
    //상수 
    static final double PI=3.14;
    static final boolean OK = true;
    static final int COMPUT_PRICE = 2000000;
    static final int PRINT_PRICE = 500000;
    //디폴트 메소드 - 자바 1.8이후 추가됨 
    default void di1() { }
    default int dd1() { return 0;}
    //정적 메소드 
    static void sd() {  }
    private void a() { }
}
